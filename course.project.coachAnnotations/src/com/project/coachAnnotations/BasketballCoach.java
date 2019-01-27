package com.project.coachAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

    private FortuneService fortuneService;

    /**
     * Field dependecy injection with autowiring
     * "@Qualifier" serve per specificare quale delle molteplici implementazioni di FortuneService Spring deve utilizzare.
     * Infatti se non fosse specificata, essendoci più implementazioni, Spring non saprebbe quale utilizzare e riporterebbe
     * un errore. "@Qualifier" può essere utilizzato per tutti e tre i metodi di dependecy injection con Annotations.
     */
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService2;

    public BasketballCoach(){}

    /**
     * setter dependecy injection with autowiring
     * In realtà l'autowiring funziona indipendentemente dal nome del metodo.
     * Quindi il dependecy injection può essere realizzato con qualsiasi metodo.
     */
    @Autowired
    @Qualifier("happyFortuneService")
    public void setFortuneService(FortuneService fs){
        this.fortuneService = fs;
    }

    @Override
    public String getDailyWorkout() {
        return "Fai 100 tiri a canestro dalla linea dei 6!";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService2.getFortune();
    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }
}
