package CS434;

import java.util.ArrayList;

public interface IObserver {
    void addSubscriber(ISubscriber subscriber);

    ArrayList<ISubscriber> getSubscribers();
}