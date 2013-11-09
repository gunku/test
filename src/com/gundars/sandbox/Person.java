package com.gundars.sandbox;

public class Person {
	String Name;
	String LastName;
	int Age;
	int Sex; // 1 - male; 2 - female;
	
	public Person (String name, String lastname, int age, int sex){
		Name = name;
		LastName = lastname;
		Age = age;
		Sex = sex;
	}
	
	public String getName(){
		return Name;
	}
	
	public String getLastName(){
		return LastName;
	}
	
	public void setLastName(String lastname){
		String temp;
		if (Sex == 2){
			temp = Person.removeLastChar(lastname);
			temp = temp + "a";
			LastName = temp;
		} else {
			LastName = lastname;			
		}
	}
	
	private static String removeLastChar(String str) {
        return str.substring(0,str.length()-1);
    }
}
