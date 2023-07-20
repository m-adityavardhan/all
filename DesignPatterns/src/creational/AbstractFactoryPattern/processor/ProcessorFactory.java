package creational.AbstractFactoryPattern.processor;

public class ProcessorFactory
{
    public static Processor getprocessor(String name)
    {
        if(name.equals("intel"))
            return new Intel();
        else
            return new Ryzen();
    }
}
