import java.util.Locale;

public class Style {
    public final String fillColor, strokeColor;
    public final Double strokeWidth;
    public Style(String fillColor, String strokeColor, double strokeWidth){
        this.fillColor = fillColor;
        this.strokeColor = strokeColor;
        this.strokeWidth = strokeWidth;
    }
    public String toSvg(){
        String fill = this.fillColor == null? "transparent" : this.fillColor;
        String stroke = this.strokeColor == null? "black" : this.strokeColor;
        Double width = this.strokeWidth == null? 1 : this.strokeWidth;
        return String.format(Locale.ENGLISH, "stroke:%s; stroke-width:%f;fill:%s", stroke, width, fill);
    }
}
//        return String.format(Locale.ENGLISH, "<line x1=\"%f\" y1=\"%f\" x2=\"%f\" y2=\"%f\" style=\"stroke:rgb(255,0,0);stroke-width:2\" />",p1.x,p1.y,p2.x,p2.y);
