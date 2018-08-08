import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Shape implements Comparable<Shape>{
    abstract double areaSize();
    public int compareTo(Shape other){
        Double thisArea = this.areaSize();
        Double otherArea = other.areaSize();
        return thisArea.compareTo(otherArea);
    }
}


class Circle extends Shape{
    private final double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    double areaSize(){
        return Math.PI * radius * radius;
    }
}


class Square extends Shape{
    private final double side;

    public Square(double side){
        this.side = side;
    }

    @Override
    double areaSize(){
        return side * side;
    }
}


class Rectangle extends Shape{
    private final double width;
    private final double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    double areaSize(){
        return width * height;
    }
}


class Triangle1 extends Shape{
    private final double base;
    private final double height;

    public Triangle1(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    double areaSize(){
        return base * height / 2;
    }
}


class CustomShape extends Shape{
    private final double area;

    public CustomShape(double area){
        this.area = area;
    }

    @Override
    double areaSize(){
        return area;
    }
}