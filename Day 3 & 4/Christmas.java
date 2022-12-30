import java.util.*;

class Christmas
{
    public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        if (days == 1) {
            System.out.println("You cannot generate christmas tree");
        } else if (days > 20) {
            System.out.println("Tree is no more");
        } else {
        
        for(int part=1;part<days;part++){
            if(part==1){
                fun(1,days+1,days);
            }   
            else{
                fun(2,days-part+2,days);
            }
        }  

            // Stand
            for (int i = 1; i <= days; i++) {
                System.out.print("-");
            }
            System.out.print("*\n");
        }
    }
    static void fun(int start,int end,int num){
        int i,j;
            for(i = start;i<=end;i++){
                for(j = 0;j<=num-i;j++){
                    System.out.print("-");
                }
                for(j = 0;j<((2*i)-1);j++){
                    System.out.print("*");
                }
            System.out.println();
        }
    }
}