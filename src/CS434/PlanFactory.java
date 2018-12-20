package CS434;

import java.util.ArrayList;

public class PlanFactory {
    PlanFactory() {

    }

    public ArrayList<Exercise> createPlan(String planString) {
        System.out.println("plan: " + planString);

        ArrayList<Exercise> plan = new ArrayList<>();

        plan.add(new PullUp());

        /*String line;
        StringTokenizer tokenizer = new StringTokenizer(planString);

        while (tokenizer.hasMoreTokens()) {
            line = tokenizer.nextToken();

            System.out.println(line);
        }*/

        return plan;
    }
}