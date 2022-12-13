package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        //load the Spring configuration file
        ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        //(beanId, interface) = ("myCoach, Coach.class);

        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        //let's call our own method for fortune
        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
