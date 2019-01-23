package com.project.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //creo un container e carico il file di configurazione xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //recupero il bean
        //per provare il dependencies injection da setter o di valori "letterali" sostituire "Coach.class" con "CricketCoach.class",
        //inserire, nel tag class del bean "myCoach" nell'applicationContext, CricketCoach e decommentare i due metodi per CricketCoach sotto.
        Coach myCoach = context.getBean("myCricketCoach", CricketCoach.class);
        // a getBean viene passata anche l'interfaccia Coach.class
        // perché così Spring realizza direttamente il Cast

        //chiamo il metodo sul bean
        System.out.println("Workout: " + myCoach.getDailyWorkout());
        System.out.println("Fortune: " + myCoach.getDailyFortune());

        //metodi per CricketCoach
        System.out.println(((CricketCoach) myCoach).getCoachEmail());
        System.out.println(((CricketCoach) myCoach).getCoachName());

        //chiudo il container
        context.close();
    }
}
