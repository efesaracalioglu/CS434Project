package CS434;

import java.util.ArrayList;

public class BarbellShrug implements Exercise {
    private Member member;
    private static ArrayList<String> workingMuscles = new ArrayList<>();
    @Override
    public void execute() {
        member.getBeforeDone().add(this);
    }

    public static ArrayList<String> getWorkingMuscles(){
        workingMuscles.add(Traps.type);
        workingMuscles.add(Shoulder.type);
        workingMuscles.add(Back.type);
        return workingMuscles;
    }
}