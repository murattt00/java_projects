public class Point {
    private int xCoord;
    private int yCoord;

    public Point(int xCoord, int yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public int getxCoord() {
        return xCoord;
    }

    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }
    public double distance(Point p2){
        return Math.sqrt((Math.pow(getxCoord() - p2.getxCoord(),2)) + Math.pow((getyCoord() - p2.getyCoord()),2 ));
    }
}
