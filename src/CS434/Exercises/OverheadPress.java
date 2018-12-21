package CS434.Exercises;

import CS434.Exercises.ExerciseAbstract;
import CS434.Muscles.Shoulder;
import CS434.Muscles.Triceps;

import java.util.ArrayList;

public class OverheadPress extends ExerciseAbstract {
    private static ArrayList<String> getWorkingMuscles(){
        workingMuscles.add(Shoulder.type);
        workingMuscles.add(Triceps.type);

        return workingMuscles;
    }
}
