import java.util.*;

class Stall {
	String name, detail, type, ownerName;

	Stall(String name, String detail, String type, String ownerName) {
		this.name = name;
		this.detail = detail;
		this.type = type;
		this.ownerName = ownerName;
	}

	String getName() {
		return this.name;
	}

	String getDetail() {
		return this.detail;
	}

	String getType() {
		return this.type;
	}

	String getOwnerName() {
		return this.ownerName;
	}

	void setName(String name) {
		this.name = name;
	}

	void setDetail(String detail) {
		this.detail = detail;
	}

	void setType(String type) {
		this.type = type;
	}

	void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
}

public class ArrayStall {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of stall details");
		int n = input.nextInt();
		input.nextLine();
		ArrayList<Stall> stalls = new ArrayList<Stall>();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter the stall " + i + " detail");
			String temp = input.nextLine();
			String[] temps = temp.split(",");
			Stall s = new Stall(temps[0], temps[1], temps[2], temps[3]);
			stalls.add(s);
		}
		Iterator<Stall> itr = stalls.iterator();
		while (itr.hasNext()) {
			Stall temp = itr.next();
			if (!temp.getName().contains("test")) {
				System.out.printf("%-15s %-20s %-15s %s", temp.getName(), temp.getDetail(), temp.getType(),
						temp.getOwnerName());
			} 
			System.out.println("");
		}
		input.close();
	}
}