import java.util.Scanner;

class Patient
{
    String name;
    int age;
    char gender;
    void get(String s,int a,char g)
    {
        this.name=s;   
        this.age=a;
        this.gender=g;
    }
    void display()
    {
        System.out.println("Patient's Name:"+name);
        System.out.println("Patient's Age:"+age);
        System.out.println("Patient's Sex:"+gender);
    }
}
class Inpatient extends Patient
{
    int ipatient_no;
    String date_of_admission;
}   
class Outpatient extends Patient
{
    int opatient_no;
    String date_of_discharge;
} 
class Specialward extends Inpatient
{

}
class Generalward extends Inpatient
{
    int day;
    int ebill;
    int rent;
    void get1(int d,int e, int r)
    {
        this.day=d;
        this.ebill=e;
        this.rent=r;
    }
    void calc()
    {
        int total=day*rent+ebill;
        System.out.print("Total amount of bill is "+total);
    }
}
public class PatientRecord
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("If patient is indoor or outdoor:");
        char status=sc.next().charAt(0);
        System.out.print("patient is admitted to special or general ward:");
        char status1=sc.next().charAt(0);
        if(status=='i')
        {
            Inpatient i = new Inpatient();
            System.out.print("Enter the name of the patient:");
            String name=sc.next();
            System.out.print("Enter the age:");
            int age=sc.nextInt();
            System.out.print("Enter Sex:");
            char sex=sc.next().charAt(0);
            i.get(name,age,sex);
            if(status1=='g')
            {
                Generalward g = new Generalward();
                System.out.print("Enter the number of days in hospital:");
                int days=sc.nextInt();
                System.out.print("What is the per day rent?");
                int rent=sc.nextInt();
                System.out.print("Enter eb_bill:");
                int ebill=sc.nextInt();
                g.get1(days,ebill,rent);
                g.calc();
            }
            else
            {
                Specialward s = new Specialward();
            }
        }
        else
        {
            Outpatient o = new Outpatient();
            System.out.print("Enter the name of the patient:");
            String name=sc.next();
            System.out.println("Enter the age:");
            int age=sc.nextInt();
            System.out.println("Enter Sex:");
            char sex=sc.next().charAt(0);
            o.get(name,age,sex);
        }
    }
}