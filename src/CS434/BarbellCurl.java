package CS434;

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
