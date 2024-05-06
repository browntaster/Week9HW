public class Point {
    int x;
    int y;

    public Point () {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public void setX() {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY() {
        this.y =y;
    }

    public double distance () {
        return Math.sqrt(x * x + y * y);
    }

    public double distance (int x, int y) {
        int xA = this.x - x;
        int yB = this.y - y;
        return Math.sqrt(xA*xA + yB*yB);
    }

    public static void main(String[] args) {
        Point first = new Point(6,5);
        Point second = new Point(3,1);

        System.out.println("Distance (0,0) = "+first.distance());
        System.out.println("distance(second)= "+first.distance(2,2));
        Point point = new Point();
        System.out.println("distance()= "+point.distance());
    }



}
