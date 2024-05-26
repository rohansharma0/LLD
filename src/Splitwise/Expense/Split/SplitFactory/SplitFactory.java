package Splitwise.Expense.Split.SplitFactory;

import Splitwise.Expense.Split.ExpenseSplit.ExpenseSplit;
import Splitwise.Expense.Split.ExpenseSplit.impl.EqualExpenseSplit;
import Splitwise.Expense.Split.ExpenseSplit.impl.PercentageExpenseSplit;
import Splitwise.Expense.Split.ExpenseSplit.impl.UnEqualExpenseSplit;
import Splitwise.Expense.Split.ExpenseSplit.ExpenseSplitType;

public class SplitFactory {

    public static ExpenseSplit getSplitObject(ExpenseSplitType splitType) {
        return switch (splitType) {
            case EQUAL -> new EqualExpenseSplit();
            case UNEQUAL -> new UnEqualExpenseSplit();
            case PERCENTAGE -> new PercentageExpenseSplit();
            default -> null;
        };
    }
}
