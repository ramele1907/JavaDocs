package ro.teamnet.zerotohero.oop.graphicshape;

/**
 * Created by user on 6/30/2016.
 */
public class Circles {
    public double getAreaPub() {
        Circle myCircle = new Circle();
        return myCircle.area();
    }
    public void getAreaDef() {
        Circle myCircle = new Circle();
        myCircle.fillColour();
        myCircle.fillColour(2);
        myCircle.fillColour(3.0f);
    }
}
