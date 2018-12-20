package CS434;

import java.util.ArrayList;

public class ExerciseInvoker implements Subscriber {
    ArrayList<Exercise> exercises;

    public ExerciseInvoker() {
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
        System.out.println(this + " is updated.");
    }
}