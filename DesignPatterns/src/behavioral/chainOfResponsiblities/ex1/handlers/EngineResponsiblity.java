package behavioral.chainOfResponsiblities.ex1.handlers;

import behavioral.chainOfResponsiblities.ex1.Car;

public class EngineResponsiblity implements Responsibility
{
    Responsibility next;

    @Override
    public void nextResponsibilty(Responsibility res) {
        next=res;
    }

    @Override
    public void handle(Car car)
    {
        System.out.println("adding engine");
        car.setEngine("v8");
        System.out.println("finish building car");
    }
}
