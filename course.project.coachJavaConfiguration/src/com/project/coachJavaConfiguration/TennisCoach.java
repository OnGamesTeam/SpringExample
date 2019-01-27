package com.project.coachJavaConfiguration;

import org.springframework.beans.factory.annotation.Value;

public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    @Value("${coach.name}")
    String name;

    @Value("${coach.email}")
    String email;

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


    @Override
    public String getCoachName() {
        return this.name;
    }

    @Override
    public String getCoachEmail() {
        return this.email;
    }
}
