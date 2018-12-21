package CS434.Exercises;

import CS434.Member;
import CS434.Muscles.Chest;
import CS434.Muscles.Triceps;

import java.util.ArrayList;

public class BenchPress extends Exercise {
    public BenchPress (Member member, int sets, int reps) {
        super("Bench Press", member, sets, reps);
    }

    @Override
    public ArrayList<String> getTargetMuscles() {
        ArrayList<String> targetMuscles = new ArrayList<>();

        targetMuscles.add(Chest.TYPE);
        targetMuscles.add(Triceps.TYPE);

        return targetMuscles;
    }
}