import java.util.*;
import java.lang.Math;
public class Series1 {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array:");
        int size=sc.nextInt();
        System.out.print("Enter the position to get the element:");
        int index=sc.nextInt();
        int m=1,n=1;
        int[] arr= new int[size];
        arr[0]=arr[1]=1;
        for(int j=2;j<size;j++)
        {
            if(j%2==0)
            {
                arr[j]=(int) Math.pow(2,m);
                m++;
            }
            else if(j%2!=0)
            {
                    arr[j]=(int) Math.pow(3,n);
                    n++;
            }
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("The "+index+"th element is "+arr[index-1]);
	}    
}
