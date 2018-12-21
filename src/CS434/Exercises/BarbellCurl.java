package CS434.Exercises;

import CS434.Member;
import CS434.Muscles.Back;
import CS434.Muscles.Biceps;

import java.util.ArrayList;

public class BarbellCurl extends Exercise {
    public BarbellCurl (Member member, int sets, int reps) {
        super("Barbell Curl", member, sets, reps);
    }

    @Override
    public ArrayList<String> getTargetMuscles() {

        ArrayList<String> targetMuscles = new ArrayList<>();
        targetMuscles.add(Biceps.TYPE);
        targetMuscles.add(Back.TYPE);

        return targetMuscles;
    }
}