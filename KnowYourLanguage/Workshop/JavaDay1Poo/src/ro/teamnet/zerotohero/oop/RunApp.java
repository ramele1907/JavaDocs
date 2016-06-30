package ro.teamnet.zerotohero.oop;

import ro.teamnet.zerotohero.canvas.Canvas;
import ro.teamnet.zerotohero.oop.graphicshape.*;

/**
 * Created by user on 6/30/2016.
 */
public class RunApp {

    public static void main(String[] args) {
        Circle myCircle = new Circle();
        System.out.println("The default circle area is " + myCircle.area());

        Circles circles = new Circles();
        circles.getAreaDef();

        Canvas myCanvas = new Canvas();
        System.out.println(myCanvas.getArea());

        Shape newShape = new Circle(10);
        System.out.println(newShape.area());

        ShapeBehaviour newShapeBehaviour = new Circle(10);
        System.out.println(newShapeBehaviour.area());

        Object p1 = new Point(10, 20);
        Object p2 = new Point(50, 100);
        Object p3 = new Point(10, 20);
        System.out.println("p1 equals p2 is " + p1.equals(p2));
        System.out.println("p1 equals p3 is " + p1.equals(p3));
    }

}
