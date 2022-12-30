import java.util.*;

class ArrayList2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> list = new ArrayList <String> ();
        System.out.print("Enter the number of halls:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter the Hall Name "+i+":");
            String str=sc.next();
            list.add(str);
        }
        System.out.println("Enter the hall name to be searched:");
        String str1=sc.next();
        if(list.contains(str1))
        {
            System.out.print(str1+" hall is found in the list at position "+list.indexOf(str1));
        }
        else
        {
            System.out.print(str1+" hall is not found");
        }
    }
}