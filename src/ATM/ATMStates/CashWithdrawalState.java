package ATM.ATMStates;

import ATM.ATM;
import ATM.AmountWithdrawal.CashWithdrawProcessor;
import ATM.AmountWithdrawal.FiveHundredWithdrawProcessor;
import ATM.AmountWithdrawal.OneHundredWithdrawProcessor;
import ATM.AmountWithdrawal.TwoThousandWithdrawProcessor;
import ATM.Card;

public class CashWithdrawalState extends ATMState{

    public CashWithdrawalState() {
        System.out.println("Please enter the Withdrawal Amount");
    }

    @Override
    public void cashWithdrawal(ATM atm, Card card, int withdrawAmount) {
        if(card.getBankBalance() < withdrawAmount){
            System.out.println("Insufficient fund in the your Bank Account");
            exit(atm);
        }else if(atm.getAtmBalance() < withdrawAmount){
            System.out.println("Insufficient fund in the ATM Machine");
            exit(atm);
        }else{
            card.deductBankBalance(withdrawAmount);
            atm.deductATMBalance(withdrawAmount);

            CashWithdrawProcessor withdrawProcessor = new TwoThousandWithdrawProcessor(new FiveHundredWithdrawProcessor(new OneHundredWithdrawProcessor(null)));

            withdrawProcessor.withdraw(atm , withdrawAmount);
            exit(atm);
        }
    }

    @Override
    public void exit(ATM atmObject) {
        returnCard();
        atmObject.setCurrentATMState(new IdleState());
        System.out.println("Exit happens");
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }
}
