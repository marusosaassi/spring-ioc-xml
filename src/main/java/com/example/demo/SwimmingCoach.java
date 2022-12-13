package com.example.demo;

public class SwimmingCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice crawl swimming for 25 minutes";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
