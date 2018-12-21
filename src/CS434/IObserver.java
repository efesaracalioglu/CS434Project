package CS434;

import java.util.PriorityQueue;

public interface IObserver {
    void addSubscriber(ISubscriber subscriber);
    void notifyAllSubscribers();

    // Priority queue.
    PriorityQueue<ISubscriber> getSubscribers();
}