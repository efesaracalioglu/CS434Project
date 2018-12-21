package CS434.Exercises;

import CS434.Member;
import CS434.Muscles.Shoulder;
import CS434.Muscles.Triceps;

import java.util.ArrayList;

public class OverheadPress extends Exercise {
    public OverheadPress (Member member, int sets, int reps) {
        super("Overhead Press", member, sets, reps);
    }

    @Override
    public ArrayList<String> getTargetMuscles() {
        ArrayList<String> targetMuscles = new ArrayList<>();

        targetMuscles.add(Shoulder.TYPE);
        targetMuscles.add(Triceps.TYPE);

        return targetMuscles;
    }
}