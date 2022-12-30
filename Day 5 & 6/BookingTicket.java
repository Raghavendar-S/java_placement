import java.util.*;

class SeatReservation
{
    int n,size;
    int arr[][];
    int booking[];
    SeatReservation(int n,int size,int arr[][],int booking[])
    {
        this.n=n;
        this.size=size;
        this.arr=arr;
        this.booking=booking;
    }
    void booking()
    {
        int k=0;
        for(int i=0;i<n;i++)
        {   
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==booking[k%size])
                {
                    arr[i][j]=0;
                    k++;
                }    
            }
        }
    }
    void display()
    {
        for(int i=0;i<n;i++)
        {   
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]>0 && arr[i][j]<10)
                    System.out.print("0"+arr[i][j]+" ");
                else
                    System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Your ticket has been booked successfully");
    }
}

class Cancellation
{
    int n,delete_element;
    int arr[][];
    int temp[][];
    Cancellation(int n,int delete_element,int arr[][],int temp[][])
    {
        this.n=n;
        this.delete_element=delete_element;
        this.arr=arr;
        this.temp=temp;
    }
    void cancel()
    {
        int flag=0;
        for(int i=0;i<n;i++)
        {   
            for(int j=0;j<n;j++)
            {
                if(delete_element==temp[i][j] && arr[i][j]==0)
                {
                    arr[i][j]=delete_element;
                    flag=1;
                }                
            }
        }
        if(flag==1)
        {
            System.out.println("Your ticket has been cancelled successfully");
        }
        else
        {
            System.out.println("The ticket has not been booked");
        }
    }
    void display()
    {
        for(int i=0;i<n;i++)
        {   
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]>0 && arr[i][j]<10)
                    System.out.print("0"+arr[i][j]+" ");
                else
                    System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}

class BookingTicket
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int n=10,size,delete_element,choice;
        int[][] arr = new int[n][n];
        int temp[][] = new int[n][n];
        int count=1;
        char ch;
        for(int i=0;i<n;i++)
        {   
            for(int j=0;j<n;j++)
            {
                arr[i][j]=count;
                count++;
            }
        }
        for(int i=0;i<n;i++)
        {   
            for(int j=0;j<n;j++)
            {
                temp[i][j]=arr[i][j];
            }
        }
        System.out.println("Seats available in the theater");
        for(int i=0;i<n;i++)
        {   
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]>0 && arr[i][j]<10)
                    System.out.print("0"+arr[i][j]+" ");
                else
                    System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("1.Booking Ticket");
        System.out.println("2.Ticket cancellation");
        do{
            System.out.print("Enter your choice:");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter the number of seats to be booked:");
                    size=sc.nextInt();
                    System.out.print("Enter the seat number to be booked:");
                    int[] booking = new int[size];
                    for(int i=0;i<size;i++)
                    {
                        booking[i] = sc.nextInt();
                    }
                    Arrays.sort(booking);
                    SeatReservation s = new SeatReservation(n, size, arr, booking);
                    s.booking();
                    s.display();
                    break;
                case 2:
                    System.out.print("Enter the seat number to be canceled to be deleted:");
                    delete_element=sc.nextInt();
                    Cancellation c = new Cancellation(n, delete_element, arr, temp);
                    c.cancel();
                    c.display();
                    break;
                default:
                    System.out.print("Invalid choice");
            }
            System.out.print("Do you want to continue(y/n)");
            ch = sc.next().charAt(0);
        }while(ch=='y');
    }
}