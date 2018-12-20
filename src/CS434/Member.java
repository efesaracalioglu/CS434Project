package CS434;

import java.util.ArrayList;

public class Member implements Subscriber {
    private static int maxID = -1;
    private int id;
    private String name;
    private String surname;
    private ArrayList<ExerciseAbstract> beforeDoneExercises;

    public Member(String name, String surname) {
        this.setName(name);
        this.setSurname(surname);

        this.id = maxID + 1;
        maxID = id;

        MemberObserver.getInstance().addSubscriber(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getID() {
        return this.id;
    }

    public ArrayList<ExerciseAbstract> getBeforeDone(){

        return beforeDoneExercises;
    }

    @Override
    public void update() {
        System.out.println("Member " + getID() + " is updated.");

        String newName = MembersData.getIni().get("Names", Integer.toString(getID()), String.class);
        System.out.println(newName);

        setName(newName);
    }

    @Override
    public String toString() {
        return name + " " + surname + " [Member]";
    }
}