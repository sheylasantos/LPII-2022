package br.ufrn.imd;

public class Circle {
    private float radius;

    public Circle(float radius){
        this.radius = radius;
    }
    public double area(){
        return Math.PI * (radius*radius);
    }
    public double circumference(){
        return 2 * Math.PI * radius;
    }
}
