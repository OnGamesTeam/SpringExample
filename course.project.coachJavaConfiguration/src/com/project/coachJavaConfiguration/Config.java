package com.project.coachJavaConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("sport.properties")
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
