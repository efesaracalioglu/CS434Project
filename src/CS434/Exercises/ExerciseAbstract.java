package CS434.Exercises;

import CS434.Exercises.Exercise;
import CS434.Member;

import java.util.ArrayList;

public abstract class ExerciseAbstract implements Exercise {
    protected Member member;
    protected static ArrayList<String> workingMuscles = new ArrayList<>();

    public void execute() {
        member.getBeforeDone().add(this);
    }
}