package behavioral.chainOfResponsiblities.ex2.errors;

import lombok.Data;

@Data
public class CustomError
{
    String type;
    public CustomError()
    {
        type="none";
    }
}
