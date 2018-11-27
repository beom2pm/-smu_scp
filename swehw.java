import java.util.Scanner;

public class SWEhw {
	
	int array[5] name = new string[];
	int array[11] phone = new int[];
	char array[40] email = new string[];

	string array[] contact = new string[name,phone,email];
			
	public void view(name, email, phone) {
		if(name==0)
			System.out.print("it's empty.create first!");
		else
			System.out.print(contact);
	}
	public void create() {
		Scanner name = new Scanner(System.in);
		Scanner phone = new Scanner(System.in);
		Scanner email = new Sccanner(System.in);
		
		
	}
	public void update() {
		view.show();
	}
	public void delete() {
		if (name==0)
			System.out.print("it's already empty.");
		else
			name = scanner()
		
	}
	public void home() {
		goto PIsystem;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("1.view 2.create 3.update 4.delete 0.home");
		Scanner scanner = new Scanner(System.in);
		
		case 1:
			view();
		case 2:
			create();
		case 3:
			update();
		case 4:
			delete();
		case 0:
			home();
		
		
		scanner.close();
		
	}

}
