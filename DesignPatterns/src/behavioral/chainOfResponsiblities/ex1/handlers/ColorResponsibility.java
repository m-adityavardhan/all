package behavioral.chainOfResponsiblities.ex1.handlers;

import behavioral.chainOfResponsiblities.ex1.Car;

public class ColorResponsibility implements Responsibility
{
    Responsibility next;
    @Override
    public void nextResponsibilty(Responsibility res)
    {
        next=res;
    }

    @Override
    public void handle(Car car)
    {
        System.out.println("setting color");
        car.setColor("red");
        next.handle(car);
    }
}
