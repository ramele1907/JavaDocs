package ro.teamnet.zerotohero.oop.graphicshape;
import static java.lang.Math.PI;

/**
 * Created by user on 6/30/2016.
 */
public class Circle extends Shape {

    private  int xPos, yPos, radius;

    public Circle(int xPos) {
        this.xPos = xPos;
        this.yPos = 1;
        this.radius = 1;
    }

    public Circle(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = 0;
    }

    public Circle(int xPos, int yPos, int radius) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
    }

    public Circle() {
        this.xPos = 2;
        this.yPos = 3;
        this.radius = 1;
    }

    @Override
    public String toString() {
        return "center = " + xPos + "," + yPos + "and radius = " + radius;
    }


    public double area() {
        return radius * radius * PI;
    }

    public void fillColour() {
        System.out.println(super.getColor());
    }

    public  void fillColour(int color) {
        super.setColor(color);
        System.out.println("The circle color is now " + super.getColor());
    }

    public void fillColour(float saturation) {
        super.setSaturation(saturation);
    }
 }
