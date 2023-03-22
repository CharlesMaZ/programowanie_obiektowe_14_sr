public class AmbigiousPersonException extends Exception{
    public String path1;
    public String path2;
    public AmbigiousPersonException(String message,String path1,String path2) {
        super(message);
        this.path1 = path1;
        this.path2 = path2;
    }
}
