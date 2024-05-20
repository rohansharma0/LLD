package StrategyPattern.strategy;

public class NormalStrategy implements DrivingStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Driving");
    }
}
