package com.nauka.spring5.beanScopes;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		return "Plan treningu dla biegania";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
