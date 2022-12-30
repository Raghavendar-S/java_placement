import java.util.*;
public class CompanyElection {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the current year:");
        int current_year=sc.nextInt();
        System.out.print("Enter the future year:");
        int future_year=sc.nextInt();
        int chairman=0,finance=0,security=0,technical=0;
        for(int i=current_year;i<=future_year;i++)
        {
            if (chairman==0 && finance==0 && security==0 && technical==0) {
                System.out.println("All positions change in year "+i);
            }
            chairman=(chairman+1)%4;
            finance=(finance+1)%2;
            security=(security+1)%5;
            technical=(technical+1)%3;
            
        }
        
	}    
}
