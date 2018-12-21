package CS434.Exercises;

import CS434.Muscles.Back;
import CS434.Muscles.Shoulder;
import CS434.Muscles.Traps;

import java.util.ArrayList;

public class BarbellShrug extends ExerciseAbstract {

    public static ArrayList<String> getWorkingMuscles(){
        workingMuscles.add(Traps.type);
        workingMuscles.add(Shoulder.type);
        workingMuscles.add(Back.type);
        return workingMuscles;
    }
}