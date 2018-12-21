package CS434.Exercises;

import java.util.ArrayList;

public abstract class Exercise implements ICommand {
    protected Member member;

    public void execute() {
        member.getExerciseHistory().add(this);
    }

    public abstract ArrayList<String> getTargetMuscles();
}