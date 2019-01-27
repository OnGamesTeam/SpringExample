package com.project.coachAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach myCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(myCoach.getDailyWorkout());

        System.out.println(myCoach.getDailyFortune());

        System.out.println((myCoach.getName()));

        System.out.println((myCoach.getEmail()));

        context.close();
    }
}