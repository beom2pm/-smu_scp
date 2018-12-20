import java.util.Scanner;

class ManageAppointment{
	
	String [][] appointment = new String[20][4];
	int appointment_num=0;
	int selected_num;
	
	Scanner s = new Scanner(System.in);
	
	public void app_Create(String num,String date,String location,String person){
		
		appointment[appointment_num][0] = num;
		System.out.println("Date : ");
		appointment[appointment_num][1] = date;
		System.out.println("Locations : ");
		appointment[appointment_num][2] = location;
		System.out.println("Persons : ");
		appointment[appointment_num][3] = person;
		appointment_num++;
	}
	
	
	public void app_View(int view_num){
		
		int show_num = view_num - 1;
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
		
	
	public void app_Update(int sel_num,int update_num,String updateInfo){


			appointment[sel_num-1][update_num] = updateInfo;
		
	}
	
	public void app_Delete(int sel_num){
		
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
		int sel_num;
		int update_num;
		String num,date,location,person;
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
					System.out.println("<Enter 4 categories.>\n");
					System.out.println("AppointmentNumber : ");
					num = scanner.next();
					System.out.println("Date : ");
					date = scanner.next();
					System.out.println("Locations : ");
					location = scanner.next();
					System.out.println("Persons : ");
					person = scanner.next();
					manageApp.app_Create(num,date,location,person);
					break;
				case 2 :
					System.out.println("Select an appointment number : ");
					sel_num = scanner.nextInt();
					manageApp.app_View(sel_num);
					break;
				case 3 :
					String updateInfo = null;
					System.out.println("Select an appointment number : ");
					sel_num = scanner.nextInt();
					System.out.println("1. Date\n2. Locations\n3. Persons\n");
					System.out.println("Choose the number to update : ");
					update_num = scanner.nextInt();
					if(update_num == 1){
						System.out.println("Enter new date : ");
						updateInfo = scanner.next();
					}
					if(update_num == 2){
						System.out.println("Enter new Locations : ");
						updateInfo = scanner.next();
					}
					if(update_num == 3){
						System.out.println("Enter new Persons : ");
						updateInfo = scanner.next();
					}
					manageApp.app_Update(sel_num,update_num,updateInfo);
					break;
				case 4 :
					System.out.println("Choose the number to delete : ");
					sel_num = scanner.nextInt();
					manageApp.app_Delete(sel_num);
					break;
				}
	
			}
		}
	}
}

	
	
	

