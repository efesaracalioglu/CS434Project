package CS434.Exercises;

import CS434.Exercises.ExerciseAbstract;
import CS434.Muscles.Triceps;

import java.util.ArrayList;

public class SkullCrusher extends Exercise {
    @Override
    public ArrayList<String> getTargetMuscles() {
        ArrayList<String> targetMuscles = new ArrayList<>();

        targetMuscles.add(Triceps.type);

        return targetMuscles;
    }
}
