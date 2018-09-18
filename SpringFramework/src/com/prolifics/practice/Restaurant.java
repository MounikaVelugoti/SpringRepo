package com.prolifics.practice;

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
	
	
	IHotDrink hotDrink;
	
	public Restaurant(IHotDrink hotDrink) {

		this.hotDrink = hotDrink;
	}
	
	public void greetCustomer() {

		hotDrink.prepareHotDrink();
	}
}
