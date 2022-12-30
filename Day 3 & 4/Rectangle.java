import java.util.*;
class Area
{
    int length;
    int width;
    Area (int l,int b)
    {
        this.length=l;
        this.width=b;
    }
    public void display()
    {
        System.out.println("The area of the rectangle is "+length*width);
    }
}
class Circle
{
    int radius;
    Circle(int r)
    {
        this.radius=r;
    }
    public void display()
    {
        System.out.println("The area of the circle is "+3.14*radius*radius);
    }
}
public class Rectangle {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length and width of the rectangle:");
        int length=sc.nextInt();
        int width=sc.nextInt();
        Area a = new Area(length,width);
        a.display();
        System.out.print("Enter the radius of the circle:");
        int radius = sc.nextInt();
        Circle c = new Circle(radius);
        c.display();
	}    
}

