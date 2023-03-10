package org.tp2_partie1;

public class RectangleMethod {


    public int claculateArea(Rectangle rectangle){
        return rectangle.getHeight() * rectangle.getWidth();
    }

    public void move(Rectangle rectangle, int newX, int newY){
        rectangle.getPoint().setX(newX);
        rectangle.getPoint().setY(newY);
    }

    public boolean containsPoint (Rectangle rectangle, Point point){
        return (rectangle.getPoint().getY() + rectangle.getHeight() > point.getY() && rectangle.getPoint().getX() + rectangle.getWidth() > point.getX());
    }

    public boolean containsRecatangle(Rectangle rectangle, Rectangle other){
        return (rectangle.getPoint().getX() + rectangle.getWidth() > other.getPoint().getX() + other.getWidth() &&
                rectangle.getPoint().getY() + rectangle.getHeight() > other.getPoint().getY() + other.getHeight());
    }

    public boolean verifSameAs(Rectangle rectangle, Rectangle other){
        return (rectangle.getPoint() == other.getPoint() &&
                rectangle.getHeight() == other.getHeight() &&
                rectangle.getWidth() == other.getWidth());
    }




}
