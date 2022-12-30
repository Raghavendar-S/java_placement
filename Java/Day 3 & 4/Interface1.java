import java.util.*;

interface Stall
{
    void display();
}

class GoldStall implements Stall
{
    String stallName;
    int cost;
    String ownerName;
    int tvSet;
    GoldStall(String s,int c,String o,int t)
    {
        this.stallName=s;
        this.cost=c;
        this.ownerName=o;
        this.tvSet=t;
    }
    public void display()
    {
        System.out.println("Staff Name:"+stallName);
        System.out.println("Cost:"+cost+" Rs");
        System.out.println("Owner Name:"+ownerName);
        System.out.println("Number of TV Sets:"+tvSet);
    }
}
class PremiumStall implements Stall
{
    String stallName;
    int cost;
    String ownerName;
    int projector;
    PremiumStall(String s,int c,String o,int p)
    {
        this.stallName=s;
        this.cost=c;
        this.ownerName=o;
        this.projector=p;
    }
    public void display()
    {
        System.out.println("Staff Name:"+stallName);
        System.out.println("Cost:"+cost+" Rs");
        System.out.println("Owner Name:"+ownerName);
        System.out.println("Number of Projectors:"+projector);
    }
}
class ExecutiveStall implements Stall
{
    String stallName;
    int cost;
    String ownerName;
    int screen;
    ExecutiveStall(String s,int c,String o,int sc)
    {
        this.stallName=s;
        this.cost=c;
        this.ownerName=o;
        this.screen=sc;
    }
    public void display()
    {
        System.out.println("Staff Name:"+stallName);
        System.out.println("Cost:"+cost+" Rs");
        System.out.println("Owner Name:"+ownerName);
        System.out.println("Number of Screens:"+screen);
    }
}
class Interface1
{
    public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Choose Stall Type");
        System.out.println("1)Gold Stall");
        System.out.println("2)Premium Stall");
        System.out.println("3)Executive Stall");
        int type=sc.nextInt();
        sc.nextLine();
        if(type==1)
        {
            System.out.println("Enter Stall Details in comma seperated(Stall name, Stall Cost, Owner Name, Number of TV sets):");
            str=sc.nextLine();
            String[] s = str.split(",");
            GoldStall g=new GoldStall(s[0],Integer.parseInt(s[1]),s[2],Integer.parseInt(s[3]));
            g.display();
        }
        else if(type==2)
        {
            System.out.println("Enter Stall Details in comma seperated(Stall name, Stall Cost, Owner Name, Number of Projectors):");  
            str=sc.nextLine(); 
            String[] s = str.split(",");
            PremiumStall p=new PremiumStall(s[0],Integer.parseInt(s[1]),s[2],Integer.parseInt(s[3]));
            p.display();
        }
        else if(type==3)
        {
            System.out.println("Enter Stall Details in comma seperated(Stall name, Stall Cost, Owner Name, Number of Screens):");
            str=sc.nextLine();
            String[] s = str.split(",");
            ExecutiveStall e=new ExecutiveStall(s[0],Integer.parseInt(s[1]),s[2],Integer.parseInt(s[3]));
            e.display();
        }
        else
        {
            System.out.print("Invalid choice");
        }
    }   
}