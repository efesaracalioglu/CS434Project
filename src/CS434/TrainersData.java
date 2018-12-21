package CS434;

import org.ini4j.Wini;

import java.io.File;
import java.util.ArrayList;

public class TrainersData implements ISubscriber {
    private static TrainersData instance = new TrainersData();
    private static ArrayList<Trainer> trainers = new ArrayList<>();
    private static Wini ini;

    private TrainersData() {
        MemberObserver.getInstance().addSubscriber(this);

        update();
    }

    public static Wini getIni() {
        return ini;
    }

    public static TrainersData getInstance() {
        return instance;
    }

    @Override
    public void update() {
        try {
            ini = new Wini(new File("src\\trainers.ini"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void initializeTrainers() {
        int trainerCount = ini.get("General", "trainerCount", Integer.class);
        for(int i = 0; i < trainerCount; i++) {
            String name = ini.get("Names", Integer.toString(i), String.class);
            System.out.println(name);
            String surname = ini.get("Surnames", Integer.toString(i), String.class);
            System.out.println(surname);
            trainers.add(new Trainer(name, surname));
        }
    }

    public static ArrayList<Trainer> getTrainers() {
        return trainers;
    }
}