package CS434.Exercises;

import CS434.Member;
import CS434.Muscles.Back;
import CS434.Muscles.Shoulder;
import CS434.Muscles.Traps;

import java.util.ArrayList;

public class BarbellShrug extends Exercise {
    public BarbellShrug (Member member, int sets, int reps) {
        super("Barbell Shrug", member, sets, reps);
    }

    @Override
    public ArrayList<String> getTargetMuscles() {
        ArrayList<String> targetMuscles = new ArrayList<>();

        targetMuscles.add(Traps.TYPE);
        targetMuscles.add(Shoulder.TYPE);
        targetMuscles.add(Back.TYPE);

        return targetMuscles;
    }
}