package CS434;

public class TrainerObserver extends MainObserver {
    private static TrainerObserver instance = new TrainerObserver();

    private TrainerObserver() {
        super("trainers.ini");
    }

    public static TrainerObserver getInstance() {
        return instance;
    }
}