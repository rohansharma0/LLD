package ObserverPattern.observable;

import ObserverPattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable {
    public int stockCount = 0;
    List<NotificationAlertObserver> notificationAlertObservers = new ArrayList<>();

    @Override
    public void add(NotificationAlertObserver observer) {
        this.notificationAlertObservers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        this.notificationAlertObservers.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        for(NotificationAlertObserver observer : notificationAlertObservers){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStock) {
        this.stockCount = this.stockCount + newStock;
        this.notifyAllObserver();
    }

    @Override
    public int getStockCount() {
        return this.stockCount;
    }
}
