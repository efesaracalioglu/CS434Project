package CS434;

import java.util.ArrayList;

public class SkullCrusher implements Exercise {
    private Member member;
    private static ArrayList<String> workingMuscles = new ArrayList<>();

    @Override
    public void execute() {
        member.getBeforeDone().add(this);
    }

    public static ArrayList<String> getWorkingMuscles(){
        workingMuscles.add(Triceps.type);

        return workingMuscles;
    }
}
