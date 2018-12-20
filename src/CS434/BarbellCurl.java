package CS434;

import java.util.ArrayList;

public class BarbellCurl implements Exercise {
    private Member member;
    private static ArrayList<String> workingMuscles = new ArrayList<>();

    @Override
    public void execute() {
        member.getBeforeDone().add(this);
    }

    public static ArrayList<String> getWorkingMuscles(){
        workingMuscles.add(Biceps.type);
        workingMuscles.add(Back.type);
        return workingMuscles;
    }
}
