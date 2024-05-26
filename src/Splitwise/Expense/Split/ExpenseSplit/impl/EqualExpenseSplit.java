package Splitwise.Expense.Split.ExpenseSplit.impl;

import Splitwise.Expense.Split.ExpenseSplit.ExpenseSplit;
import Splitwise.Expense.Split.Split;

import java.util.List;

public class EqualExpenseSplit implements ExpenseSplit {
    @Override
    public void validateSplitRequest(List<Split> splitList, double totalAmount) throws Exception {
        double amountShouldBePresent = totalAmount/splitList.size();
        for(Split split : splitList){
            if(split.getAmountOwe() != amountShouldBePresent){
                throw new Exception("Amount should be equal!!");
            }
        }
    }
}
