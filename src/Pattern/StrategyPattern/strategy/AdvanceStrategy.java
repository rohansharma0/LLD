package Pattern.StrategyPattern.strategy;

public class AdvanceStrategy implements DrivingStrategy {
    @Override
    public void drive() {
        System.out.println("Advance Driving");
    }
}
