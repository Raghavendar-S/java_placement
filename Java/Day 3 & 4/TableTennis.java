import java.util.*;
class TableTennis{
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Get the input pattern and convert it to character array for further processing
        String sequence=sc.next();
        char[] seq=sequence.toCharArray();
        int a=0,b=0;
        for(int i=0;i<seq.length;i++)
        {
            if(seq[i]=='1')
            {
                a++;
            }
            else
            {
                b++;
            }
        }
        if(a>=b)
        {
            System.out.print("Win");
        }
        else
        {
            System.out.print("Lose");
        }
    }    
}
