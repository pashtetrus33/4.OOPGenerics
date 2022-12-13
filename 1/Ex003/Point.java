package Ex003;

import java.util.ArrayList;
import java.util.List;

/** 
  *Это точка 2D
*/
public class Point {
    private List<Integer> coords = new ArrayList<>(); // Это координаты

    /**
     * Это конструктор ...
     * @param valueX это координата Х
     * @param valueY это координата Y
     */
    public Point(List<Integer> coords) {
        this.coords = coords;
    }

    public Point() {
        this.coords.add(0);
    }

    public List<Integer> getCoords(){
        return coords;
    }
    
    public void setCoord(int value){
        this.coords.add(value);
    }

    @Override
    public String toString() {
        return String.format("Point: %s, Demision: %d", coords.toString(), coords.size());
    }

    //public static double distance(Point a, Point b) {
        //return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
   // }

    // ctor
    // get; set;
    // docs
    //
}
