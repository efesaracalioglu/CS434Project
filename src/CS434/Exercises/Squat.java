package CS434.Exercises;

import CS434.Muscles.Hamstring;
import CS434.Muscles.Quadriceps;

import java.util.ArrayList;

public class Squat extends Exercise {
    @Override
    public ArrayList<String> getTargetMuscles() {
        ArrayList<String> targetMuscles = new ArrayList<>();

        targetMuscles.add(Quadriceps.type);
        targetMuscles.add(Hamstring.type);

        return targetMuscles;
    }
}