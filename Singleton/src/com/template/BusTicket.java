package com.template;


class BusTicket extends TravelTicket 
{ 
	public BusTicket(int cost) {
		this.cost=cost;
	}
	@Override
	public void bookTicket() 
	{ 
		System.out.println("Bus ticket processing..."); 
		System.out.println("Proceed to payment...."); 
	} 

	@Override
	public void pay() 
	{ 
		System.out.println ("Payment recieved.Ticket booked "); 
	} 



} 
