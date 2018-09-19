package com.prolifics.practice;

import java.util.List;

public class Restaurant {
	/*
	String welcomNote ;
	
	public void setWelcomNote(String welcomNote) {
		this.welcomNote = welcomNote;
	}
	public void greetCustomer() {
		// TODO Auto-generated method stub
		//System.out.println("Hi, welcome to our Restaurant");
		System.out.println(welcomNote);
	}*/
	
	
	/*IHotDrink hotDrink;
	
	public Restaurant(IHotDrink hotDrink) {

		this.hotDrink = hotDrink;
	}
	
	public void greetCustomer() {

		hotDrink.prepareHotDrink();
	}*/
	
	
	private List restaruantWaitersList;
	public void setRestaruantWaitersList(List restaruantWaitersList) {
		this.restaruantWaitersList = restaruantWaitersList;
	}

	public void greetCustomer() {

		System.out.println("All waiters working in Restaruant  :  " + restaruantWaitersList);
	}

}
