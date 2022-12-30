import java.util.*;
public class CoinCount {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int one=0,two=0,five=0;
        five=(n-4)/5;
        if((n-5*five)%2==0)
        {
            one=2;
        }
        else
        {
            one=1;
        }
        two=(n-5*five-one)/2;
        System.out.print("5="+five+" 2="+two+" 1="+one);
        System.out.println();
        for(int i=0;i<five;i++)
        {
            System.out.print("5 ");
        }
        for(int i=0;i<two;i++)
        {
            System.out.print("2 ");
        }
        for(int i=0;i<one;i++)
        {
            System.out.print("1 ");
        }
    }     
}
