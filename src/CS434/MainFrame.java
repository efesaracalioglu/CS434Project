package CS434;

import javax.swing.*;

public class MainFrame extends JFrame {
    private static MainFrame ourInstance = new MainFrame();

    public static MainFrame getInstance() {
        return ourInstance;
    }

    private MainFrame() {
        setSize(800, 800);
        setLocation(100, 100);
        setVisible(true);
    }
}
