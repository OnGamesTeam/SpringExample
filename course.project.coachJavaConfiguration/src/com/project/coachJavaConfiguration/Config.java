package com.project.coachJavaConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public FortuneService happyFortuneService(){
        return new HappyFortuneService();
    }

    @Bean
    public Coach tennisCoach(){ //id del bean
        return new TennisCoach(happyFortuneService()); //Dependecy Injection
    }
}
