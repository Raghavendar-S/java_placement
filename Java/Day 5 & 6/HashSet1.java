import java.util.*;

class HashSet1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet <String> set = new HashSet <String> ();
        char ch;
        int i=1;
        do
        {
            System.out.print("Enter the username "+i+":");
            i++;
            String str1=sc.next();
            set.add(str1);
            System.out.print("Do you want to continue?(Y/N):");
            ch = sc.next().charAt(0);
        }while(ch=='Y');
        /*System.out.println("The Names entered are:");
        Iterator itr = set.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }*/
        System.out.println("The unique number of usernames is " + set.size());
    }
}