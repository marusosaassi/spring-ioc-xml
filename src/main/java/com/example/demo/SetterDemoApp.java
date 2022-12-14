package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        //load the spring configuration file
        ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext(
                "applicationContext.xml"
            );
        // retrieve bean from spring container
        CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);
        //call methods on the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        //close the context
        context.close();

        //if we run this main. we see that spring calls both no-arg constructor and
        // setter method behind the scenes
    }
}
