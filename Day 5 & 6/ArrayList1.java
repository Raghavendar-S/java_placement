import java.util.*;

class ArrayList1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> list = new ArrayList <String> ();
        char ch;
        int i=1;
        do
        {
            System.out.print("Enter the username "+i+":");
            i++;
            String str1=sc.next();
            list.add(str1);
            System.out.print("Do you want to continue?(y/n):");
            ch = sc.next().charAt(0);
        }while(ch=='y');
        System.out.println("The Names entered are:");
        Iterator itr = list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}