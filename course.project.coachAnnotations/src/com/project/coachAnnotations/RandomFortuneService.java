package com.project.coachAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    @Value("${fortunes.array}")
    private String[] data;

    private Random myRandom = new Random();



    @Override
    public String getFortune() {
        int index = this.myRandom.nextInt(this.data.length);
        return data[index];
    }
}
