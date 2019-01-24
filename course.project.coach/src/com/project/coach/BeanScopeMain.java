package com.project.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeMain {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach CoachOne = context.getBean("myCoach", Coach.class);

        Coach CoachTwo = context.getBean("myCoach", Coach.class);

        boolean result = (CoachOne == CoachTwo);

        System.out.println("I due Coach sono la stessa istanza? " + result);

        System.out.println("Locazione di memoria CoachOne: " + CoachOne);

        System.out.println("Locazione di memoria CoachTwo: "+ CoachTwo);

        context.close();
    }
}
