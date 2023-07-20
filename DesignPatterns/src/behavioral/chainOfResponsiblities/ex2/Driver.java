package behavioral.chainOfResponsiblities.ex2;

import behavioral.chainOfResponsiblities.ex2.errors.CheckedError;
import behavioral.chainOfResponsiblities.ex2.errors.CustomError;
import behavioral.chainOfResponsiblities.ex2.errors.UncheckedError;
import behavioral.chainOfResponsiblities.ex2.handlers.Handler;

public class Driver
{
    public static void main(String[] args)
    {
        CustomError unchecked=new UncheckedError();
        CustomError global=new CustomError();
        CustomError checked=new CheckedError();


        Handler handler=Chain.buildChain();

        handler.handle(unchecked);
        System.out.println();

        handler.handle(checked);
        System.out.println();

        handler.handle(global);


    }
}
