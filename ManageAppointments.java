import java.util.Scanner;

class ManageAppointment{
	
	String [][] appointment = new String[20][3];
	int appointment_num=0;
	int selected_num;
	String Date;
	String Locations;
	String Persons;
	Scanner s = new Scanner(System.in);
	
	public void app_Create(){
		
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
		int i;
		
		for (i=0;i<20;i++){
			if(appointment[0][0].equals(selected_num)){
				System.out.println("AppointmentOrder : "+ appointment[i][0]);
				System.out.println("Date : "+ appointment[i][1]);
				System.out.println("Locations : " + appointment[i][2]);
				System.out.println("Persons : " + appointment[i][3]);
			}
		}
				
		}
		
				
	
	public void app_Update(){
		System.out.println("Select an appointment number : ");
		selected_num = s.nextInt();
		
		int selected_UpdateNum;
		
		System.out.println("1. Date\n2. Locations\n 3. Persons\n");
		System.out.println("Choose the number to update : ");
		
		selected_UpdateNum = s.nextInt();
		
		if(selected_UpdateNum == 1){
			System.out.println("Enter new date : ");
			Date = s.next();
		}
		if(selected_UpdateNum == 2){
			System.out.println("Enter new Locations : ");
			Locations = s.next();
		}
		if(selected_UpdateNum == 3){
			System.out.println("Enter new Persons : ");
			Persons = s.next();
		}
		}
	
	public void app_Delete(){
		int selected_DeleteNum;
		char YesOrNo;
		System.out.println("Choose the number to delete : ");
		selected_DeleteNum = s.nextInt();
		System.out.println("Are you sure(y/n)? ");
		YesOrNo = s.next().charAt(0);
		if(YesOrNo == 'y'){
			
		}
		
		
	}
		
	
}
public class ManageAppointments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int select_num;
		System.out.println("1.Create");
		System.out.println("2.View");
		System.out.println("3.Update");
		System.out.println("4.Delete");
		System.out.println("0.Home");
		System.out.println("Select : ");
		select_num = scanner.nextInt();
		ManageAppointment manageApp = new ManageAppointment();
		
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

	
	
	

