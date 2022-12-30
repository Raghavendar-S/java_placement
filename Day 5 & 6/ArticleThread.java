import java.util.*;

class Article extends Thread
{
    String line;
    int count;
    Article()
    {
        this.line="";
    }
    Article(String l)
    {
        this.line=l;
    }

    String getLine()
    {
        return this.line;
    }
    int getCount()
    {
        return this.count;
    }

    void getLine(String line)
    {
        this.line=line;
    }
    
    public void run()
    {
        try 
        {
            String parts[] = this.line.split(" ");
            for(String part: parts) 
            {
                //part=part.replaceAll("[.,]", "");
                if(part.equalsIgnoreCase("a") || part.equalsIgnoreCase("an") || part.equalsIgnoreCase("the"))
                {
                    this.count++;
                }
            }
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }       
}
class ArticleThread
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines:");
        int n = sc.nextInt();
        sc.nextLine();
        int count=0;
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter line "+i+":");
            String str=sc.nextLine();
            Article t1 = new Article(str);
            t1.start();
            count+=t1.getCount();
        }
        System.out.print("There are "+count+" articles in the given input");
    }
}

//An article is a word used to modify a noun, which is a person, place, object or idea