package creational.AbstractFactoryPattern.gpu;

public class GpuFactory
{
    public static Gpu getgpu(String name)
    {
        if(name.equals("amd"))
            return new Amd();
        else
            return new Nvidia();
    }
}
