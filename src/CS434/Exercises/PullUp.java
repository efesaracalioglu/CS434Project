package CS434.Exercises;

import CS434.Exercises.ExerciseAbstract;
import CS434.Muscles.Back;
import CS434.Muscles.Biceps;
import CS434.Muscles.Shoulder;

import java.util.ArrayList;

public class PullUp extends ExerciseAbstract {
    public static ArrayList<String> getWorkingMuscles(){
        workingMuscles.add(Back.type);
        workingMuscles.add(Biceps.type);
        workingMuscles.add(Shoulder.type);

        return workingMuscles;
    }
}
