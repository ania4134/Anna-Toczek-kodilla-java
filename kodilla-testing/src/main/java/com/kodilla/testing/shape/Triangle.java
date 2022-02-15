package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private String shapeName;
    private double baseOfTriangle;
    private double highOfTriangle;
    private double field;


    public Triangle(String shapeName, double baseOfTriangle, double highOfTriangle ) {
        this.shapeName = shapeName;
        this.baseOfTriangle = baseOfTriangle;
        this.highOfTriangle = highOfTriangle;
    }


    @Override
    public String getShapeName(){
        return shapeName;
    }


    public double getBaseOfTriangle() {
        return baseOfTriangle;
    }


    public double getHighOfTriangle() {
        return highOfTriangle;
    }


    public double getField(){
        field=getBaseOfTriangle() * getHighOfTriangle() /2;
        if (getHighOfTriangle() > 0 && getBaseOfTriangle()>0) {
            return field;
        }else{
            return 0;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.getBaseOfTriangle(), getBaseOfTriangle()) != 0) return false;
        if (Double.compare(triangle.getHighOfTriangle(), getHighOfTriangle()) != 0) return false;
        if (Double.compare(triangle.getField(), getField()) != 0) return false;
        return getShapeName().equals(triangle.getShapeName());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getShapeName().hashCode();
        temp = Double.doubleToLongBits(getBaseOfTriangle());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getHighOfTriangle());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getField());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
