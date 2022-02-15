package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<String> shapes = new ArrayList<>();
    private Shape shape;


    public void addFigure(Shape shape){

        shapes.add();


    }


    public boolean removeFigure(Shape shape){
        boolean result = false;
        if(shapes.contains(shape)){
            shapes.remove(shape);
            result = true;
        }
        return result;
    }


    public String getFigure(int n){
        if(n >= 0 && n < shapes.size()) {
            return shapes.get(n);
        }else{
            return null;
        }
    }


    public String showFigures(){
        String toString = null;

        for(int i=0; i < shapes.size(); i++){
            toString += (shapes.get(i) + " ");
        }
        return toString;
    }


    public int getFiguresQuantity(){
        return shapes.size();
    }
}
