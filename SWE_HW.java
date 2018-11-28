import java.util.Scanner;

public class SWE_HW {
	
	int name;
	int phone;
	char email;

	int contact;
			
	public void view(ManageContacts) {
		if(name==0) {
			System.out.print("it's empty.create first!");
			break;}		
		else
			System.out.print(contact);
	}
	public void create() {

		System.out.print("add name");
		Scanner name = new Scanner(System.in);
		System.out.print("add phone number");
		Scanner phone = new Scanner(System.in);
		System.out.print("add email");
		Scanner email = new Scanner(System.in);
		
		contact = "name"+"phone"+"email";
	
	}
	public void update() {
		view.show();
	}
	public void delete() {
		if (name==0)
			System.out.print("it's already empty.");
		else
			name = new Scanner(System.in);
		
	}
	public void home() {
		goto PIsystem;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("1.view 2.create 3.update 4.delete 0.home");
		Scanner scanner = new Scanner(System.in);
		switch(select) {
		case "1":
			view();
			break;
		case "2":
			create();
			break;
		case "3":
			update();
			break;
		case "4":
			delete();
			break;
		case "0":
			home();
			return;
		
		
		scanner.close();
		
	}

}
