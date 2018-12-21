package CS434;

import javax.print.DocFlavor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import org.jdesktop.swingx.JXLabel;

public class MainFrame extends JFrame implements Subscriber{
    private JLabel nameLb;
    private JLabel resultLb;
    private JXLabel planLb;
    private JButton testBt;
    Member member;
    Trainer trainer;
    ExerciseInvoker exerciseInvoker;
    private static MainFrame ourInstance = new MainFrame();

    public static MainFrame getInstance() {
        return ourInstance;
    }

    private MainFrame() {
        initialize();
        PlanObserver.getInstance().addSubscriber(this);
        JPanel panel = new JPanel();
        setSize(800, 800);
        setLocation(100, 100);
        testBt = new JButton();
        nameLb = new JLabel();
        planLb = new JXLabel();
        planLb.setLineWrap(true);
        resultLb = new JLabel();
        testBt.setText("Test");
        nameLb.setText("Plan For " + member.getName() + " " + member.getSurname());
        planLb.setText(createPlanPanel());

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(nameLb);
        panel.add(planLb);
        panel.add(testBt);
        panel.add(resultLb);

        add(panel);
        testBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultLb.setText(exerciseInvoker.isSuitable() ? "yes" : "no");
            }
        });
        setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        update();
    }

    private void initialize() {
        MembersData.initializeMembers();
        member = MembersData.getMembers().get(0);
        trainer = new Trainer("Efe İbrahim", "Saracalıoğlu");

        exerciseInvoker = new ExerciseInvoker();

        // Printing

        System.out.println(trainer);

        System.out.println(exerciseInvoker);
    }

    @Override
    public void update() {
        testBt.setText("Test");
        nameLb.setText("Plan For " + member.getName() + " " + member.getSurname());
        planLb.setText(createPlanPanel());
        planLb.updateUI();

    }

    private String createPlanPanel() {
        String result = "";
        ArrayList<String> exercises = exerciseInvoker.getExercises_str();
        for (int i = 2; i < exercises.size(); i++) {
            System.out.println(exercises.get(i));
            result += exercises.get(i) + "\n";
        }
        return result;
    }

}
