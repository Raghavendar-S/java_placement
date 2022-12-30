import java.util.*;

public class StringEquals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Address 1:");
		String str1=sc.nextLine();
        System.out.print("Address 2:");
        String str2=sc.nextLine();
        if(str1.equals(str2))
        {
            System.out.print("RED");
        }
        else if(str1.replaceAll("\\s+", "").equals(str2.replaceAll("\\s+", "")))
        {
            System.out.print("YELLOW");
        }
        else if(str1.replaceAll("\\s+", "").equalsIgnoreCase(str2.replaceAll("\\s+", "")))
        {
            System.out.print("BLUE");
        }
        else if(!(str1.length()==str2.length()))
        {
            System.out.print("GREEN");
        }
	}
}