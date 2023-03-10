package org.tp2_partie1;

import java.util.Scanner;

public class Drawing {

    private int size;
    private int rectanglesNumber;

    public int getRectanglesNumber() {
        return rectanglesNumber;
    }

    public void setRectanglesNumber(int rectanglesNumber) {
        this.rectanglesNumber = rectanglesNumber;
    }

    private Rectangle[] rectangles ;


    public Drawing (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir la taille du tableau");
        this.size = scanner.nextInt();
        this.rectangles = new Rectangle[size];
    }

    public void add(Rectangle rectangle){
        if (this.size > this.rectanglesNumber){
            rectangles[rectanglesNumber] = rectangle;
            rectanglesNumber ++ ;
        }else {
            System.out.println("Le dessin est plein impossible d'ajouter un nouveau rectangle");
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Rectangle[] getRectangles() {
        return rectangles;
    }

    public void setRectangles(Rectangle[] rectangles) {
        this.rectangles = rectangles;
    }
}
