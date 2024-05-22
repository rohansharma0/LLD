package Pattern.StrategyPattern;

import Pattern.StrategyPattern.strategy.NormalStrategy;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle(){
        super(new NormalStrategy());
    }
}
