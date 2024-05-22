package Pattern.ObserverPattern.observer;

import Pattern.ObserverPattern.observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    String emailId;
    StocksObservable stocksObservable;

    public EmailAlertObserverImpl(StocksObservable observable, String emailId){
        this.stocksObservable = observable;
        this.emailId=emailId;
    }

    @Override
    public void update() {
        sendMail(emailId);
    }

    private void sendMail(String emailId) {
        System.out.println("Mail sent to : " + emailId + " - " + "Product is in stock hurry up!!");
    }
}
