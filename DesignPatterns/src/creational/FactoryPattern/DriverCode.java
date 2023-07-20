package creational.FactoryPattern;


public class DriverCode
{
    public static void main(String[] args)
    {
        Point p1=new Point(1,1);
        Point p2=new Point(2,2);
        Distance dist=Factory.make();
        System.out.println("Distance between the points is: "+dist.getDistance(p1,p2));

    }
}