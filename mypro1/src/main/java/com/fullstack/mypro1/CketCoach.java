package com.fullstack.mypro1;

public class CketCoach implements Coach {
	public String getName() {
		return ("CRICKET");
	}

	public String getDailyWorkout(){
		return ("\nMust Workouts: \n\t\tSquats.\n" + 
				"\t\tSingle leg squat.\n" + 
				"\t\tDeadlift.\n" + 
				"\t\tCork hip lift.\n" + 
				"\t\tPress ups.\n" + 
				"\t\tMedicine ball throws.\n" + 
				"\t\tBent over rows.\n" + 
				"\t\tHang pull.");
	}
	
	public String getDiet() {
		return ("\nDIET PLAN: Eat Wholegrains, fruit, vegetables, dairy products, lean proteins and vegetarian");
	}
}
