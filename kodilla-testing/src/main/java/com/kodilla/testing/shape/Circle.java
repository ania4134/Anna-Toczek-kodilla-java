package com.kodilla.testing.shape;
import com.kodilla.testing.shape.Shape;

public class Circle implements Shape{

    private String shapeName;
    private double radius;
    private double field;

    public Circle(String shapeName, double radius){
        this.shapeName=shapeName;
        this.radius=radius;
    }


    @Override
    public String getShapeName() {

        return shapeName;
    }

    public double getField(){
        field=3.14 * radius * radius;
        return field;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.radius, radius) != 0) return false;
        if (Double.compare(circle.getField(), getField()) != 0) return false;
        return getShapeName().equals(circle.getShapeName());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getShapeName().hashCode();
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getField());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
