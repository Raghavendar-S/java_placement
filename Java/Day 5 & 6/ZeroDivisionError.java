import java.util.*;

class ZeroDivisionError
{
    public static void main(String args[]) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the cost of the item for n days:");
            int n = sc.nextInt();
            System.out.print("Enter the value of n:");
            int m = sc.nextInt();
            System.out.print("Cost per day of the item is "+n/m);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.print(e);
        }
    }
}