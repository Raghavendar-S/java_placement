import java.util.*;
import java.util.stream.Collectors;

class Person{
    String fname,lname;
    int age;
    Person(String a,String b,int c){
        fname=a;
        lname=b;
        age=c;
    }
    String getfname(){
        return this.fname;
    }
     String getlname(){
        return this.lname;
    }
    int getage(){
        return this.age;
    }
}
public class Streams
{
    public static <T> Set<T>
    findDuplicateInStream(List<T> list)
    {
        return list.stream().filter(i -> Collections.frequency(list, i) > 1).collect(Collectors.toSet());
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    /*List <Person> str = Arrays.asList(
            new Person("Charles","Dicken",60),
            new Person("Lewis","Caroll",42),
            new Person("Thomas","Alwa",51),
            new Person("Mathew","Arnold",39)
        );
	    str.stream().forEach(p->System.out.println(p.getfname()));
	    
        long count = str.stream().filter(p->p.getage()>50).count();  
        System.out.println(count); 
        
        str.stream().filter(p->p.getage()>50).forEach(p->System.out.println(p.getfname()));  
        
        System.out.println("");
        str.stream().filter(p->p.getlname().startsWith("C")).forEach(p->System.out.println(p.getfname()));*/
        /*int n = sc.nextInt();
        Integer a[] = new Integer[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        List<Integer> list = Arrays.asList(a);
        System.out.print("The maximum value is : ");
        Integer var = list.stream().max(Integer::compare).get();
        System.out.print(var);*/

        List<Integer> list1 = Arrays.asList(1, 2, 2, 8, 4, 6, 8, 10, 12);
        long total = list1.stream().count();
        System.out.println(total);

        List <Integer> sortedList1 = list1.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList1);

        
        List <Integer> sortedList2 = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList2);

        long max = list1.stream().max(Integer::compare).get();
        System.out.println(max);

        long first = list1.stream().findFirst().orElse(0);
        System.out.println(first);

        System.out.println(findDuplicateInStream(list1));
	}
}