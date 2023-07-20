package creational.AbstractFactoryPattern.companys;

import creational.AbstractFactoryPattern.gpu.Gpu;
import creational.AbstractFactoryPattern.gpu.GpuFactory;
import creational.AbstractFactoryPattern.os.Os;
import creational.AbstractFactoryPattern.os.OsFactory;
import creational.AbstractFactoryPattern.processor.Processor;
import creational.AbstractFactoryPattern.processor.ProcessorFactory;

public class Apple implements Company
{


    @Override
    public Processor getProcessor()
    {

        return ProcessorFactory.getprocessor("ryzen");
    }

    @Override
    public Os getOS()
    {


        return OsFactory.getos("ios");
    }

    @Override
    public Gpu getGpu()
    {

        return GpuFactory.getgpu("amd");
    }

}
