package creational.FactoryPattern;

import java.util.Scanner;

public class Factory
{
    public static Distance make()
    {
        System.out.println("Menu \n 1.minkowaski \n 2.euclidean \n 3.manhattan");
        System.out.println("enter your choice\n");
        Scanner sc=new Scanner(System.in);
        int choice =sc.nextInt();
        switch(choice)
        {
            case 1: return new MinkowaskiDistance();
            case 2: return new EuclideanDistance();
            case 3: return new ManhattanDistance();
            default: return new EuclideanDistance();
        }



    }
}