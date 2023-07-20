package creational.FactoryPattern;

public class ManhattanDistance implements Distance
{

    public double getDistance(Point p1,Point p2)
    {
        int x2,x1,y2,y1;
        x1=p1.getX();
        x2=p2.getX();
        y1=p1.getY();
        y2=p2.getY();
        return x2 - x1 +y2 - y1;

    }
}
