package CS434;

import org.jdesktop.swingx.JXLabel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainFrame extends JFrame implements ISubscriber {
    private static MainFrame ourInstance = new MainFrame();
    Member member;
    Trainer trainer;
    ExerciseInvoker exerciseInvoker;
    private JLabel nameLb;
    private JLabel resultLb;
    private JXLabel planLb;
    private JButton testBt;

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

    public static MainFrame getInstance() {
        return ourInstance;
    }

    private void initialize() {
        MembersData.initializeMembers();
        TrainersData.initializeTrainers();

        member = MembersData.getMembers().get(0);
        trainer = TrainersData.getTrainers().get(0);

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
