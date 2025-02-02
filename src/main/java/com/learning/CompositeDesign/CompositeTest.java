package com.learning.CompositeDesign;

public class CompositeTest {

	public static void main(String... a) {
		Component hd = new Leaf(4000, "Hard drive");
		Component mouse = new Leaf(500, "Mouse");
		Component kb = new Leaf(840, "Keyboard");
		Component monitor = new Leaf(7000, "Monitor");
		Component ram = new Leaf(4000, "ram");
		
		
		Composite peri = new Composite("Periphal");
		Composite mb = new Composite("Mother Board");
		Composite computer = new Composite("Computer");
		
		peri.addComponent(kb);
		peri.addComponent(monitor);
		
		mb.addComponent(ram);
		
		computer.addComponent(mb);
		computer.addComponent(peri);
		
		//ram.showPrice();
		computer.showPrice();
	}
}
