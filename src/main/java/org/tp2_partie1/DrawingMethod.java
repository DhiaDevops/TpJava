package org.tp2_partie1;

public class DrawingMethod {

    public int calculateArea(Drawing drawing , RectangleMethod method){
        int Area = 0;
        for (int i = 0; i< drawing.getRectanglesNumber(); i++){
            Area += method.claculateArea(drawing.getRectangles()[i]);
        }
        return Area;
    }

    public void move(Drawing drawing , RectangleMethod method ,int X, int Y){
        for (int i =0; i < drawing.getRectanglesNumber(); i++){
            method.move(drawing.getRectangles()[i],X,Y );
        }
    }
}
