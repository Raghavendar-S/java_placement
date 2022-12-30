import java.util.*;

public class Gibbersh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text from the document");
        String str = sc.nextLine();
		str.trim();
        System.out.println("Enter the string to be found in the data:");
        String temp = sc.next();
        if(str.contains(temp))
        {
            System.out.print("String is found in the document");
        }
        else
        {
            System.out.print("String is not found in the document");
        }
	}
}