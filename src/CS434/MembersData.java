package CS434;

import org.ini4j.Wini;

import java.io.File;

public class MembersData implements Subscriber {
    private static MembersData instance = new MembersData();
    private static Wini ini;

    private MembersData() {
        update();
        MemberObserver.getInstance().addSubscriber(this);
    }

    public static Wini getIni() {
        return ini;
    }

    public static MembersData getInstance() {
        return instance;
    }

    @Override
    public void update() {
        try {
            ini = new Wini(new File("src\\members.ini"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}