package com.kk.auto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car Car1 = new Car("BMW", "x5",302, 2300);
		Car Car2 = new Car("Volvo", "xc70", 245, 1800);
		Car Car3 = new Car("Opel", "Astra", 115, 1400);
		System.out.println("Svars/Jauda: " + Car1.getMarka() + " " + Car1.getModelis());
		System.out.println(Car1.getSvars()/Car1.getJauda());
		
		
	}

}
