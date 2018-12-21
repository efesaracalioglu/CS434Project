package CS434.Exercises;

import CS434.ICommand;
import CS434.Member;

import java.util.ArrayList;

public abstract class Exercise implements ICommand {
    protected Member member;
    protected String name;
    protected int sets;
    protected int reps;

    Exercise (String name, Member member, int sets, int reps) {
        this.name = name;
        this.member = member;
        this.sets = sets;
        this.reps = reps;
    }

    public void execute() {
        member.getExerciseHistory().add(this);
    }

    public abstract ArrayList<String> getTargetMuscles();

    public int getReps() {
        return reps;
    }

    public int getSets() {
        return sets;
    }

    public String getName() {
        return name;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    @Override
    public String toString () {
        return name+" Sets: "+sets+" Reps: "+reps;
    }
}