import java.util.*;
public class TimeDegree {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the hour(0-12):");
        float hr = sc.nextFloat();
        System.out.print("Enter the minute(0-60):");
        float min = sc.nextFloat();
        min=min/5;
        float diff=Math.abs(hr-min)*30;
        if(diff>=180)
        {
            System.out.print(Math.round(360-diff));
        }
        else
        {
            System.out.print(Math.round(diff));
        }
    }     
}
