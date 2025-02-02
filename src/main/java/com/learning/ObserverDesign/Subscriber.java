package com.learning.ObserverDesign;

public class Subscriber {

	private String name;
	private Channel channel = new Channel();
	
	public Subscriber(String name) {
		super();
		this.name = name;
	}
	
	public void update() {
		System.out.println("Hey "+ name + ", Video Uploaded :"+ channel.getTitle());
	}
	
	public void subscribeChannel(Channel ch) {
		channel = ch;
	}
}
