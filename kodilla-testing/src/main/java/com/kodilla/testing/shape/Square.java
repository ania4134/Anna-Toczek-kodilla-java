package com.kodilla.testing.shape;

public class Square implements Shape{


    private String shapeName;
    private double sideLength;
    public double field;

    public Square(String shapeName, double sideLength) {
        this.shapeName = shapeName;
        this.sideLength = sideLength;
    }

    @Override
    public String getShapeName(){
        return shapeName;
    }


    public double getSideLength() {
        return sideLength;
    }


    public double getField() {
        field=getSideLength() * getSideLength();
        if (sideLength > 0) {
            return field;
        }else{
            return 0;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;

        Square square = (Square) o;

        if (Double.compare(square.getSideLength(), getSideLength()) != 0) return false;
        if (Double.compare(square.getField(), getField()) != 0) return false;
        return getShapeName().equals(square.getShapeName());
    }


    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getShapeName().hashCode();
        temp = Double.doubleToLongBits(getSideLength());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getField());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
