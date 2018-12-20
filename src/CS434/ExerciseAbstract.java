package CS434;

import java.util.ArrayList;

public abstract class ExerciseAbstract implements Exercise{
    protected Member member;
    protected static ArrayList<String> workingMuscles = new ArrayList<>();

    public void execute() {
        member.getBeforeDone().add(this);
    }
}