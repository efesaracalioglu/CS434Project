package CS434;

import java.util.ArrayList;

public class StiffLegDeadlift implements Exercise {
    private Member member;
    private static ArrayList<String> workingMuscles = new ArrayList<>();

    @Override
    public void execute() {
        member.getBeforeDone().add(this);
    }

    public static ArrayList<String> getWorkingMuscles(){
        workingMuscles.add(Hamstring.type);

        return workingMuscles;
    }
}
