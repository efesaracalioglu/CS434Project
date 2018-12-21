package CS434;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class PlanData implements ISubscriber {
    private static PlanData instance = new PlanData();

    private File file;
    private ArrayList<String> plan_lines;
    private Member planMember;
    private Trainer planTrainer;

    private PlanData() {
        PlanObserver.getInstance().addSubscriber(this);

        // Update once.
        update();
    }

    public File getFile() {
        return file;
    }

    public static PlanData getInstance() {
        return instance;
    }

    public ArrayList<String> getPlanLines() {
        return plan_lines;
    }

    public Member getPlanMember () {
        return planMember;
    }

    public Trainer getPlanTrainer () {
        return planTrainer;
    }

    @Override
    public void update() {
        try {
            file = new File("src\\plan.txt");

            try {
                FileReader reader = new FileReader(file);
                plan_lines = new ArrayList<>();
                BufferedReader bufferedReader = new BufferedReader(reader);

                while (bufferedReader.readLine() != null)
                    plan_lines.add(bufferedReader.readLine());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        planMember = MembersData.getMembers().get(Integer.parseInt(Character.toString(plan_lines.get(0).charAt(0))));
        planTrainer = TrainersData.getTrainers().get(Integer.parseInt(Character.toString(plan_lines.get(1).charAt(0))));
    }

    @Override
    public int getPriority() {
        return 10;
    }
}