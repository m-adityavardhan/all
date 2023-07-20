package behavioral.chainOfResponsiblities.ex2;

import behavioral.chainOfResponsiblities.ex2.errors.CustomError;
import behavioral.chainOfResponsiblities.ex2.errors.UncheckedError;
import behavioral.chainOfResponsiblities.ex2.handlers.CheckedHandler;
import behavioral.chainOfResponsiblities.ex2.handlers.GlobalHandler;
import behavioral.chainOfResponsiblities.ex2.handlers.Handler;
import behavioral.chainOfResponsiblities.ex2.handlers.UncheckedHandler;

public class Chain
{
    static Handler buildChain()
    {
        Handler unchecked=new UncheckedHandler();
        Handler checked=new CheckedHandler();
        Handler global=new GlobalHandler();

        unchecked.superHandler(checked);
        checked.superHandler(global);
        return unchecked;

    }
}
