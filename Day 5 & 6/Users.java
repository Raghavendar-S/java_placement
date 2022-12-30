import java.util.*;

class User {
	String name, contactNumber, userName, email;

	User() {
		this.name = "";
		this.contactNumber = "";
		this.userName = "";
		this.email = "";
	}

	User(String name, String contactNumber, String userName, String email) {
		this.name = name;
		this.contactNumber = contactNumber;
		this.userName = userName;
		this.email = email;
	}

	void setName(String name) {
		this.name = name;
	}

	void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	void setUserName(String userName) {
		this.userName = userName;
	}

	void setemail(String email) {
		this.email = email;
	}

	String getName() {
		return this.name;
	}

	String getContactNumber() {
		return this.contactNumber;
	}

	String getUserName() {
		return this.userName;
	}

	String getemail() {
		return this.email;
	}

	void display() {
		System.out.printf("%-20s%-20s%-20s%-20s\n", this.name, this.contactNumber, this.userName, this.email);
	}

}

class UserBO extends ArrayList<User> {

	void removeUser(int start, int end) {
		removeRange(start, end);
	}

	static UserBO getList() {
		UserBO temp = new UserBO();
        temp.add(new User("mohan Raja", "9874563210", "mohan", "mohan@abc.com"));
		temp.add(new User("arjun Ravi", "4324237", "arjun", "arjun@abc.com"));
		
        UserBO predefined = new UserBO();
        predefined.add(new User("Arun kumar", "9845671230", "arun", "arun@abc.com"));
        predefined.add(new User("prakash raj", "7548921445", "prakash", "prakashraj@abc.in"));
        temp.addAll(predefined);
		return temp;
	}
}

public class Users {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		UserBO users = UserBO.getList();
		System.out.println("Enter the number of User details to be added");
		int n = input.nextInt();
		input.nextLine();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter the user " + i + " details in csv format");
			String temp = input.nextLine();
			String[] details = temp.split(",");
			User u = new User(details[0], details[1], details[2], details[3]);
			users.add(u);
		}
		System.out.printf("%-20s%-20s%-20s%-20s\n", "Name", "Contact number", "UserName", "Email");
		Iterator<User> itr = users.iterator();
		while (itr.hasNext()) {
			itr.next().display();
		}
		System.out.println("Enter the range to be removed from array list");
		int start = input.nextInt();
		int end = input.nextInt();
		users.removeUser(start, end);
		System.out.printf("%-20s%-20s%-20s%-20s\n", "Name", "Contact number", "UserName", "Email");
		itr = users.iterator();
		while (itr.hasNext()) {
			itr.next().display();
		}
		input.close();
	}
}