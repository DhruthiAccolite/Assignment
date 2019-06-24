package com.template;



public class TemplateMethodTicket 
{ 
	public static void main(String[] args) 
	{ 
		BusTicket busTicket = new BusTicket(40); 
		busTicket.processTicketBooking(true);
		System.out.println(); 
		TrainTicket trainTicket = new TrainTicket(50); 
		trainTicket.processTicketBooking(true); 
	} 
} 
