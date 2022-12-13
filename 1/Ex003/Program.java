package Ex003;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Integer> pointCoord = new ArrayList<>();
        pointCoord.add(4);
        pointCoord.add(6);
        pointCoord.add(-4);
        Point a = new Point(pointCoord);
       
        System.out.println(a);
        // Point2D b = new Point2D(0, 10);

        //var dis = Point2D.distance(a, b);
        //System.out.println(dis);
    }
}