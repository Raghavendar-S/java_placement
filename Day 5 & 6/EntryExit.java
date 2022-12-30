import java.util.*;
class EntryExit
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines:");
        int n = sc.nextInt();
        sc.nextLine();
        int count=0;
        for(int i=1;i<=n;i++)
        {
            String str=sc.nextLine();
            String parts[] = str.split(" ");
            for(String part: parts) {
                if(part.contains("Entry"))
                {
                    count++;
                }
                else
                {
                    count--;
                }
            }
        }
        System.out.print(count);
    }
}