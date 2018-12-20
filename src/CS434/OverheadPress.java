package CS434;

import java.util.ArrayList;

public class OverheadPress implements Exercise {
    private Member member;
    private static ArrayList<String> workingMuscles = new ArrayList<>();
    @Override
    public void execute() {
        member.getBeforeDone().add(this);
    }

    private static ArrayList<String> getWorkingMuscles(){
        workingMuscles.add(Shoulder.type);
        workingMuscles.add(Triceps.type);

        return workingMuscles;
    }
}
