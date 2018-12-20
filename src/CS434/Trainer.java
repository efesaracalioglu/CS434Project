package CS434;

public class Trainer implements Subscriber {
    private String name;
    private String surname;

    public Trainer(String name, String surname) {
        this.setName(name);
        this.setSurname(surname);

        TrainerObserver.getInstance().addSubscriber(this);
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
        System.out.println(this + " is updated.");
    }

    @Override
    public String toString() {
        return name + " " + surname + " [Trainer]";
    }
}