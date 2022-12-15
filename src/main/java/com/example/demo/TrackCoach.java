package com.example.demo;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TrackCoach() { //empty constructor to avoid error in DemoApplication class
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Fortune: " + fortuneService.getFortune();
    }

    // add an init method
    public void doMyStartUpStuff() {
        System.out.println("Track Coach: inside method doMyStartupStuff");
    }

    // add a destroy method
    public void doMyCleanUpStuff() {
        System.out.println("Track Coach: inside method doMyCleanUpStuff");
    }
}
