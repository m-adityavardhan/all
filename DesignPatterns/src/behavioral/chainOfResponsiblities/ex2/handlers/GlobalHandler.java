package behavioral.chainOfResponsiblities.ex2.handlers;

import behavioral.chainOfResponsiblities.ex2.errors.CustomError;

public class GlobalHandler implements Handler
{
    Handler next;
    @Override
    public void superHandler(Handler handler) {
        next=handler;

    }

    @Override
    public void handle(CustomError err)
    {
        System.out.println("handling exception in global");

    }
}
