package CS434;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainFrame extends JFrame implements Subscriber{
    private JPanel panel;
    private JLabel nameLb;
    private JLabel resultLb;
    private JPanel planPn;
    private JButton testBt;
    Member member1;
    Member member2;
    Trainer trainer;
    ExerciseInvoker exerciseInvoker;
    private static MainFrame ourInstance = new MainFrame();

    public static MainFrame getInstance() {
        return ourInstance;
    }

    private MainFrame() {
        initialize();
        PlanObserver.getInstance().addSubscriber(this);
        panel = new JPanel();
        setSize(800, 800);
        setLocation(100, 100);
        /*testBt = new JButton();
        nameLb = new JLabel();
        planPn = new JPanel();
        resultLb = new JLabel();
        testBt.setText("Test");
        nameLb.setText("Plan For " + member2.getName() + " " + member2.getSurname());
        planPn = createPlanPanel();

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(nameLb);
        panel.add(planPn);
        panel.add(testBt);
        panel.add(resultLb);*/


        add(panel);
        /*testBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultLb.setText(exerciseInvoker.isSuitable() ? "yes" : "no");
            }
        });*/
        setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initialize() {
        // Initialization
        member1 = new Member("Bekir Onur", "Gölgedar");
        member2 = new Member("Emre", "Sümengen");

        trainer = new Trainer("Efe İbrahim", "Saracalıoğlu");

        exerciseInvoker = new ExerciseInvoker();

        // Printing
        System.out.println(member1);
        System.out.println(member2);

        System.out.println(trainer);

        System.out.println(exerciseInvoker);
    }

    @Override
    public void update() {
        //testBt.setText("Test");
        //nameLb.setText("Plan For " + member2.getName() + " " + member2.getSurname());
        //planPn = createPlanPanel();
        //planPn.updateUI();
        panel = createPlanPanel();
    }

    private JPanel createPlanPanel() {
        JPanel planPanel = new JPanel();
        BoxLayout boxlayout = new BoxLayout(planPanel, BoxLayout.Y_AXIS);
        planPanel.setLayout(boxlayout);

        ArrayList<String> exercises = exerciseInvoker.getExercises_str();
        for (String line : exercises) {
            planPanel.add(new Label(line));
        }
        return planPanel;
    }

}
