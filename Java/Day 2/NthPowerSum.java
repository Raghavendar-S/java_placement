import java.util.*;
public class NthPowerSum {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum=0;
        for(int i=1;i<=b;i++)
        {
            if(i%a==0)
            {
                sum+=i;
            }
        }
        System.out.print(sum);
	}    
}
