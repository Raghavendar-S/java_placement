import java.util.*;
public class StoneGame {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        a=a%5;
        if(a==1 || a==3 || a==4) 
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
	}    
}
