import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Locale;

public class SvgScene {
    private ArrayList<Polygon> polygons =new ArrayList<>();
    private int height=0,width=0;
    public void addPolygon(Polygon polygon){
        polygons.add(polygon);
        Point maxPunkt = polygon.getMaxCords();
        if(width < maxPunkt.x)
            width= (int) maxPunkt.x + 1;
        if(height < maxPunkt.y)
            height= (int) maxPunkt.y + 1;

    }
    public void save(String filename){
        String svg= String.format(Locale.ENGLISH,"<svg width=\"%d\" height=\"%d\">",width,height);
        for(Polygon polygon : polygons){
            svg+= polygon.toSvg();
        }
        svg+="</svg>";
        try {


            FileWriter fw
                    = new FileWriter(filename);
            fw.write(svg);
            fw.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }

}
