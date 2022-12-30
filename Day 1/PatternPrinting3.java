import java.util.*;
public class PatternPrinting3 {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1; i<=n; ++i) {
            for (int space = 1; space <= n - i; ++space) {
              System.out.print("  ");
            }
            for (int k=0;k<2*i-1;k++) {
              System.out.print("* ");
            }
            System.out.println();
	    }    
    }
}