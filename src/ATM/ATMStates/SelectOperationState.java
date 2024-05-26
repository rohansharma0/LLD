package ATM.ATMStates;

import ATM.ATM;
import ATM.TransactionType;
import ATM.Card;

public class SelectOperationState extends ATMState{

    public SelectOperationState(){
        showOperations();
    }

    @Override
    public void selectOperation(ATM atm, Card card, TransactionType txnType) {
        switch (txnType){
            case BALANCE_CHECK:
                atm.setCurrentATMState(new CheckBalanceState());
                break;
            case CASH_WITHDRAWAL:
                atm.setCurrentATMState(new CashWithdrawalState());
                break;
            default :{
                System.out.println("Invalid Option");
                exit(atm);
            }
        }
    }

    @Override
    public void exit(ATM atm) {
        returnCard();
        atm.setCurrentATMState(new IdleState());
        System.out.println("Exit happens");

    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }
    private void showOperations(){
        System.out.println("Please select the Operation");
        TransactionType.showAllTransactionTypes();
    }

}
