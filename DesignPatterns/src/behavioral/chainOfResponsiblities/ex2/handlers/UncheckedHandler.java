package behavioral.chainOfResponsiblities.ex2.handlers;

import behavioral.chainOfResponsiblities.ex2.errors.CustomError;
import behavioral.chainOfResponsiblities.ex2.errors.UncheckedError;

import java.io.UncheckedIOException;

public class UncheckedHandler implements Handler
{
    Handler next;
    @Override
    public void superHandler(Handler handler) {
        next=handler;

    }

    @Override
    public void handle(CustomError err)
    {
        if(err instanceof UncheckedError)
        {
            System.out.println("handling unchecked exception");
        }
        else{
            System.out.println("passing exception to checked");
            next.handle(err);
        }
    }
}
