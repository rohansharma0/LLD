package VendingMachine;

import VendingMachine.VendingStates.VendingState;
import VendingMachine.VendingStates.impl.IdleState;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private VendingState vendingMachineState;
    public Inventory inventory;
    public List<Coin> coinList;

    public VendingMachine(){
        vendingMachineState = new IdleState();
        inventory = new Inventory(10);
        coinList = new ArrayList<>();
    }

    public VendingState getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(VendingState vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }
}
