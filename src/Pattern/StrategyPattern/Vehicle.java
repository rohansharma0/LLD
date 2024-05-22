package Pattern.StrategyPattern;

import Pattern.StrategyPattern.strategy.DrivingStrategy;

public class Vehicle {
    DrivingStrategy drivingStrategy;

    Vehicle(DrivingStrategy drivingStrategy){
        this.drivingStrategy = drivingStrategy;
    }

    public void drive(){
        this.drivingStrategy.drive();
    }
}
