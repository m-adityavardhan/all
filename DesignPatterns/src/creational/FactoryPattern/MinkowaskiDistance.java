package creational.FactoryPattern;

import java.util.Scanner;

public class MinkowaskiDistance implements Distance
{
    public double getDistance(Point p1,Point p2)
    {
        int r;
        System.out.println("enter r to calculate minkowaski");
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();

        int x2,x1,y2,y1;
        x1=p1.getX();
        x2=p2.getX();
        y1=p1.getY();
        y2=p2.getY();
        return Math.pow((Math.pow(x2 - x1, r) +Math.pow(y2 - y1, r) * 1.0),1/r);

    }
}