package CS434;

public abstract class Constraint {
    protected Member member;

    Constraint(Member member) {
        this.member = member;
    }

    public boolean isMet() {
        return true;
    }

    public Member getMember() {
        return member;
    }
}