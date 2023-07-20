package creational.AbstractFactoryPattern.gpu;

public class Amd implements Gpu
{
    @Override
    public void getDetails()
    {
        System.out.println("Amd gpu is running");
    }
}
