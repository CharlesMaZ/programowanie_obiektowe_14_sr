import java.util.Locale;

public class TransformationDecorator extends ShapeDecorator{
    private boolean translate;
    private Vec2 translateVector;
    public TransformationDecorator(Shape decorator){
        super(decorator);
    }
    public static class Builder{
        private boolean translate = false;
        private Vec2 translateVector;
        private Shape shape;
        public Builder SetTranslate(Vec2 translateVector){
            this.translate=true;
            this.translateVector=translateVector;
            return this;
        }
        public Builder SetShape(Shape shape){
            this.shape=shape;
            return this;
        }
        public TransformationDecorator build(){
            TransformationDecorator object = new TransformationDecorator(this.shape);
            if(this.translate == true){
            object.translate=true;
            object.translateVector=this.translateVector;
            }
            return object;
        }
    }
    public String toSvg(String parameters){
        String result="";
        if(this.translate==true){
            result=String.format(Locale.ENGLISH,"translate(%f %f)",this.translateVector.x,this.translateVector.y);
        }
        String transform="";
        transform = String.format(Locale.ENGLISH,"transform=\"%s\"%s",result,parameters);


        return decoratedShape.toSvg(transform);
    }
}
