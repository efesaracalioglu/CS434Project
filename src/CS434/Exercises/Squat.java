package CS434.Exercises;

import CS434.Muscles.Hamstring;
import CS434.Muscles.Quadriceps;

import java.util.ArrayList;

public class Squat extends ExerciseAbstract {
    public static ArrayList<String> getWorkingMuscles(){
        workingMuscles.add(Quadriceps.type);
        workingMuscles.add(Hamstring.type);

        return workingMuscles;
    }
}
