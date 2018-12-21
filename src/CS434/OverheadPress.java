package CS434;

import java.util.ArrayList;

public class OverheadPress extends Exercise {
    @Override
    public ArrayList<String> getTargetMuscles() {
        ArrayList<String> targetMuscles = new ArrayList<>();

        targetMuscles.add(Shoulder.type);
        targetMuscles.add(Triceps.type);

        return targetMuscles;
    }
}
