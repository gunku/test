package com.gundars.sandbox;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person Person1 = new Person("Janis", "Liepins", 21, 1);
		Person Person2 = new Person("Zane", "LiepiÀa", 20, 2);
		System.out.println("Uzv‚rds pirms k‚z‚m");
		System.out.println(Person2.getLastName());
		// Cilv•ki aprecaas, sieva pieÀem v´ra uzv‚rdu
		Person2.setLastName(Person1.getLastName());
		System.out.println("Uzv‚rds p•c k‚z‚m");
		System.out.println(Person2.getLastName());		
	}

	
}
