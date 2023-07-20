package creational.AbstractFactoryPattern;

import creational.AbstractFactoryPattern.gpu.Gpu;
import creational.AbstractFactoryPattern.os.Os;
import creational.AbstractFactoryPattern.processor.Processor;

public class Laptop
{
    private Processor processor;
    private Gpu gpu;
    private Os os;

    public void attach(Gpu gpu, Os os, Processor processor)
    {
        this.gpu=gpu;
        this.os=os;
        this.processor=processor;
    }

    public void boot()
    {
        processor.getDetails();
        gpu.getDetails();
        os.run();
    }
}
