package test;

public class Retangle {
    private double width;
    private double height;

    public Retangle() {
    }

    public Retangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double zhouchang() {
        return 2 * (this.width + this.height);
    }

    public double mianji() {
        return this.width * this.height;
    }
}
