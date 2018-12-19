package CS434;

public abstract class Muscle {
    private double size;
    private double power;

    public Muscle(double size, double power) {
        this.size = size;
        this.power = power;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}
