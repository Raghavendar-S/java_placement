import java.util.*;

abstract class Shape
{
    public abstract double calculatePerimeter();
}

class Abstract1
{
    public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
        Double result;
        System.out.println("List of Shapes");
        System.out.println("1.Circle");
        System.out.println("2.Rectangle");
        System.out.println("3.Square");
        System.out.print("Enter your choice:");
        int type=sc.nextInt();
        if(type==1)
        {
            System.out.print("Enter the radius of the Circle:");
            double radius=sc.nextDouble();
            Circle c = new Circle(radius);
            result=c.calculatePerimeter();
            System.out.print("The perimeter is "+String.format("%.2f",result));
        }
        else if(type==2)
        {
            System.out.print("Enter the length of the Rectangle:");
            double length=sc.nextDouble();
            System.out.print("Enter the breath of the Rectangle:");
            double breadth=sc.nextDouble();
            Rectangle r = new Rectangle(length,breadth);
            result=r.calculatePerimeter();
            System.out.print("The perimeter is "+String.format("%.2f",result));   
        }
        else if(type==3)
        {
            System.out.print("Enter the side of the Square:");
            double side=sc.nextDouble();
            Square s = new Square(side);
            result=s.calculatePerimeter();
            System.out.print("The perimeter is "+String.format("%.2f",result));
        }
        else
        {
            System.out.print("Invalid choice");
        }
    }   
}

class Circle extends Shape
{
    Double radius;
    Circle(double r)
    {
        this.radius=r;
    }
    public double calculatePerimeter()
    {
        return 2*3.14*radius;
    }
}

class Rectangle extends Shape
{
    Double length;
    Double breadth;
    Rectangle(double l,double b)
    {
        this.length=l;
        this.breadth=b;
    }
    public double calculatePerimeter()
    {
        return 2*(length+breadth);
    }
}

class Square extends Shape
{
    Double side;
    Square(double s)
    {
        this.side=s;
    }
    public double calculatePerimeter()
    {
        return 4*side;
    }
}