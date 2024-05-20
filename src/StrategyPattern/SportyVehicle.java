package StrategyPattern;

import StrategyPattern.strategy.AdvanceStrategy;

public class SportyVehicle extends Vehicle{
   public SportyVehicle(){
       super(new AdvanceStrategy());
   }
}
