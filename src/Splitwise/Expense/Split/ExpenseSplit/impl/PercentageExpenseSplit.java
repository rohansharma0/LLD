package Splitwise.Expense.Split.ExpenseSplit.impl;

import Splitwise.Expense.Split.ExpenseSplit.ExpenseSplit;
import Splitwise.Expense.Split.Split;

import java.util.List;

public class PercentageExpenseSplit implements ExpenseSplit {

    @Override
    public void validateSplitRequest(List<Split> splitList, double totalAmount) throws Exception {
        double sum = 0;
        for(Split split : splitList){
            sum += split.getAmountOwe();
        }
        if(totalAmount != sum) throw new Exception("Amount should be equal after adding all split amount!!");
    }
}
