package com.project.coach;

public class TennisCoach implements Coach{

    private FortuneService fortuneService;

    public TennisCoach(FortuneService fs){
        this.fortuneService = fs;
    }

    @Override
    public String getDailyWorkout(){
        return "Fai 100 rovesci e 50 dritti";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }
<<<<<<< HEAD
=======

    public void coachInitMethod(){
        System.out.println("It's running the init-method");
    }

    public void  coachDestroyMethod(){
        System.out.println("It's running the destroy-method");
    }
>>>>>>> parent of fb7f226... Update
}
