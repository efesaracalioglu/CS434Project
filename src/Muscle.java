public abstract class Muscle {
    private double size;
    private double power;

    public Muscle(double size, double power){
        this.size = size;
        this.power = power;
    }

    public double getSize() {
        return size;
    }

    public double getPower() {
        return power;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setPower(double power) {
        this.power = power;
    }
}
