import java.util.*;
class Main{
    public static void main (String[] args) {
        /* code */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i=0;i<s.length();i++)
        {
            int count=1;
            while(i<n-1 && s.charAt(i)==s.charAt(i+1))
            {
                count++;
                i++;
            }
            System.out.print(s.charAt(i)+count);
        }
        
        System.out.println("");
    }
}