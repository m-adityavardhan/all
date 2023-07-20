package behavioral.chainOfResponsiblities.ex2.handlers;

import behavioral.chainOfResponsiblities.ex2.errors.CustomError;

public interface Handler
{
    void superHandler(Handler handler);
    void handle(CustomError err);
}
