package CS434;

import java.util.ArrayList;

public class StiffLegDeadlift extends Exercise {
    @Override
    public ArrayList<String> getTargetMuscles() {
        ArrayList<String> targetMuscles = new ArrayList<>();

        targetMuscles.add(Hamstring.type);

        return targetMuscles;
    }
}
