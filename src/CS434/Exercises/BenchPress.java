package CS434.Exercises;

import CS434.Muscles.Chest;
import CS434.Muscles.Triceps;

import java.util.ArrayList;

public class BenchPress extends Exercise {

    @Override
    public ArrayList<String> getTargetMuscles() {
        ArrayList<String> targetMuscles = new ArrayList<>();

        targetMuscles.add(Chest.type);
        targetMuscles.add(Triceps.type);

        return targetMuscles;
    }
}