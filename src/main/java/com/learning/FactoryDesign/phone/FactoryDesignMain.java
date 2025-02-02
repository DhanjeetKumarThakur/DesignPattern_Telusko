package com.learning.FactoryDesign.phone;

public class FactoryDesignMain 
{
	public static void main(String[] args) {
		OperatingSystemFactory osf = new OperatingSystemFactory();
		OS obj = osf.getInstance("Kuch bhi");
		obj.spec();
		System.out.println(obj.getClass());
	}
}
