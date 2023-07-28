package com.luv2code.springdemo;

public class BoxingCoach implements Coach{
	
	//just here to get rid of the default MyApp call error
	public BoxingCoach(){}
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BoxingCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Hit heavy bag for 5 rounds";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
