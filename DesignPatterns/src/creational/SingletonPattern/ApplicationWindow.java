package creational.SingletonPattern;

public class ApplicationWindow
{
    private static ApplicationWindow singleWindow;
    String operation;
    private ApplicationWindow(){
        System.out.println("renders initial empty window in constructor");
        operation="empty";
    }

    public static ApplicationWindow getInstance()
    {
        if(singleWindow==null)
            singleWindow= new ApplicationWindow();
        return singleWindow;
    }

    public void render()
    {
        System.out.println("same window is rendered along with: "+operation);
    }

    public void setOperation(String temp)
    {
        operation=temp;
    }


}
