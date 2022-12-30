import java.util.*;

class HashMap1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap <String,Integer> map = new HashMap <String,Integer> ();
        System.out.print("Enter the number of iterations:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the size of the hashmap:");
            int k=sc.nextInt();
            for(int j=0;j<k;j++)
            {
                System.out.print("Enter the string:");
                String str=sc.next();
                System.out.print("Enter the number:");
                int temp=sc.nextInt();
                map.put(str, temp);
            }
            System.out.print("Enter the string to be checked:");
            String str1=sc.next();        
            System.out.println("Iterating Hashmap..."); 
            if(map.containsKey(str1))
            {
                System.out.println(map.get(str1));    
            }   
            else
            {
                System.out.println("Not found");
            }
        }
    }
}