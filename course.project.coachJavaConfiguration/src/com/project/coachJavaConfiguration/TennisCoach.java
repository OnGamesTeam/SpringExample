package com.project.coachJavaConfiguration;

public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    public TennisCoach(FortuneService fs){
        this.fortuneService = fs;
    }

    @Override
    public String getDailyWorkout() {
        return "Fai 100 dritti e 50 rovesci";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }
}
