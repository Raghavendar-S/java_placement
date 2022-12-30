import java.util.*;
public class Array{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the array elements:");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The new array is:");
        for(int j=0;j<n;j++)
        {
            if(arr[j]%10!=0)
            {
                System.out.print(arr[j]+" ");    
            }
        }
        for(int j=0;j<n;j++)
        {
            if(arr[j]%10==0)
            {
                System.out.print(arr[j]+" ");    
            }
        }
    }
}