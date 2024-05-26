package Pattern.AdapterPattern.Adapter;

import Pattern.AdapterPattern.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{

    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine){
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKgs() {
        double weightInPound = weightMachine.getWeightInPound();
        double weightInKgs = weightInPound * 0.45;
        return weightInKgs;
    }
}
