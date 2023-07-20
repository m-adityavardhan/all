package creational.AbstractFactoryPattern.companys;

import creational.AbstractFactoryPattern.gpu.Gpu;
import creational.AbstractFactoryPattern.os.Os;
import creational.AbstractFactoryPattern.processor.Processor;

public interface Company
{
    Processor getProcessor();
    Os getOS();
    Gpu getGpu();

}
