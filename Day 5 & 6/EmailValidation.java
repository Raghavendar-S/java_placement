import java.util.*;

class EmailValidation
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the email address ");
        String str = sc.next();
        if(str.contains("com") || str.contains("in") || str.contains("net") || str.contains("org"))
        {
            System.out.print("Valid Email Address");
        }
        else
        {
            System.out.print("Invalid Email Address");
        }
    }
}