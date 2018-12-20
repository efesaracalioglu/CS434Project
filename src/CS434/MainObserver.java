package CS434;

import org.apache.commons.io.monitor.FileAlterationListener;
import org.apache.commons.io.monitor.FileAlterationObserver;

import java.io.File;
import java.util.ArrayList;

public abstract class MainObserver implements FileAlterationListener, Observer {
    private static FileAlterationObserver srcObserver = new FileAlterationObserver(new File(new File("."), "src"));

    private ArrayList<Subscriber> subscribers;
    private String fileName;

    protected MainObserver(String fileName) {
        this.fileName = fileName;

        subscribers = new ArrayList<>();

        srcObserver.addListener(this);
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
            for (Subscriber subscriber : getSubscribers()) {
                subscriber.update();
            }
        }
    }

    @Override
    public void onStop(FileAlterationObserver fileAlterationObserver) {

    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public ArrayList<Subscriber> getSubscribers() {
        return subscribers;
    }
}