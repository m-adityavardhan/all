package creational.SingletonPattern;

public class Circle
{
    public static void drawCircle()
    {
        ApplicationWindow currWindow=ApplicationWindow.getInstance();
        currWindow.setOperation("Drawing circle");

    }

}
