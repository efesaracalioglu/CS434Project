package CS434;

import java.util.ArrayList;

public class SkullCrusher extends Exercise {
    @Override
    public ArrayList<String> getTargetMuscles() {
        ArrayList<String> targetMuscles = new ArrayList<>();

        targetMuscles.add(Triceps.type);

        return targetMuscles;
    }
}
