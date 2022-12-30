import java.util.Scanner;

class Item
{
    String name, type;
    int cost, availableQuantity;
    
    Item()
    {
        this.name="";
        this.type="";
        this.cost=0;
        this.availableQuantity=0;
    }
    
    Item(String n,String t,int c,int a)
    {
        this.name=n;
        this.type=t;
        this.cost=c;
        this.availableQuantity=a;
    }
    
    void setName(String name) {
		this.name = name;
	}

	void setType(String type) {
		this.type = type;
	}

	void setCost(int cost) {
		this.cost = cost;
	}

	void setavailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	String getName() {
		return this.name;
	}

	String getType() {
		return this.type;
	}

	int getCost() {
		return this.cost;
	}

	int getavailableQuantity() {
		return this.availableQuantity;
	}
}

class StringBuilderReplace
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items:");
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder("");
        System.out.println("Enter the item details in the format (Item Name$Item Type$Item Cost$Item Availability)");
        for(int j=0;j<n;j++)
        {
            String str=sc.next();
            String[] arr = str.split("[$]");
            Item i = new Item(arr[0], arr[1], Integer.valueOf(arr[2]), Integer.valueOf(arr[3]));
            sb.append(i.getName());
            sb.append(",");
            sb.append(i.getType());
            sb.append(",");
            sb.append(i.getCost());
            sb.append(",");
            if(i.availableQuantity==0)
            {
                sb.append("Not available");
                sb.append("\n");
            }
            else
            {
                sb.append("Available");
                sb.append("\n");
            }
        }
        System.out.println("Items:");
        System.out.print(sb);
    }
}

/*Wallets$Leather$123$10
Notebooks$Papers$200$0
Headphones$Electronics$800$3 */