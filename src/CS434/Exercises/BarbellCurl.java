package CS434.Exercises;

import CS434.Muscles.Back;
import CS434.Muscles.Biceps;

import java.util.ArrayList;

public class BarbellCurl extends ExerciseAbstract {
    public static ArrayList<String> getWorkingMuscles(){
        workingMuscles.add(Biceps.type);
        workingMuscles.add(Back.type);
        return workingMuscles;
    }
}
