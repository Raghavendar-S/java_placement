import java.util.*;
public class PatternPrinting5 {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int space,k;
        for (int i = 1; i <= n; ++i) {
            for (space = 1; space <= n - i; ++space) {
                System.out.print("  ");
            }
            for (k=0;k<2*i-1;k++) {
                if(k%2==0)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
	}    
}
