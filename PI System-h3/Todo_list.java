package pi_system;
import java.util.Scanner;
import pi_system.pi_main;

public class Todo_list {
	static String todoselect_num;
	static String [][]todo_array= new String[20][4];
	static String title;
	static String description;
	static String date;
	static String due;
	static Scanner scanner =new Scanner(System.in);
	static int array_num=0;
	
	public static void List_create(String title1, String description1, String date1, String due1) {
	   
		
		todo_array[array_num][0]=title1;
		todo_array[array_num][1]=description1;
		todo_array[array_num][2]=date1;
		todo_array[array_num][3]=due1;
		
		array_num++;
		
		
		
	}
	public static void List_view() {
		for(int i=0;i<todo_array.length;i++) {
			if(todo_array[i][0]==null)
				break;
		System.out.println("타이틀: "+ todo_array[i][0]);
		System.out.println("description:"+ todo_array[i][1]);
		System.out.println("date:"+ todo_array[i][2]);
		System.out.println("due:"+ todo_array[i][3]);
		}
		
		
	}
	public static void List_update() {
		int i;
		System.out.print("타이틀:");
		title=scanner.next();
		for(i=0; i<20; i++) {
			if(todo_array[i][0].equals(title))
				break;
		}
		
		String update_num;
		System.out.print("Update할 부분의 번호 선택(1.타이틀& 2.description & 3.date &4.due):");
		update_num= scanner.next();
		
		
		
		if(update_num.equals("1")) {
			System.out.print("타이틀:");
			title=scanner.next();
			todo_array[i][0]=title;
		}
		else if(update_num.equals("2")) {
			System.out.print("description:");
			description=scanner.next();
			todo_array[i][1]=description;
		}
		else if(update_num.equals("3")) {
			System.out.print("date:");
			date=scanner.next();
			todo_array[i][2]=date;
		}
		else if(update_num.equals("4")) {
			System.out.print("date:");
			date=scanner.next();
			todo_array[i][3]=date;
		}
		
		
		
	}
	public static void List_delete(String delete_title) {
		int i;
		for(i=0;i<20;i++) {
			if(todo_array[i][0].equals(delete_title))
				break;
		}
		for(int j=0;j<4;j++) {
		todo_array[i][j]=null;
		}
		
	}
	
	

	public static void main(String[] args) {
	
		todo_array=new String[25][100];
		while(true) {
		System.out.println("<1. Create 2.View 3. Update 4. Delete 0. Home>");
		System.out.print("Select:");
		
		todoselect_num= scanner.next();
		Todo_list todo=new Todo_list();
	
		
		if(todoselect_num.equals("1")) {

			System.out.print("타이틀:");
			title=scanner.next();
		
			System.out.print("description:");
			description=scanner.next();
			
			System.out.print("date:");
		    date=scanner.next();
			
			System.out.print("due:");
			due=scanner.next();
			
		
			todo.List_create(title, description, date, due);
		}
		
		else if(todoselect_num.equals("2")) 
			todo.List_view();

		else if(todoselect_num.equals("3"))
			todo.List_update();
			
		else if(todoselect_num.equals("4")) {
			System.out.print("타이틀:");
			title=scanner.next();
		
			todo.List_delete(title);
		}
			
		else if(todoselect_num.equals("0"))
			break;
		
			
		
		
		
	}
	}
	

}
