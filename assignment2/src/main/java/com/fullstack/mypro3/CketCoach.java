package com.fullstack.mypro3;

public class CketCoach implements Coach {
	@Override
	public String getWorkout() {
		return ("\n\t\tRUN 1KM DAILY.\n\t\tPRACTICE 1-2 HR DAILY.");
	}

	@Override
	public String getName() {
		return ("CRICKET");
	}
}
