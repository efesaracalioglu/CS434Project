package CS434;

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