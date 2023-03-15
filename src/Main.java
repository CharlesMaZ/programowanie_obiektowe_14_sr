import java.util.ArrayList;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        Shape poly = new Polygon(new Vec2[]{new Vec2(120,60), new Vec2(270,280), new Vec2(240,320), new Vec2(110,80)});
        Shape ellipse = new Ellipse(new Vec2(120,60), 20, 30);

        poly = new SolidFillShapeDecorator(poly, "red");
        ellipse = new SolidFillShapeDecorator(ellipse, "green");
        poly = new StrokeShapeDecorator(poly,"blue",30);

        SvgScene scene=new SvgScene();
        scene.addShape(poly);
        scene.addShape(ellipse);
        scene.saveHtml("scene.html");
    }
}
