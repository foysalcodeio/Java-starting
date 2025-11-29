import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
      
        Point point = new Point( 1, 2 );
        Point point2 = point;
        point.x = 5;
        System.out.println(point2);
    }
}
