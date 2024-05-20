package ObserverPattern;

import ObserverPattern.observable.IphoneObservableImpl;
import ObserverPattern.observable.StocksObservable;
import ObserverPattern.observer.EmailAlertObserverImpl;
import ObserverPattern.observer.MobileAlertObserverImpl;
import ObserverPattern.observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        StocksObservable iphone = new IphoneObservableImpl();
        NotificationAlertObserver observer1 = new EmailAlertObserverImpl(iphone , "iamrohan29@gmail.com");
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl(iphone , "rini@gmail.com");
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl(iphone , "iamRohan29");

        iphone.add(observer1);
        iphone.add(observer2);
        iphone.add(observer3);

        iphone.setStockCount(20);
    }
}