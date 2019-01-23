package com.project.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //creo un container e carico il file di configurazione xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //recupero il bean
        Coach myCoach = context.getBean("myCoach", Coach.class);
        // a getBean viene passata anche l'interfaccia Coach.class
        // perché così Spring realizza direttamente il Cast

        //chiamo il metodo sul bean
        System.out.println("Workout: " + myCoach.getDailyWorkout());
        System.out.println("Fortune: " + myCoach.getDailyFortune());

        //chiudo il container
        context.close();
    }
}
