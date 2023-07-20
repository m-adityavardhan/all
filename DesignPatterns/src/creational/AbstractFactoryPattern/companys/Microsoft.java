package creational.AbstractFactoryPattern.companys;


import creational.AbstractFactoryPattern.gpu.Gpu;
import creational.AbstractFactoryPattern.gpu.GpuFactory;
import creational.AbstractFactoryPattern.os.OsFactory;
import creational.AbstractFactoryPattern.os.Os;
import creational.AbstractFactoryPattern.processor.Processor;
import creational.AbstractFactoryPattern.processor.ProcessorFactory;


public class Microsoft implements Company
{


    @Override
    public Processor getProcessor()
    {

        return ProcessorFactory.getprocessor("intel");
    }

    @Override
    public Os getOS()
    {


        return OsFactory.getos("windows");
    }

    @Override
    public Gpu getGpu()
    {

        return GpuFactory.getgpu("nvidia");
    }



}
