package CS434;

import java.util.ArrayList;

public class StiffLegDeadlift extends ExerciseAbstract {
    public void execute() {
        member.getBeforeDone().add(this);
    }

    public static ArrayList<String> getWorkingMuscles(){
        workingMuscles.add(Hamstring.type);

        return workingMuscles;
    }
}
