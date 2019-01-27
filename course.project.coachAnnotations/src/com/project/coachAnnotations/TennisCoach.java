package com.project.coachAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//Se non viene specificato alcun Id per il bean quello di default in tal caso sarebbe tennisCoach
public class TennisCoach implements  Coach{

    private FortuneService fortuneService;

    /**
     * "@Value" viene utilizzato per l'injection di valori da file .properties
     */
    @Value("${coach.name}")
    private String name;

    @Value("${coach.email}")
    private String email;

    //Constructor dependecy injection with autowiring
    @Autowired
    public TennisCoach(@Qualifier("fileFortuneService") FortuneService fs){
        this.fortuneService=fs;
    }

    @Override
    public String getDailyWorkout() {
        return "Fai 100 rovesci e 50 dritti!";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }

    @Override
    public String getName(){
        return  this.name;
    }

    @Override
    public String getEmail(){
        return  this.email;
    }
}
