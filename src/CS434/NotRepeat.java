package CS434;

import CS434.Exercises.Exercise;

import java.util.ArrayList;

public class NotRepeat extends Constraint {
    NotRepeat(Member member) {
        super(member);
    }

    @Override
    public boolean isMet() {
        ArrayList<Exercise> exercises = MainFrame.getInstance().getExerciseInvoker().getExercises();

        for (Exercise exercise : exercises) {
            if (member.getExerciseHistory().contains(exercise))
                return false;
        }

        return true;
    }
}