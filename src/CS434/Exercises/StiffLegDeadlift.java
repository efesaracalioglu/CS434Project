package CS434.Exercises;

import CS434.Member;
import CS434.Muscles.Hamstring;

import java.util.ArrayList;

public class StiffLegDeadlift extends Exercise {
    public StiffLegDeadlift (Member member, int sets, int reps) {
        super("Deadlift", member, sets, reps);
    }

    @Override
    public ArrayList<String> getTargetMuscles() {
        ArrayList<String> targetMuscles = new ArrayList<>();

        targetMuscles.add(Hamstring.TYPE);

        return targetMuscles;
    }
}