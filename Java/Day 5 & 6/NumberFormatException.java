import java.util.*;

class ItemType
{
    String name;
    Double deposit,costPerDay;
    ItemType(String s, Double d,Double c)
    {
        this.name=s;
        this.deposit=d;
        this.costPerDay=c;
    }
    void display()
    {
        System.out.println("The details of the item type are:");
        System.out.println("Name:"+name);
        System.out.println("Deposit:"+deposit);
        System.out.println("Cost Per Day:"+costPerDay);
    }
}

class NumberFormatException
{
    public static void main(String args[]) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Item type details");
            System.out.print("Enter the name:");
            String name = sc.nextLine();
            System.out.print("Enter deposit:");
            double  d = Double.parseDouble(sc.next());
            System.out.print("Enter the cost per day:");
            double c = Double.parseDouble(sc.next());
            ItemType i = new ItemType(name,d,c);
            i.display();

        } catch (Exception e) {
            
            // TODO: handle exception
            System.out.print(e);
        }
    }
}