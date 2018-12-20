package CS434;

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
        planFile = new File("plan.txt");

        try {
            FileReader reader = new FileReader(planFile);
            planFactory.createPlan(reader.read);
        } catch (Exception e) {

        }

        System.out.println(this + " is updated.");
    }
}