package com.learning.BuilderDesign;

public class Shop {

	public static void main(String[] args) {
		Phone p = new Phone("Android", 4, "Qualcom", 5.5, 5000);	
		System.out.println(p.getClass());
		System.out.println(p);
		//That's the old way of creating an object, where we need to know all the constructor parameter values and the sequence (order of appearance).
		
		//Using the Builder Design Pattern, we do not need to know the sequence or all the values of the instance variables.
		Phone p2 = new PhoneBuilder().setOs("Android").setProcessor("Octa Core").getPhone();
		System.out.println(p2);
	}
}
