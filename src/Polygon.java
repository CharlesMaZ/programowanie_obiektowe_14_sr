import java.util.Locale;

public class Polygon implements Shape {
    Vec2 points[];

    public Polygon(Vec2[] points) {
        this.points = points;
    }

    public String toSvg(String parametres) {

        String pointsString = "";
        for(Vec2 point : points)
            pointsString += point.x + "," + point.y + " ";

        System.out.println("toSvg Polygon " + String.format(Locale.ENGLISH,"<polygon points=\"%s\" %s />", pointsString,parametres));

        return String.format(Locale.ENGLISH,"<polygon points=\"%s\" %s />", pointsString,parametres);
    }
}
