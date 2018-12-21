package CS434.Exercises;

import CS434.Muscles.Chest;
import CS434.Muscles.Triceps;

import java.util.ArrayList;

public class BenchPress extends ExerciseAbstract {
    public static ArrayList<String> getWorkingMuscles(){
        workingMuscles.add(Chest.type);
        workingMuscles.add(Triceps.type);

        return workingMuscles;
    }
}
