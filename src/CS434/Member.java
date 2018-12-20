package CS434;

import java.util.ArrayList;

public class Member implements Subscriber {
    private String name;
    private String surname;
    private ArrayList<Exercise> beforeDoneExercises;



    public Member(String name, String surname) {
        this.setName(name);
        this.setSurname(surname);

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

    public ArrayList<Exercise> getBeforeDone(){
        return beforeDoneExercises;
    }

    @Override
    public void update() {
        System.out.println(this + " is updated.");
    }

    @Override
    public String toString() {
        return name + " " + surname + " [Member]";
    }
}