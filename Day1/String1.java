import java.util.*;
public class String1{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String str=sc.nextLine();
        int length=str.length();
        for(int i=0;i<length;i++)
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='A' || str.charAt(i)=='e' || str.charAt(i)=='E' || str.charAt(i)=='i' || str.charAt(i)=='I' || str.charAt(i)=='o' || str.charAt(i)=='O' || str.charAt(i)=='u' || str.charAt(i)=='U')
            {
                System.out.print(str.charAt(i)+""+str.charAt(i));
            }
            else
            {
                System.out.print(str.charAt(i));
            }
        }
    }
}