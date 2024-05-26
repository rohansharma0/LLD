package Splitwise.Expense;

import Splitwise.BalanceSheetController;
import Splitwise.Expense.Split.ExpenseSplit.ExpenseSplit;
import Splitwise.Expense.Split.ExpenseSplit.ExpenseSplitType;
import Splitwise.Expense.Split.Split;
import Splitwise.Expense.Split.SplitFactory.SplitFactory;
import Splitwise.User.User;

import java.util.List;

public class ExpenseController {
    BalanceSheetController balanceSheetController;

    public ExpenseController(){
        balanceSheetController = new BalanceSheetController();
    }
    public Expense createExpense(String expenseId, String description, double expenseAmount,List<Split> splitDetails, ExpenseSplitType splitType, User paidByUser) throws Exception {

        ExpenseSplit expenseSplit = SplitFactory.getSplitObject(splitType);
        expenseSplit.validateSplitRequest(splitDetails, expenseAmount);
        Expense expense = new Expense(expenseId, expenseAmount, description, paidByUser, splitType, splitDetails);
        balanceSheetController.updateUserExpenseBalanceSheet(paidByUser, splitDetails, expenseAmount);
        return expense;
    }

}
