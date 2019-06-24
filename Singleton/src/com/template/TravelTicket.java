package com.template;

abstract class TravelTicket
{ 
	public int cost; 
	public boolean gotBooked;

	public abstract void bookTicket(); 

	public abstract void pay(); 

	public final void TicketBooked() 
	{ 
		try
		{ 
			System.out.println("Ticket booking successfull with a cost of "+cost); 
		} 
		catch (Exception e) 
		{ 
			System.out.println("Ticket booking unsuccessful"); 
		} 
	} 


	public final void processTicketBooking(boolean gotBooked) 
	{ 
		bookTicket(); 
		pay();
		TicketBooked();
	} 
} 





