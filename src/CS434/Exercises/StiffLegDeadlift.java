package CS434.Exercises;

import CS434.Exercises.ExerciseAbstract;
import CS434.Muscles.Hamstring;

import java.util.ArrayList;

public class StiffLegDeadlift extends Exercise {
    @Override
    public ArrayList<String> getTargetMuscles() {
        ArrayList<String> targetMuscles = new ArrayList<>();

        targetMuscles.add(Hamstring.type);

        return targetMuscles;
    }
}
