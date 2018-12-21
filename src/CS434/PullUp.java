package CS434;

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
