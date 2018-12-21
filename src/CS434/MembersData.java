package CS434;

import org.ini4j.Wini;

import java.io.File;
import java.util.ArrayList;

public class MembersData implements ISubscriber {
    private static MembersData instance = new MembersData();
    private static ArrayList<Member> members = new ArrayList<>();
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

    public static void initializeMembers() {
        int memberCount = ini.get("General", "memberCount", Integer.class);
        for (int i = 0; i < memberCount; i++) {
            String name = ini.get("Names", Integer.toString(i), String.class);
            System.out.println(name);
            String surname = ini.get("Surnames", Integer.toString(i), String.class);
            System.out.println(surname);
            members.add(new Member(name, surname));
        }
    }

    public static ArrayList<Member> getMembers() {
        return members;
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