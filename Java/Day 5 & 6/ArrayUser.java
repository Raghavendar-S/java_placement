import java.util.*;

class User {
	String name, contactNumber, userName, email;

	User(String name, String contactNumber, String userName, String email) {
		this.name = name;
		this.contactNumber = contactNumber;
		this.userName = userName;
		this.email = email;
	}

	String getName() {
		return this.name;
	}

	String getcontactNumber() {
		return this.contactNumber;
	}

	String getuserName() {
		return this.userName;
	}

	String getemail() {
		return this.email;
	}

	void setName(String name) {
		this.name = name;
	}

	void setcontactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	void setuserName(String userName) {
		this.userName = userName;
	}

	void setemail(String email) {
		this.email = email;
	}
}

class UserBO
{
    void removeUser(int n1,int n2)
    {

    }
    
}

public class ArrayUser {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of User details to be added");
		int n = input.nextInt();
		input.nextLine();
		ArrayList<User> user = new ArrayList<User>();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter the user " + i + " detail in csv format");
			String temp = input.nextLine();
			String[] temps = temp.split(",");
			User u = new User(temps[0], temps[1], temps[2], temps[3]);
			user.add(u);
		}
		Iterator<User> itr = user.iterator();
		while (itr.hasNext()) {
			User temp = itr.next();
			if (!temp.getName().contains("test")) {
				System.out.printf("%-15s %-20s %-15s %s", temp.getName(), temp.getcontactNumber(), temp.getuserName(),
						temp.getemail());
			}

		}
		input.close();
	}
}