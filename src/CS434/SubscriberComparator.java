package CS434;

import java.util.Comparator;

public class SubscriberComparator implements Comparator<ISubscriber> {
    @Override
    public int compare(ISubscriber o1, ISubscriber o2) {
        return  o2.getPriority() - o1.getPriority();
    }
}
