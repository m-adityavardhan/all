package behavioral.chainOfResponsiblities.ex1.handlers;

import behavioral.chainOfResponsiblities.ex1.Car;

public interface Responsibility {
    void nextResponsibilty(Responsibility res);
    void handle(Car car);
}