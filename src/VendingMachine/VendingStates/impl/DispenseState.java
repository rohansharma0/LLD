package VendingMachine.VendingStates.impl;

import VendingMachine.VendingMachine;
import VendingMachine.Coin;
import VendingMachine.Item;
import VendingMachine.VendingStates.VendingState;

import java.util.List;

public class DispenseState implements VendingState{

    DispenseState(VendingMachine machine, int codeNumber) throws Exception{

        System.out.println("Currently Vending machine is in DispenseState");
        dispenseProduct(machine, codeNumber);
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("insert coin button can not clicked on Dispense state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("first you need to click on insert coin button");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("you can not insert Coin in idle state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("you can not choose Product in idle state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("you can not get change in idle state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        throw new Exception("you can not get refunded in idle state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("Product has been dispensed");
        Item item = machine.getInventory().getItem(codeNumber);
        machine.getInventory().updateSoldOutItem(codeNumber);
        machine.setVendingMachineState(new IdleState(machine));
        return item;
    }

    @Override
    public void updateInventory(VendingMachine machine,Item item, int codeNumber) throws Exception {
        throw new Exception("inventory can not be updated in Dispense state");
    }
}
