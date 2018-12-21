package CS434.Exercises;

import CS434.Muscles.Back;
import CS434.Muscles.Shoulder;
import CS434.Muscles.Traps;

import java.util.ArrayList;

public class BarbellShrug extends Exercise {
    @Override
    public ArrayList<String> getTargetMuscles() {
        ArrayList<String> targetMuscles = new ArrayList<>();

        targetMuscles.add(Traps.type);
        targetMuscles.add(Shoulder.type);
        targetMuscles.add(Back.type);

        return targetMuscles;
    }
}