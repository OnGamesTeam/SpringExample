package com.project.coachJavaConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Coach myCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(myCoach.getDailyWorkout());

        System.out.println(myCoach.getDailyFortune());

        context.close();
    }
}
