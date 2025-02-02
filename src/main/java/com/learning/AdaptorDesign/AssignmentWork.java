package com.learning.AdaptorDesign;

public class AssignmentWork {

	private Pen p;
	
	public Pen getP() {
		return p;
	}

	public void setP(Pen p) {
		this.p = p;
	}


	public void writeAssignement(String str) {
		p.write(str);
	}
}
