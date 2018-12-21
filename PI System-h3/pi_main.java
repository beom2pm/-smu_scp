package pi_system;

import java.util.Scanner;


public class pi_main {
	

	public static void main(String[] args) {

		

		// TODO Auto-generated method stub
		String select_num;

		System.out.print("<1.Manage Contacts  2.Manage To-do list  3.Manage Appointments> Select:");

		Scanner scanner =new Scanner(System.in);

		select_num= scanner.next();



		if(select_num.equals("1"))
			ManageContacts.main_contact();
			 

		else if(select_num.equals("2")) {
			Todo_list.main_todo();
		}
		
		else if(select_num.equals("3"))
			ManageAppointment.main_appointment();

		

}



}
