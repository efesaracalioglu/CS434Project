package CS434;

import java.util.ArrayList;

public class ExerciseInvoker {
    ArrayList<Exercise> exercises;

    public ExerciseInvoker() {

    }

    public void addExercise(Exercise exercise) {
        exercises.add(exercise);
    }

    public void executeAll() {
        for (Exercise exercise : exercises) {
            exercise.execute();
        }
    }
}