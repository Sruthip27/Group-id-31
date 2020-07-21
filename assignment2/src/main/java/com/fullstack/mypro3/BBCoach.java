package com.fullstack.mypro3;

//import org.springframework.stereotype.Component;


public class BBCoach implements Coach{

	@Override
	public String getWorkout() {
		return ("\n\t\tPRACTICE 2 HR DAILY.\n\t\tSQUATS AND HIGH JUMP.");
	}

	@Override
	public String getName() {
		return ("BASEBALL");
	}

}
