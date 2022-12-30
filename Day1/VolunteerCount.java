import java.util.*;
public class VolunteerCount {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int security_a,security_b,max;
        System.out.print("Enter the count of security A:");
        security_a=sc.nextInt();
        System.out.print("Enter the count of security B:");
        security_b=sc.nextInt();
        max=security_a+security_b;
        if(security_a>security_b)
        {
            System.out.print(security_a+" "+max);
        }
        else
        {
            System.out.print(security_b+" "+max);
        }
	}    
}
