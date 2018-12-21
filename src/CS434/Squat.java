package CS434;

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