package com.project.coach;

public class BasketballCoach implements Coach {

    private FortuneService fortuneService;

    public BasketballCoach(FortuneService fs){
        this.fortuneService = fs;
    }

    @Override
    public String getDailyWorkout(){
        return "Fai 100 tiri dalla linea dei 6";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }


}
