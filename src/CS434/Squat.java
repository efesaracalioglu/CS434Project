package CS434;

import java.util.ArrayList;

public class Squat implements Exercise {
    private Member member;
    private static ArrayList<String> workingMuscles = new ArrayList<>();

    @Override
    public void execute() {
        member.getBeforeDone().add(this);
    }

    public static ArrayList<String> getWorkingMuscles(){
        workingMuscles.add(Quadriceps.type);
        workingMuscles.add(Hamstring.type);

        return workingMuscles;
    }
}
