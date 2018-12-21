package CS434;

import org.ini4j.Wini;

import java.io.File;
import java.util.ArrayList;

public class MembersData implements ISubscriber {
    private static MembersData instance = new MembersData();
    private static ArrayList<Member> members = new ArrayList<>();
    private static Wini ini;

    private MembersData() {
        MemberObserver.getInstance().addSubscriber(this);

        update();
    }

    public static Wini getIni() {
        return ini;
    }

    public static MembersData getInstance() {
        return instance;
    }

    public static void createMembers() {
        int memberCount = ini.get("General", "memberCount", Integer.class);

        for (int i = 0; i < memberCount; i++) {
            String name = ini.get("Names", Integer.toString(i), String.class);
            String surname = ini.get("Surnames", Integer.toString(i), String.class);
            Member member = new Member(name, surname);

            loadConstraints(member);

            members.add(member);
        }
    }

    public static void loadConstraints(Member member) {
        String constraintSet = ini.get("Constraints", Integer.toString(member.getID()), String.class);
        constraintSet = String.copyValueOf(constraintSet.toCharArray(), 1, constraintSet.length() - 2);

        int value = 0;
        while (value < constraintSet.length()) {
            Constraint constraint;

            Integer constraint_int = Integer.parseInt(String.copyValueOf(constraintSet.toCharArray(), value, 1));
            constraint = ConstraintFactory.createConstraint(constraint_int, member);

            member.addConstraints(constraint);

            value += 3;
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

    @Override
    public int getPriority() {
        return 0;
    }
}