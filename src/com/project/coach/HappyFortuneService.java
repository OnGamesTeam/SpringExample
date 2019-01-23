package com.project.coach;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Questo è il tuo giorno fortunato!";
    }
}
