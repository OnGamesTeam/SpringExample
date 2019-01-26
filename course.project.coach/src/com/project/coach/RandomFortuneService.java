package com.project.coach;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

    String[] Fortunes;

    @Override
    public String getFortune() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(this.Fortunes.length);
        return Fortunes[randomIndex];
    }

    public void setFortunes(String[] fortunes) {
        Fortunes = fortunes;
    }
}
