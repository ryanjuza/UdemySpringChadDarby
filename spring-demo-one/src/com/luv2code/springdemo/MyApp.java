package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
//		//create the obj
//		Coach theCoach = new BaseballCoach();
		//create the obj
		Coach theCoach = new BoxingCoach();
		//use the obj
		System.out.println(theCoach.getDailyWorkout());
	}

}
