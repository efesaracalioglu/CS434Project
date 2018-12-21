package CS434.Exercises;

import CS434.Member;
import CS434.Muscles.Back;
import CS434.Muscles.Biceps;
import CS434.Muscles.Shoulder;

import java.util.ArrayList;

public class PullUp extends Exercise {
    public PullUp (Member member, int sets, int reps) {
        super("Pull Up", member, sets, reps);
    }

    @Override
    public ArrayList<String> getTargetMuscles() {
        ArrayList<String> targetMuscles = new ArrayList<>();

        targetMuscles.add(Back.TYPE);
        targetMuscles.add(Biceps.TYPE);
        targetMuscles.add(Shoulder.TYPE);

        return targetMuscles;
    }
}
