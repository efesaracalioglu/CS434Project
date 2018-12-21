package CS434.Exercises;

import CS434.Exercises.ExerciseAbstract;
import CS434.Muscles.Back;
import CS434.Muscles.Biceps;
import CS434.Muscles.Shoulder;

import java.util.ArrayList;

public class PullUp extends Exercise {
    @Override
    public ArrayList<String> getTargetMuscles() {
        ArrayList<String> targetMuscles = new ArrayList<>();

        targetMuscles.add(Back.type);
        targetMuscles.add(Biceps.type);
        targetMuscles.add(Shoulder.type);

        return targetMuscles;
    }
}
