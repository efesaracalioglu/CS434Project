package CS434;

import CS434.Exercises.*;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class PlanFactory {
    public static ArrayList<Exercise> createPlan(ArrayList<String> planString) {
        ArrayList<Exercise> plan = new ArrayList<>();

        Member member = PlanData.getInstance().getPlanMember();

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
                    plan.add(new BarbellCurl(member, params.get(0), params.get(1)));
                    break;

                case "PULLUP":
                    plan.add(new PullUp(member, params.get(0), params.get(1)));
                    break;

                case "BENCHPRESS":
                    plan.add(new BenchPress(member, params.get(0), params.get(1)));
                    break;

                case "STIFFLEG":
                    plan.add(new StiffLegDeadlift(member, params.get(0), params.get(1)));
                    break;

                case "BARBELLSHRUG":
                    plan.add(new BarbellShrug(member, params.get(0), params.get(1)));
                    break;

                case "SQUAT":
                    plan.add(new Squat(member, params.get(0), params.get(1)));
                    break;

                case "SKULLCRUSHER":
                    plan.add(new SkullCrusher(member, params.get(0), params.get(1)));
                    break;

                case "OVERHEADPRESS":
                    plan.add(new OverheadPress(member, params.get(0), params.get(1)));
                    break;
            }
        }

        return plan;
    }
}