package com.CodeChallenges;

public class Wall {
    public static void main(String[] args) {
    Wall wall = new Wall(4,5);
        System.out.println("area = " + wall.getArea());
    Wall wall1 = new Wall(2,4);
        System.out.println("New wall1 = " + wall1.getArea());
    }

    private double width = 0;
    private double height = 0;

    public Wall(double width, double height){
        this.width = width;
        this.height = height;

    }
    public Wall(){
        this(2,8);
    }

    public void setWidth(double setWidth){
        this.width = (width < 0 ? 0 : width);
    }
    public double getWidth(){
        return width;
    }
    public void setHeight(){
        this.height=  (height < 0 ? 0: height);
    }

    public double getHeight(){
        return height;
    }
    public double getArea(){
        return (width * height);
    }

}
