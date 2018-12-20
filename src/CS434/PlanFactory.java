package CS434;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class PlanFactory {
    PlanFactory() {

    }

    public ArrayList<Exercise> createPlan(String planString) {
        ArrayList<Exercise> plan = new ArrayList<>();

        String line;
        StringTokenizer tokenizer = new StringTokenizer(planString);

        while (tokenizer.hasMoreTokens()) {
            line = tokenizer.nextToken();

            System.out.println(line);
        }

        return plan;
    }
}