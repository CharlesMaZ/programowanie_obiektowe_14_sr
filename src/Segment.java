public class Segment {
    Point first;
    Point secend;

    public Segment(Point first, Point secend) {
        this.first = first;
        this.secend = secend;
    }

    public Point getFirst() {
        return first;
    }

    public void setFirst(Point first) {
        this.first = first;
    }

    public Point getSecend() {
        return secend;
    }

    public void setSecend(Point secend) {
        this.secend = secend;
    }

    public double getDist () {
        return Math.hypot(first.x - secend.x, first.y - secend.y);
//        return Math.sqrt(Math.pow(first.x - secend.x, 2) + Math.pow(first.y - secend.y, 2) );
    }
}
