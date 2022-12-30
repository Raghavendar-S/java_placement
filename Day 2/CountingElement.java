import java.util.*;
public class CountingElement {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        /*int n = sc.nextInt();
        int count=0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
        }*/
        String num = sc.nextLine();
        int n = num.length();
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(num.charAt(i)==num.charAt(j))
                {
                    count++;
                }
            }
        }
        System.out.print(count);
    }     
}
