package CS434;

import org.ini4j.Wini;

import java.io.File;

public class TrainersData implements Subscriber {
    private static TrainersData instance = new TrainersData();
    private static Wini ini;

    private TrainersData() {
        update();
        MemberObserver.getInstance().addSubscriber(this);
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
}