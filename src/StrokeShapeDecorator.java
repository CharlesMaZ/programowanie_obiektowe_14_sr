import java.util.Locale;

public class StrokeShapeDecorator extends ShapeDecorator{
    private String color;
    private double width;

    public StrokeShapeDecorator(Shape decoratedShape, String color, double width) {
        super(decoratedShape);
        this.color = color;
        this.width = width;
    }
    public String toSvg(String parameters){

        String fill = String.format(Locale.ENGLISH,"stroke=\"%s\" stroke-width=\"%f\"%s",color,width,parameters);

        System.out.println("toSvg StrokeShapeDecorator " + fill);

        return decoratedShape.toSvg(fill);
    }
}
