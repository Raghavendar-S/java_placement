import java.util.*;
public class MaxMin {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);    
        for(int i=0,j=n-1;i<j;i++,j--)
        {        
            System.out.print(arr[j]+" "+arr[i]+" ");
        }
        if(n%2!=0)
        {
            System.out.print(arr[n/2]);
        }
    }     
}
