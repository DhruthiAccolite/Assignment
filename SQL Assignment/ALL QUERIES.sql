create database movie;
use movie;

create table movie(movie_id int primary key,movie_name varchar(20),realease_date date);
create table movie_theatre(theatre_id int primary key,no_of_seats_available int,movie_id int,location varchar(20),foreign key (movie_id) references movie(movie_id));
create table customer(customer_id int primary key,name varchar(20),theatre_id int,no_of_seats_booked int,foreign key (theatre_id) references movie_theatre(theatre_id));

insert into movie values(1,"ABC","2012-01-01"),(2,"ABCD","2012-01-02");
insert into movie_theatre values(1,25,1,"XYZ"),(2,25,2,"VXYZ");
insert into customer values(1,"P",1,5),(2,"Q",2,5);

alter table customer add column price int;

update customer set price=50 where customer_id=1;
update customer set price=50 where customer_id=2;

create trigger ticket_price 
before INSERT 
on 
customer
for each row 
set new.price = new.no_of_seats_booked * 10;

insert into customer(customer_id,name,theatre_id,no_of_seats_booked) values(3,"R",2,2);

desc customer;
select * from customer;

create trigger change_no_of_seats 
after INSERT 
on 
customer
for each row 
update movie_theatre set no_of_seats_available = no_of_seats_available-new.no_of_seats_booked where theatre_id = new.theatre_id;

insert into customer values(4,"S",2,2,5);

select * from customer;
select * from movie_theatre;

create trigger ticket_price_update
before UPDATE 
on 
customer
for each row 
set new.price = new.no_of_seats_booked * 10;

update customer set no_of_seats_booked=5 where customer_id=3;

select * from customer;

create trigger change_no_of_seats_update
after UPDATE
on 
customer
for each row 
update movie_theatre set no_of_seats_available =no_of_seats_available-(new.no_of_seats_booked-old.no_of_seats_booked) where theatre_id = new.theatre_id;

update customer set no_of_seats_booked=6 where customer_id=3;

select * from customer;
select * from movie_theatre;

delimiter //
create trigger concurrent_delete
before delete
on movie
for each row
begin
delete from customer where customer_id in (select cid from (select customer_id as cid from customer  where theatre_id in (select mic from (select theatre_id as mic from movie_theatre where movie_theatre.movie_id=old.movie_id)as m))as c);
delete from movie_theatre where theatre_id in (select mic from (select theatre_id as mic from movie_theatre where movie_theatre.movie_id=old.movie_id) as m);
end ;//

delimiter ;

drop trigger concurrent_delete;

delete from movie where movie_id=1;

select * from movie;
select * from movie_theatre;
select * from customer;

create table movies_deleted(movie_id int primary key,movie_name varchar(20));

create trigger after_delete_trigger
after delete
on movie
for each row
insert into movies_deleted values(old.movie_id,old.movie_name);

delete from movie where movie_id=2;

select * from movie;
select * from movie_theatre;



DELIMITER //
create procedure ticketbooking(
IN customer_id INT,  
IN cust_name VARCHAR(20),  
IN theatre_id INT,
IN no_of_seats_booked INT 
)
begin
insert into customer values( customer_id, cust_name, theatre_id, no_of_seats_booked,no_of_seats_booked*10);
end //
DELIMITER ;

CALL ticketbooking(6,"wededw",1,3);
select * from customer;


DELIMITER //
create procedure viewtickets(
IN customer_id INT
)
begin
select * from customer where customer.customer_id=customer_id;
end //
DELIMITER ;

call viewtickets(1);