import java.util.Scanner;

class ManageAppointment{
	
	String [][] appointment = new String[20][4];
	int appointment_num=0;
	int selected_num;
	Scanner s = new Scanner(System.in);
	
	public void app_Create(){
		System.out.println("<Enter 4 categories.>\n");
		System.out.println("AppointmentNumber : ");
		appointment[appointment_num][0] = s.next();
		System.out.println("Date : ");
		appointment[appointment_num][1] = s.next();
		System.out.println("Locations : ");
		appointment[appointment_num][2] = s.next();
		System.out.println("Persons : ");
		appointment[appointment_num][3] = s.next();
		appointment_num++;
	}
	
	
	public void app_View(){
		System.out.println("Select an appointment number : ");
		selected_num = s.nextInt();
		int show_num = selected_num - 1;
		if(appointment[show_num][0] == null){
			System.out.println("Deleted Appointment!");
		}
		else{
				System.out.println("AppointmentNumber : "+ appointment[show_num][0]);
				System.out.println("Date : "+ appointment[show_num][1]);
				System.out.println("Locations : " + appointment[show_num][2]);
				System.out.println("Persons : " + appointment[show_num][3]);
				System.out.println("");
		}
	}
		
	
	public void app_Update(){
		System.out.println("Select an appointment number : ");
		selected_num = s.nextInt();
		int selected_UpdateNum;
		
		System.out.println("1. Date\n2. Locations\n3. Persons\n");
		System.out.println("Choose the number to update : ");
		
		selected_UpdateNum = s.nextInt();
		
		if(selected_UpdateNum == 1){
			System.out.println("Enter new date : ");
			appointment[selected_num-1][1] = s.next();
		}
		if(selected_UpdateNum == 2){
			System.out.println("Enter new Locations : ");
			appointment[selected_num-1][2] = s.next();
		}
		if(selected_UpdateNum == 3){
			System.out.println("Enter new Persons : ");
			appointment[selected_num-1][3] = s.next();
		}
	}
	
	public void app_Delete(){
		
		int selected_DeleteNum;
		char YesOrNo;
		int i;
		System.out.println("Choose the number to delete : ");
		selected_DeleteNum = s.nextInt();
		System.out.println("Are you sure(y/n)? ");
		YesOrNo = s.next().charAt(0);
		if(YesOrNo == 'y'){
			for(i=0;i<4;i++){
				appointment[selected_DeleteNum-1][i]= null;
				
			}	
		}
	}	
}

public class ManageAppointments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int select_num;
		ManageAppointment manageApp = new ManageAppointment();
		
		while(true){
			System.out.println("\n1.Create");
			System.out.println("2.View");
			System.out.println("3.Update");
			System.out.println("4.Delete");
			System.out.println("0.Home\n");
			System.out.println("Select : ");
			select_num = scanner.nextInt();
			System.out.println("-----------------\n");
			
			if (select_num == 0)
				break;
			else{
				switch(select_num){
				case 1 : 
					manageApp.app_Create();
					break;
				case 2 :
					manageApp.app_View();
					break;
				case 3 :
					manageApp.app_Update();
					break;
				case 4 :
					manageApp.app_Delete();
					break;
				}
	
			}
		}
	}
}

	
	
	

