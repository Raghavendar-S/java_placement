import java.util.*;
public class AESNumber {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result=0;
        for(int n=a;n<=b;n++)
        {
            int count=0;
            for(int i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    count++;
                }
            }
            if(count==4)
            {
                result++;
            }
        }
        System.out.print(result);
	}    
}
