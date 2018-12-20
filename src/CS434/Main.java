package CS434;

import org.apache.commons.io.monitor.FileAlterationMonitor;

public class Main {
    public static void main(String[] args) {
        // Activate the observers (frequency: 1/2 sec)
        FileAlterationMonitor monitor = new FileAlterationMonitor((long) 500);

        // SrcObserver is come from the library! It is the main observer.
        // Our observers are subscribers of it.
        monitor.addObserver(MainObserver.getSrcObserver());

        try {
            monitor.start();
        } catch (Exception e) {
            e.printStackTrace();
        }


        // To maintain the program
        MainFrame.getInstance();
    }


}