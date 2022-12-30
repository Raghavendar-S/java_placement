import java.util.*;

class SeriesPattern
{
    public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int total=i*((2*i)-1);
            System.out.print(total+" ");
        }
        System.out.print("\n"+pos*((2*pos)-1)+" ");
    }
}