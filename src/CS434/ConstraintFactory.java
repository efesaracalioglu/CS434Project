package CS434;

public class ConstraintFactory {
    public static Constraint createConstraint(Integer constraint_integer, Member member) {
        switch (constraint_integer) {
            case 0:
                return new BicepsDisability(member);
            case 1:
                return new HardLearning(member);
            case 2:
                return new WeakLegs(member);
            case 3:
                return new NotRepeat(member);
        }

        return null;
    }
}