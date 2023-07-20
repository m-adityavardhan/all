package behavioral.chainOfResponsiblities.ex1;

import behavioral.chainOfResponsiblities.ex1.handlers.Responsibility;

public class Driver
{
    public static void main(String[] args)
    {
        Car car=new Car();

        Responsibility res=Chain.buildChain();
        res.handle(car);

        System.out.println("constructed car is "+car);
    }
}
