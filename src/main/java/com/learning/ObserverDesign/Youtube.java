package com.learning.ObserverDesign;

public class Youtube {
	
	public static void main(String[] args) {
		
		Channel telusko  = new Channel();
		
		Subscriber s1 = new Subscriber("Akshay");
		Subscriber s2 = new Subscriber("Harry");
		Subscriber s3 = new Subscriber("Akaya");
		Subscriber s4 = new Subscriber("Shanaya");
		Subscriber s5 = new Subscriber("Akshay Kumar");
		
		telusko.subscribe(s1);
		telusko.subscribe(s2);
		telusko.subscribe(s3);
		telusko.subscribe(s4);
		telusko.subscribe(s5);
		
		s1.subscribeChannel(telusko);
		s2.subscribeChannel(telusko);
		s3.subscribeChannel(telusko);
		s4.subscribeChannel(telusko);
		s5.subscribeChannel(telusko);
		
		telusko.upload("How to code in Java ?");
		
		
	}
}
