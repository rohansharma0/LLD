package Pattern.StrategyPattern;

import Pattern.StrategyPattern.strategy.AdvanceStrategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle(){
        super(new AdvanceStrategy());
    }
}
