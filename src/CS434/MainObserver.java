package CS434;

import org.apache.commons.io.monitor.FileAlterationListener;
import org.apache.commons.io.monitor.FileAlterationObserver;

import java.io.File;
import java.util.PriorityQueue;

public abstract class MainObserver implements FileAlterationListener, IObserver {
    private static FileAlterationObserver srcObserver = new FileAlterationObserver(new File(new File("."), "src"));

    private PriorityQueue<ISubscriber> subscribers;
    private String fileName;

    protected MainObserver(String fileName) {
        subscribers = new PriorityQueue<>(20, new SubscriberComparator());

        this.fileName = fileName;

        srcObserver.addListener(this);

        notifyAllSubscribers();
    }

    public static FileAlterationObserver getSrcObserver() {
        return srcObserver;
    }

    @Override
    public void onStart(FileAlterationObserver fileAlterationObserver) {

    }

    @Override
    public void onDirectoryCreate(File file) {

    }

    @Override
    public void onDirectoryChange(File file) {

    }

    @Override
    public void onDirectoryDelete(File file) {

    }

    @Override
    public void onFileCreate(File file) {

    }

    @Override
    public void onFileDelete(File file) {

    }

    @Override
    public void onFileChange(File file) {
        if (file.getName().equals(fileName)) {
            notifyAllSubscribers();
        }
    }

    @Override
    public void onStop(FileAlterationObserver fileAlterationObserver) {

    }

    @Override
    public void notifyAllSubscribers() {
        PriorityQueue<ISubscriber> temp_subscribers = new PriorityQueue<>(getSubscribers());

        while (temp_subscribers.size() > 0) {
            ISubscriber subscriber = temp_subscribers.poll();

            subscriber.update();
        }
    }

    @Override
    public void addSubscriber(ISubscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public PriorityQueue<ISubscriber> getSubscribers() {
        return subscribers;
    }
}