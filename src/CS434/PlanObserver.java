package CS434;

public class PlanObserver extends MainObserver {
    private static PlanObserver instance = new PlanObserver();

    private PlanObserver() {
        super("plan.txt");
    }

    public static PlanObserver getInstance() {
        return instance;
    }
}