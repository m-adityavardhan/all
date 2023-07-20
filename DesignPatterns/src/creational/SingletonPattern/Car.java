package creational.SingletonPattern;

public class Car
{
    public static void drawCar()
    {
        ApplicationWindow currWindow=ApplicationWindow.getInstance();
        currWindow.setOperation("Drawing car");

    }

}
