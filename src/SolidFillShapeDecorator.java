import java.util.Locale;

public class SolidFillShapeDecorator extends ShapeDecorator {
    private String color;

    public SolidFillShapeDecorator(Shape decoratedShape, String color) {
        super(decoratedShape);
        this.color = color;
    }

    @Override
    public String toSvg(String parametres) {
        String fill = String.format(Locale.ENGLISH,"fill=\"%s\"%s",color,parametres);
        return decoratedShape.toSvg(fill);
    }
}
