package com.learning.AdaptorDesign;

public class School {

	public static void main(String[] args) {
		//PilotPen pp = new PilotPen();
		Pen pp = new PenAdaptor();
		AssignmentWork aw = new AssignmentWork();
		aw.setP(pp);
		aw.writeAssignement("I hate writing assignment");
	}
}
