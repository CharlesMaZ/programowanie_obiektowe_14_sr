import java.util.Locale;

public class Main {

    public static final Point test = new Point(2,3);

    public static void main(String[] args) {
        Point point  = new Point(2,3);
//<line x1="20" y1="20" x2="80" y2="80" style="stroke:black" />

        String s = String.format(Locale.ENGLISH,"<line x1=\"%f\" y1=\"20\" x2=\"80\" y2=\"80\" style=\"stroke:black\" />", point.x);
        System.out.println(s);

        int array[] = new int[4];
        int array2[] = new int[] {
                2,3,4,5
        };
        array[0] = 2;
    }
}