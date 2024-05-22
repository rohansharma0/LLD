package Pattern.StrategyPattern;

import Pattern.StrategyPattern.strategy.AdvanceStrategy;

public class SportyVehicle extends Vehicle{
   public SportyVehicle(){
       super(new AdvanceStrategy());
   }
}
