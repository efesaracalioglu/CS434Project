package CS434;

import CS434.Exercises.Exercise;

import java.util.ArrayList;

public class WeakLegs extends Constraint {
    WeakLegs(Member member) {
        super(member);
    }

    @Override
    public boolean isMet() {
        ArrayList<Exercise> exercises = MainFrame.getInstance().getExerciseInvoker().getExercises();

        ArrayList<String> exercise_names = new ArrayList<>();

        for (Exercise exercise : exercises) {
            exercise_names.add(exercise.getName());
        }

        return !(exercise_names.contains("Squat") && exercise_names.contains("Deadlift"));
    }
}