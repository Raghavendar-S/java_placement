import java.util.*;

@FunctionalInterface
interface Length{  
    public void length();  
}  

class LambdaLength
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Length l1 = () -> System.out.print(str.length());
        l1.length();
    }
}