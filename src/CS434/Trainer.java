package CS434;

import org.ini4j.Wini;

public class Trainer implements ISubscriber {
    // Auto-increment
    private static int maxID = -1;

    private int id;
    private String name;
    private String surname;

    public Trainer(String name, String surname) {
        this.setName(name);
        this.setSurname(surname);

        this.id = maxID + 1;
        maxID = id;

        TrainerObserver.getInstance().addSubscriber(this);

        System.out.println(this + " created.");
    }

    public int getID() {
        return id;
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

    @Override
    public void update() {
        Wini ini = TrainersData.getIni();
        String id_str = Integer.toString(getID());

        String newName = ini.get("Names", id_str, String.class);
        String newSurname = ini.get("Surnames", id_str, String.class);

        if (!name.equals(newName)) {
            setName(newName);

            System.out.println("Trainer " + id + "'s name has been changed to " + newName);
        }

        if (!surname.equals(newSurname)) {
            setSurname(newSurname);

            System.out.println("Trainer " + id + "'s surname has been changed to " + newSurname);
        }
    }

    @Override
    public int getPriority() {
        return 0;
    }

    @Override
    public String toString() {
        return name + " " + surname + " [Trainer]";
    }
}
