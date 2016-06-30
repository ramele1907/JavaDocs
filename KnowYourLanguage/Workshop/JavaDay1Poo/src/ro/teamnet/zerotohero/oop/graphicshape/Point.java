package ro.teamnet.zerotohero.oop.graphicshape;

/**
 * Created by user on 6/30/2016.
 */
public class Point {
    private int xPos, yPos;

    public Point(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    @Override
    public boolean equals(Object other) {
        if(other == null)
            return false;
        if(other instanceof Point) {
            if( ((Point)other).xPos == this.xPos && ((Point)other).yPos == yPos){
                return true;
            }
        }
        return false;
    }

}
