package com.template;

class TrainTicket extends TravelTicket 
{ 

	public TrainTicket(int cost) {
		this.cost=cost;
	}
	@Override
	public void bookTicket() 
	{ 
		System.out.println("Train ticket processing..."); 
		System.out.println("Proceed to payment...."); 
	} 

	@Override
	public void pay() 
	{ 
		System.out.println ("Payment recieved.Ticket booked "); 
	} 



} 