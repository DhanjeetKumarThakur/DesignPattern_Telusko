package com.learning.AdaptorDesign;

public class PenAdaptor implements Pen {

	private PilotPen pp = new PilotPen(); 
	
	@Override
	public void write(String str) {
		// TODO Auto-generated method stub
		pp.mark(str);
	}
	

}
