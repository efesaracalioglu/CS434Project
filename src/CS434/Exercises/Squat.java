package CS434.Exercises;

import CS434.Member;
import CS434.Muscles.Hamstring;
import CS434.Muscles.Quadriceps;

import java.util.ArrayList;

public class Squat extends Exercise {
    public Squat (Member member, int sets, int reps) {
        super("Squat", member, sets, reps);
    }

    @Override
    public ArrayList<String> getTargetMuscles() {
        ArrayList<String> targetMuscles = new ArrayList<>();

        targetMuscles.add(Quadriceps.TYPE);
        targetMuscles.add(Hamstring.TYPE);

        return targetMuscles;
    }
}