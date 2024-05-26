package ATM.AmountWithdrawal;

import ATM.ATM;

public abstract class CashWithdrawProcessor {

    CashWithdrawProcessor cashWithdrawProcessor;

    CashWithdrawProcessor(CashWithdrawProcessor cashWithdrawProcessor){
        this.cashWithdrawProcessor = cashWithdrawProcessor;
    }

    public void withdraw(ATM atm , int remainingAmount){
        if(null != this.cashWithdrawProcessor){
            this.cashWithdrawProcessor.withdraw(atm , remainingAmount);
        }
    }
}
