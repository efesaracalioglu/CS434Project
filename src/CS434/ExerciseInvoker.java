package CS434;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class ExerciseInvoker implements Subscriber {
    private File planFile;
    private ArrayList<Exercise> exercises;
    private PlanFactory planFactory;

    public ExerciseInvoker() {
        planFactory = new PlanFactory();

        PlanObserver.getInstance().addSubscriber(this);
    }

    public void addExercise(Exercise exercise) {
        exercises.add(exercise);
    }

    public void executeAll() {
        for (Exercise exercise : exercises) {
            exercise.execute();
        }
    }

    @Override
    public String toString() {
        return "Makine Reis [ExerciseInvoker]";
    }

    @Override
    public void update() {
        planFile = new File("src\\plan.txt");

        try {
            FileReader reader = new FileReader(planFile);
            ArrayList<String> exercises = new ArrayList<>();
            BufferedReader bufferedReader = new BufferedReader(reader);

            while (bufferedReader.readLine() != null)
                exercises.add(bufferedReader.readLine());

            planFactory.createPlan(exercises);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(this + " is updated.");
    }
}