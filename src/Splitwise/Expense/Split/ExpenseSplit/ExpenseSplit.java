package Splitwise.Expense.Split.ExpenseSplit;

import Splitwise.Expense.Split.Split;

import java.util.List;

public interface  ExpenseSplit {
    public void validateSplitRequest(List<Split> splitList, double totalAmount) throws Exception;
}
