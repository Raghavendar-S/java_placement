import java.util.*;
public class AlphabetCount1 {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        int flag=1;
        int a=str.charAt(0);
        int b=str.charAt(1);
        if(a!=b)
        {
            for(int i=2;i<n;i++)
            {
                if(i%2==0 && (int) str.charAt(i)==a)
                {
                    continue;
                }
                else if(i%2!=0 && (int) str.charAt(i)==b)
                {
                    continue;
                }
                else
                {
                    flag=0;
                }
            }
        }
        else
        {
            flag=0;
        }
        if(flag==1)
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
    }     
}
