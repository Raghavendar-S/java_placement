import java.util.*;
public class MissingRegistrationID {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int i=0;
        while(i<n)
        {
            int flag=0;
            if(i<n-1 && arr[i]==arr[i+1])
            {
                flag=1;
                i++;
            }
            if(flag==0)
            {
                System.out.print(arr[i]);
                break;
            }
            i++;
        }
	}    
}
