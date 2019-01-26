package com.project.coach;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String coachEmail;
    private String coachName;

    public CricketCoach(){}

    @Override
    public String getDailyWorkout(){
        return "Non è uno sport quindi non allenarti!";
    }

    @Override
    public String getDailyFortune(){
        return this.fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fs){
        this.fortuneService=fs;
    }

    public void setCoachEmail(String coachEmail) {
        this.coachEmail = coachEmail;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public String getCoachEmail(){
        return this.coachEmail;
    }

    public String getCoachName(){
        return this.coachName;
    }

}
