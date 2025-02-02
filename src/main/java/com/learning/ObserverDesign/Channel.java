package com.learning.ObserverDesign;

import java.util.ArrayList;
import java.util.List;

public class Channel {
	
	List<Subscriber> subs = new ArrayList<>();
	private String title;
	
	
	public List<Subscriber> getSubs() {
		return subs;
	}
	public void setSubs(List<Subscriber> subs) {
		this.subs = subs;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void subscribe(Subscriber sub) {
		subs.add(sub);
	}
	public void unSubscribe(Subscriber sub) {
		subs.remove(sub);
	}

	public void notifySubscriber() {
		for(Subscriber sub: subs) {
			sub.update();
		}
	}
	
	public void upload(String title) {
		this.title = title;
		notifySubscriber();
	}
}
