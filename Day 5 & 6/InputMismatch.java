import java.util.*;

class InputMismatch
{
    public static void main(String args[]) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter an integer input ");
            int n = sc.nextInt();
            System.out.print("Entered value is "+n);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.print(e);
        }
    }
}