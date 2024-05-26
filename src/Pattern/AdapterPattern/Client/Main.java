package Pattern.AdapterPattern.Client;

import Pattern.AdapterPattern.Adaptee.WeightMachineForBabies;
import Pattern.AdapterPattern.Adapter.WeightMachineAdapter;
import Pattern.AdapterPattern.Adapter.WeightMachineAdapterImpl;

public class Main {

    public static void main(String[] args) {

        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKgs());
    }
}
