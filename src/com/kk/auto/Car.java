package com.kk.auto;

public class Car {
	String Marka;
	String Modelis;
	int Jauda;
	int Svars;
	
	public Car(String string) {
		// TODO Auto-generated constructor stub
	}

	public Car (String marka, String modelis, int jauda, int svars){
		Marka = marka;
		Modelis = modelis;
		Jauda = jauda;
		Svars = svars;
	}
	
	public String getMarka(){
		return Marka;
	}
	
	public String getModelis(){
		return Modelis;
	}
	
	public int getJauda(){
		return Jauda;
	}
	
	public int getSvars(){
		return Svars;
	}
}