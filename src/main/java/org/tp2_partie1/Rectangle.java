package org.tp2_partie1;

import java.util.Scanner;

public class Rectangle {

    private Point point;
    private int height;
    private int width;
    private static int nbrRectangle = 0;

    public static int getNbrRectangle() {
        return nbrRectangle;
    }

    public static void setNbrRectangle(int nbrRectangle) {
        Rectangle.nbrRectangle = nbrRectangle;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Rectangle(Point pointOne, Point pointTwo){
        this.point = pointOne;
        this.height = Math.abs(pointTwo.getY()-pointTwo.getY());
        this.width = Math.abs(pointTwo.getX() - pointOne.getX());
        nbrRectangle++;
    }
    public Rectangle(Point pointOne, int height, int width){
        this.point = pointOne;
        if (height > width){
            this.height = height;
            this.width = width;
            nbrRectangle++;
        }
        else {
            System.out.println("Les arguments saisis sont mal placées");
        }

    }

    public Rectangle(int x1, int x2, int y1, int y2){
        this.point = new Point(x1, y1);
        this.height = y1 - y2;
        this.width = x1 - x2;
        nbrRectangle++;

    }

}
