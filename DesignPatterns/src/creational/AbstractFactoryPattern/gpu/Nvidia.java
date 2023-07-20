package creational.AbstractFactoryPattern.gpu;



public class Nvidia implements Gpu
{
    @Override
    public void getDetails()
    {
        System.out.println("Nvidia Gpu is running");

    }
}
