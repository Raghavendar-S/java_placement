import java.util.*;
public class PatternPrinting7 {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; ++i) {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    System.out.print(arr[i]);
                }
                else if(i+j==n-1)
                {
                    System.out.print(arr[j]);
                    //System.out.print(arr[i]);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }     
}
