package CS434;

import CS434.Exercises.Exercise;

import java.util.ArrayList;

public class ExerciseInvoker implements ISubscriber {
    private ArrayList<Exercise> exercises;

    public ExerciseInvoker() {
        exercises = new ArrayList<>();

        PlanObserver.getInstance().addSubscriber(this);

        update();
    }

    public void addExercise(Exercise exercise) {
        exercises.add(exercise);
    }

    public void executeAll() {
        if (isSuitable()) {
            for (Exercise exercise : exercises) {
                exercise.execute();
            }
        }
    }

    public boolean isSuitable() {
        for (Constraint constraint:PlanData.getInstance().getPlanMember().getConstraints()) {
            if (constraint != null)
                System.out.println(constraint);
        }

        for (Constraint constraint:PlanData.getInstance().getPlanMember().getConstraints()) {
            if (!constraint.isMet())
                return false;
        }

        return true;
    }

    public ArrayList<Exercise> getExercises() {
        return exercises;
    }

    @Override
    public void update() {
        exercises = PlanFactory.createPlan(PlanData.getInstance().getPlanLines());
    }

    @Override
    public int getPriority() {
        return 0;
    }
}