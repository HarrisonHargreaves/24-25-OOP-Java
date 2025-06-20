package code.week5_6;

public class Sphere {

    private double diameter;


    public Sphere(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getVolume() {
        return (float) ((4.0 / 3.0) * Math.PI * Math.pow((diameter / 2), 3));
    }

    public double getSurfaceArea() {
        return (4 * Math.PI * (Math.pow((diameter / 2), 2)));
    }

    public String toString() {
        return "Diameter : " + diameter + "\nVolume : " + getVolume() + "\nSurface Area : " + getSurfaceArea();
    }


}
