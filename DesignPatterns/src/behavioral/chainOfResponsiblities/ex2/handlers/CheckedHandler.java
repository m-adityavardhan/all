package behavioral.chainOfResponsiblities.ex2.handlers;

import behavioral.chainOfResponsiblities.ex2.errors.CheckedError;
import behavioral.chainOfResponsiblities.ex2.errors.CustomError;

public class CheckedHandler implements Handler
{
    Handler next;
    @Override
    public void superHandler(Handler handler) {
        next=handler;

    }

    @Override
    public void handle(CustomError err)
    {
        if(err instanceof CheckedError)
        {
            System.out.println("handling checked exception");
        }
        else{
            System.out.println("passing exception to global");
            next.handle(err);
        }
    }
}
