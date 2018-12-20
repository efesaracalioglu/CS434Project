package CS434;

import org.apache.commons.io.monitor.FileAlterationMonitor;

import javax.swing.*;

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

        // Initialization
        Member member = new Member("Bekir Onur", "Gölgedar");
        Member member2 = new Member("Emre", "Sümengen");

        Trainer trainer = new Trainer("Efe İbrahim", "Saracalıoğlu");

        ExerciseInvoker exerciseInvoker = new ExerciseInvoker();

        // Printing
        System.out.println(member);
        System.out.println(member2);

        System.out.println(trainer);

        System.out.println(exerciseInvoker);

        // To maintain the program
        JFrame mainFrame = new JFrame();
        mainFrame.setSize(800, 800);
        mainFrame.setLocation(100, 100);
        mainFrame.setVisible(true);
    }
}