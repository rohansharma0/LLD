package StrategyPattern;

import StrategyPattern.strategy.AdvanceStrategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle(){
        super(new AdvanceStrategy());
    }
}
