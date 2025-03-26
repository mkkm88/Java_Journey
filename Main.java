import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int age = 303586454;
        System.out.println(age);
        Date now = new Date();
        System.out.println(now);
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 3;
        System.out.println(point2);
        // constant Code start from here
        final float PI = 3.14F;
        System.out.println(PI);
        // Casting Code Start from here
        // Implicit Casting
        // byte > short > int > long > float > double
        short x = 2;
        int y = x + 4;
        System.out.println(y);
        // Explicit Casting
        double a = 2.2;
        int b = (int)a + 2;
        System.out.println(b);
    }
}