package ObserverPattern.observer;

import ObserverPattern.observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String userName;
    StocksObservable stocksObservable;

    public MobileAlertObserverImpl(StocksObservable observable, String userName){
        this.stocksObservable = observable;
        this.userName=userName;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userName);
    }

    private void sendMsgOnMobile(String emailId) {
        System.out.println("Message sent to : " + userName + " - " + "Product is in stock hurry up!!");
    }
}
