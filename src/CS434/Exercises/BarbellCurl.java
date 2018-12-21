package CS434.Exercises;

import CS434.Muscles.Back;
import CS434.Muscles.Biceps;

import java.util.ArrayList;

public class BarbellCurl extends Exercise {
    @Override
    public ArrayList<String> getTargetMuscles() {
        ArrayList<String> targetMuscles = new ArrayList<>();
        targetMuscles.add(Biceps.type);
        targetMuscles.add(Back.type);

        return targetMuscles;
    }
}
