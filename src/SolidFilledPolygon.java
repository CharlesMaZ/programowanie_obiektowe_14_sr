import java.util.Locale;

public class SolidFilledPolygon extends Polygon{
    private String color;

    public SolidFilledPolygon(Vec2[] points,String color) {
        super(points);
        this.color=color;
    }

    @Override
    public String toSvg(String parametres) {
        String fill = String.format(Locale.ENGLISH,"fill=\"%s\"%s",color,parametres);
        return super.toSvg(fill);
    }
}
