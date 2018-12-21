package CS434;

import CS434.Exercises.Exercise;

import java.util.ArrayList;

public class HardLearning extends Constraint {
    HardLearning(Member member) {
        super(member);
    }

    @Override
    public boolean isMet() {
        ArrayList<Exercise> exercises = MainFrame.getInstance().getExerciseInvoker().getExercises();

        ArrayList<String> exercises_have = new ArrayList<>();
        ArrayList<String> exercises_counted = new ArrayList<>();

        for (Exercise exercise : exercises) {
            if (!exercises_have.contains(exercise.getName())) {
                exercises_counted.add(exercise.getName());
            }

            exercises_have.add(exercise.getName());
        }

        System.out.println(exercises_counted.size());
        if (exercises_counted.size() > 2)
            return false;
        else
            return true;
    }
}