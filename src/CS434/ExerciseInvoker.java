package CS434;

import CS434.Exercises.Exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class ExerciseInvoker implements Subscriber {
    private File planFile;
    private ArrayList<Exercise> exercises;
    private ArrayList<String> exercises_str = new ArrayList<>();
    private PlanFactory planFactory;

    public ExerciseInvoker() {
        planFactory = new PlanFactory();

        PlanObserver.getInstance().addSubscriber(this);
        update();
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
            exercises_str = new ArrayList<>();
            BufferedReader bufferedReader = new BufferedReader(reader);

            while (bufferedReader.readLine() != null)
                exercises_str.add(bufferedReader.readLine());

            exercises = planFactory.createPlan(exercises_str);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(this + " is updated.");
    }

    public ArrayList<String> getExercises_str() {
        return exercises_str;
    }

    public boolean isSuitable() {
        return true;
    }
}