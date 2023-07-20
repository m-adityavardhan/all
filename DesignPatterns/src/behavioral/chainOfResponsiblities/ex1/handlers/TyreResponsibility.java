package behavioral.chainOfResponsiblities.ex1.handlers;

import behavioral.chainOfResponsiblities.ex1.Car;

public class TyreResponsibility implements Responsibility{
    Responsibility next;
    @Override
    public void nextResponsibilty(Responsibility res) {
        next=res;
    }

    @Override
    public void handle(Car car)
    {
        car.setTyres("appollo");
        System.out.println("setting tyres");
        next.handle(car);
    }
}
