package CS434;

public class MemberObserver extends MainObserver {
    private static MemberObserver instance = new MemberObserver();

    private MemberObserver() {
        super("members.ini");
    }

    public static MemberObserver getInstance() {
        return instance;
    }
}