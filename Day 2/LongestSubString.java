import java.util.*;
public class LongestSubString {
    static void FindSubstring(String s)
    {
        int max=0;
        char[] maxstr = new char[s.length()];
        char[] l = new char[s.length()];
        String p;
        for (int i=0;i<s.length();i++)
        {
            for (int j=i+1;j<s.length();j++)
            {
                p=s.substring(i,j);
                char[] g = new char[s.length()];

                for()
            }
        }
    }
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        FindSubstring(str);
	}    
}
