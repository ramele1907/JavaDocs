package ro.teamnet.zerotohero.oop.graphicshape;

/**
 * Created by user on 6/30/2016.
 */
public class Shape extends AbstractShape implements ShapeBehaviour {
    protected int color;
    protected float saturation;
    public double area() {
        double aux = 0;
        return aux;
    }
    public void setColor(int color) {
        this.color = color;
    }
    public int getColor() {
        return color;
    }
    public void setSaturation(float saturation){
        this.saturation = saturation;
    }
    public float getSaturation() {
        return  saturation;
    }
}
