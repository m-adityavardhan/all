package behavioral.chainOfResponsiblities.ex1;

import behavioral.chainOfResponsiblities.ex1.handlers.ColorResponsibility;
import behavioral.chainOfResponsiblities.ex1.handlers.EngineResponsiblity;
import behavioral.chainOfResponsiblities.ex1.handlers.Responsibility;
import behavioral.chainOfResponsiblities.ex1.handlers.TyreResponsibility;

public class Chain
{
    static Responsibility buildChain()
    {
        Responsibility colour=new ColorResponsibility();
        Responsibility tyre=new TyreResponsibility();
        Responsibility engine=new EngineResponsiblity();

        colour.nextResponsibilty(tyre);
        tyre.nextResponsibilty(engine);
        return colour;
    }
}
