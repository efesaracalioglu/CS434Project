package CS434;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class PlanFactory {
    PlanFactory() {

    }

    public ArrayList<ICommand> createPlan(ArrayList<String> planString) {
        ArrayList<ICommand> plan = new ArrayList<>();

        for (int i = 2; i < planString.size(); i++) {
            String exercise_str = planString.get(i);
            StringTokenizer tokenizer = new StringTokenizer(exercise_str);

            String exercise_type;
            ArrayList<Integer> params = new ArrayList<>();

            exercise_type = tokenizer.nextToken();
            while (tokenizer.hasMoreTokens())
                params.add(Integer.parseInt(tokenizer.nextToken()));

            switch (exercise_type) {
                case "BARBELLCURL":
                    plan.add(new BarbellCurl());
                    break;

                case "PULLUP":
                    plan.add(new PullUp());
                    break;

                case "BENCHPRESS":
                    plan.add(new BenchPress());
                    break;

                case "STIFFLEG":
                    plan.add(new StiffLegDeadlift());
                    break;

                case "BARBELLSHRUG":
                    plan.add(new BarbellShrug());
                    break;

                case "SQUAT":
                    plan.add(new Squat());
                    break;

                case "SKULLCRUSHER":
                    plan.add(new SkullCrusher());
                    break;
            }

            System.out.println(plan.get(plan.size() - 1));
        }

        return plan;
    }
}