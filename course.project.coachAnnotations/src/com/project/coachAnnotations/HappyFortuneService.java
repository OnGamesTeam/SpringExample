package com.project.coachAnnotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Questo è il tuo giorno fortunato!";
    }
}
