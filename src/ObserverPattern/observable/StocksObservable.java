package ObserverPattern.observable;

import ObserverPattern.observer.NotificationAlertObserver;

public interface StocksObservable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifyAllObserver();
    public void setStockCount(int newStock);
    public int getStockCount();
}
