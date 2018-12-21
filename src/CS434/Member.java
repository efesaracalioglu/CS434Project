package CS434;

import org.ini4j.Wini;

import java.util.ArrayList;

public class Member implements ISubscriber {
    private static int maxID = -1;
    private int id;
    private String name;
    private String surname;
    private ArrayList<Exercise> beforeDoneExercises;

    public Member(String name, String surname) {
        this.setName(name);
        this.setSurname(surname);

        this.id = maxID + 1;
        maxID = id;

        MemberObserver.getInstance().addSubscriber(this);
        System.out.println(this + " created.");
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
        return id;
    }

    public ArrayList<Exercise> getExerciseHistory() {

        return beforeDoneExercises;
    }

    @Override
    public void update() {
        Wini ini = MembersData.getIni();
        String id_str = Integer.toString(getID());

        String newName = ini.get("Names", id_str, String.class);
        String newSurname = ini.get("Surnames", id_str, String.class);

        if (!name.equals(newName)) {
            setName(newName);

            System.out.println("Member " + id + "'s name has been changed to " + newName);
        }

        if (!surname.equals(newSurname)) {
            setSurname(newSurname);

            System.out.println("Member " + id + "'s surname has been changed to " + newSurname);
        }
    }

    @Override
    public String toString() {
        return name + " " + surname + " [Member]";
    }
}