package creational.PrototypePattern;

import java.util.Scanner;

public class Document implements Prototype
{
    String subject;
    String content;

    Document()
    {
        subject="";
        content="";
    }
    Document(String subject)
    {
        this.subject=subject;
        content="";

    }

    Document(Document doc)
    {
        this.subject=doc.subject;
        this.content= doc.content;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void addText()
    {
        System.out.println("enter text");
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        while (!str.equals("quit"))
        {
            content += str;
            str = sc.nextLine();
        };
        System.out.println("text added to content updated content is \n"+content);

    }

    @Override
    public String toString() {
        return "{" +
                "subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    @Override
    public Prototype clone()
    {
        return new Document(this);
    }
}
