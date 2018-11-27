package h2_main.java;
import java.util.Scanner;

public class Main_h2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	
		String select_num;
		System.out.print("<1.Manage Contacts  2.Manage To-do list  3.Manage Appointments> Select:");
		Scanner scanner =new Scanner(System.in);
		select_num= scanner.next();
		
		ManageContacts contact= new ManageContacts();
		Todo_list todo= new Todo_list();
		ManageAppointment appointment = new ManageAppointment();
		

	}

}
