package com.project.coachJavaConfiguration;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Oggi è il tuo giorno fortunato!";
    }
}
