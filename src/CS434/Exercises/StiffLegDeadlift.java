package CS434.Exercises;

import CS434.Exercises.ExerciseAbstract;
import CS434.Muscles.Hamstring;

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
