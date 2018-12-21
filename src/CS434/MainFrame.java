package CS434;

import CS434.Exercises.Exercise;
import org.jdesktop.swingx.JXLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainFrame extends JFrame implements ISubscriber {
    private static MainFrame ourInstance = new MainFrame();

    Member planMember;
    Trainer trainer;
    ExerciseInvoker exerciseInvoker;
    private JXLabel nameLb;
    private JLabel resultLb;
    private JXLabel planLb;
    private JButton verifyAndApplyButton;

    private MainFrame() {
        programInit();

        // Subscribe all.
        PlanObserver.getInstance().addSubscriber(this);
        MemberObserver.getInstance().addSubscriber(this);
        TrainerObserver.getInstance().addSubscriber(this);

        ///region UI Design
        setSize(600, 600);
        setLocation(100, 100);

        Font font = new Font("Verdana", Font.BOLD, 30);
        Font font_small = new Font("Verdana", Font.BOLD, 20);

        verifyAndApplyButton = new JButton();
        verifyAndApplyButton.setText("Verify and apply!");

        nameLb = new JXLabel();
        nameLb.setLineWrap(true);
        nameLb.setFont(font);
        nameLb.setForeground(Color.WHITE);

        planLb = new JXLabel();
        planLb.setLineWrap(true);
        planLb.setFont(font);
        planLb.setForeground(Color.BLUE);

        resultLb = new JLabel();
        resultLb.setFont(font_small);
        resultLb.setForeground(Color.YELLOW);

        JPanel panel = new JPanel();

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(nameLb);
        panel.add(new JLabel("    "));
        panel.add(planLb);
        panel.add(new JLabel("    "));
        panel.add(verifyAndApplyButton);
        panel.add(new JLabel("    "));
        panel.add(resultLb);
        panel.setBackground(Color.BLACK);

        add(panel);

        setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ///endregion

        // Test button functionality
        verifyAndApplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (exerciseInvoker.isSuitable()) {
                    resultLb.setText("It is appropriate. The plan is executed.");
                    resultLb.setForeground(Color.green);

                    exerciseInvoker.executeAll();
                }
                else {
                    resultLb.setText("This plan is not proper for the user.");
                    resultLb.setForeground(Color.RED);
                }
            }
        });

        // Update once.
        update();
    }

    public static MainFrame getInstance() {
        return ourInstance;
    }

    private void programInit() {
        MembersData.createMembers();
        TrainersData.createTrainers();

        exerciseInvoker = new ExerciseInvoker();
    }

    @Override
    public void update() {
        resultLb.setText("");

        planMember = PlanData.getInstance().getPlanMember();
        trainer = PlanData.getInstance().getPlanTrainer();

        nameLb.setText("Plan for " + planMember + "\nwritten by " + trainer);
        planLb.setText(createPlanText());
    }

    private String createPlanText() {
        String result = "Plan:\n";
        ArrayList<Exercise> exercises = exerciseInvoker.getExercises();

        for (int i = 0; i < exercises.size(); i++) {
            result += exercises.get(i) + "\n";
        }

        return result;
    }

    public ExerciseInvoker getExerciseInvoker() {
        return exerciseInvoker;
    }

    @Override
    public int getPriority() {
        // It has the lowest priority.
        // It shows everything, after all changes.
        return -50;
    }
}