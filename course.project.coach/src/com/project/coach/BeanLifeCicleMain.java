package com.project.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCicleMain {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCicle-applicationContext.xml");

        /** da notare come nell'output sia eseguito prima l'init-method, quindi viene stampato il risultato di getDailyWorkout
         * e infine viene eseguito il destroy-method
         */


        Coach myCoach = context.getBean("myCoach", Coach.class);

        System.out.println("Workout: " + myCoach.getDailyWorkout());

        context.close();
    }
}
