import java.util.*;
public class LetterOccurence {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n=str.length();
        char ch = sc.next().charAt(0);
        int count=0;
        for (int i=0;i<n;i++)
        {
            if(str.charAt(i)==ch)
            {
                count++;
            }
        }
        System.out.print(count);
    }     
}
