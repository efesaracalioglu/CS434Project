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
    Member member;
    Trainer trainer;
    ExerciseInvoker exerciseInvoker;
    private JXLabel nameLb;
    private JLabel resultLb;
    private JXLabel planLb;
    private JButton testBt;

    private MainFrame() {
        initialize();

        PlanObserver.getInstance().addSubscriber(this);
        MemberObserver.getInstance().addSubscriber(this);
        TrainerObserver.getInstance().addSubscriber(this);

        setSize(600, 600);
        setLocation(100, 100);

        Font font = new Font("Verdana", Font.BOLD, 30);
        Font font_small = new Font("Verdana", Font.BOLD, 20);

        testBt = new JButton();
        testBt.setText("Test the plan!");

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
        panel.add(testBt);
        panel.add(new JLabel("    "));
        panel.add(resultLb);
        panel.setBackground(Color.BLACK);

        add(panel);
        testBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (exerciseInvoker.isSuitable()) {
                    resultLb.setText("It is appropriate.");
                    resultLb.setForeground(Color.green);
                }
                else {
                    resultLb.setText("This plan is not proper for the user.");
                    resultLb.setForeground(Color.RED);
                }
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
        MembersData.createMembers();
        TrainersData.createTrainers();

        exerciseInvoker = new ExerciseInvoker();
    }

    @Override
    public void update() {
        resultLb.setText("");

        member = PlanData.getInstance().getPlanMember();
        trainer = PlanData.getInstance().getPlanTrainer();

        nameLb.setText("Plan for " + member+"\nwritten by "+trainer);
        planLb.setText(createPlanText());

        planLb.updateUI();
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
        return -50;
    }
}