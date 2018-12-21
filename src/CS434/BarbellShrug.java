package CS434;

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