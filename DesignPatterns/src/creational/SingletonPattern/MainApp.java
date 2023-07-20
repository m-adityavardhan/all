package creational.SingletonPattern;

public class MainApp
{
    public static void main(String [] args)
    {
        ApplicationWindow curWindow=ApplicationWindow.getInstance();
        Circle.drawCircle();
        curWindow.render();
        Car.drawCar();
        curWindow.render();


    }

}
