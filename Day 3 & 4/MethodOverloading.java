import java.util.*;

class MethodOverloading
{
    public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("List of Shapes");
        System.out.println("1.Circle");
        System.out.println("2.Rectangle");
        System.out.println("3.Triangle");
        System.out.print("Enter your choice:");
        int type=sc.nextInt();
        if(type==1)
        {
            System.out.print("Enter the radius of the Circle:");
            double radius=sc.nextDouble();
            Circle c = new Circle(radius);
            c.computeArea();
        }
        else if(type==2)
        {
            System.out.print("Enter the length of the Rectangle:");
            double length=sc.nextDouble();
            System.out.print("Enter the breath of the Rectangle:");
            double breadth=sc.nextDouble();
            Rectangle r = new Rectangle(length,breadth);
            r.computeArea();
        }
        else if(type==3)
        {
            System.out.print("Enter the base of the Triangle:");
            double base=sc.nextDouble();
            System.out.print("Enter the height of the Triangle:");
            double height=sc.nextDouble();
            Triangle t = new Triangle(base,height);
            t.computeArea();
        }
        else
        {
            System.out.print("Invalid choice");
        }
    }   
}

class Shape{
    Double area;
    public void computeArea()
    {
        area=0.0;
    }
}

class Circle extends Shape
{
    Double radius;
    Circle(double r)
    {
        this.radius=r;
    }
    public void computeArea()
    {
        System.out.print("Area of the Circle = "+String.format("%.2f",3.14*radius*radius));
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
    public void computeArea()
    {
        System.out.print("Area of the Rectangle = "+String.format("%.2f",length*breadth));
    }
}

class Triangle extends Shape
{
    Double base;
    Double height;
    Triangle(double b,double h)
    {
        this.base=b;
        this.height=h;
    }
    public void computeArea()
    {
        System.out.print("Area of the Triangle = "+String.format("%.2f",0.5*base*height));
    }
}