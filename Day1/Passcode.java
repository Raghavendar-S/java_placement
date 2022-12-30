import java.util.*;
public class Passcode {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n/100==n%100)
        {
            System.out.print("Passcode matched!\nHi Secret Seven");
        }
        else{
            System.out.print("Sorry! Passcode mismatched");
        }
    }    
}
