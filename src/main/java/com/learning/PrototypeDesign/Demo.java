package com.learning.PrototypeDesign;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bs = new BookShop();
		bs.setShopName("Novelty");
		bs.loadData(); //This loads the data 
		System.out.println(bs);
		
		//Now we don't want to create a new object instead we want a copy of existing object
		BookShop shop = (BookShop) bs.clone();
		shop.setShopName("A1");
		System.out.println(shop); 
		//This is shallow cloning. What i mean by Shallow cloning ?
		//The moment we make changes in existing original object the changes will also reflected in the cloned object
		
		System.out.println("After removing one book");
		bs.getBooks().remove(2);
		System.out.println(bs); //Here book with id 2 will not be printed
		System.out.println(shop); //Here book with id 2 will not be printed
		
		
		//So what can i be done ?
		//Deep Cloning : In Deep Cloning if we make changes in existing original object it won't be impacted in cloned Object.
		
		//How can we achieve Deep Cloning? 
		//By making necessary changes in the clone method of Cloneable interface
		//Changes like return BookShop with previous books objects
		
		//If you re-run the code you will see the difference --> Changes in existing object doesn't effect the cloned object.
		
	}
}
