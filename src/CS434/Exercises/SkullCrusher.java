package CS434.Exercises;

import CS434.Member;
import CS434.Muscles.Triceps;

import java.util.ArrayList;

public class SkullCrusher extends Exercise {
    public SkullCrusher (Member member, int sets, int reps) {
        super("Skull Crusher", member, sets, reps);
    }

    @Override
    public ArrayList<String> getTargetMuscles() {
        ArrayList<String> targetMuscles = new ArrayList<>();

        targetMuscles.add(Triceps.TYPE);

        return targetMuscles;
    }
}
