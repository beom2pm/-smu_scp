package pi_system;
import java.util.Scanner;
import pi_system.pi_main;

class ManageContacts{ 
	String [][] contacts = new String[50][3];
	int connum = 0;
	int selectNum;
	
	Scanner scanner = new Scanner(System.in);
 
 	public void create(String name,String tel,String mail){ 
 		contacts[connum][0] = name;
 		contacts[connum][1] = tel;
 		contacts[connum][2] = mail;
 		
 		connum++;
 		System.out.println("저장되었습니다.");}
 		
 			
 	public void view(int viewnum){ 
 		 
 		int latest = viewnum - 1; 
 		if(contacts[latest][0] == null){ 
 			System.out.println("it's empty!"); 
 		} 
 		else{ 
 				System.out.println("name : "+ contacts[latest][0]); 
 				System.out.println("tel : " + contacts[latest][1]); 
 				System.out.println("mail : " + contacts[latest][2]); 
 				System.out.println(""); 
 		} 
 	} 
 		 
 	 
 	public void update(int selectnum,int updatenum,String updateInfo){ 
 
 
 			contacts[selectnum-1][updatenum] = updateInfo; 
 		 
 	} 
 	 
 	public void delete(String selectname){ 
 		
 		char yn; 
 		int i; 
 		
 		System.out.println("select name : "); 
 		String deletename = scanner.next(); 
 		System.out.println("Are you sure? y/n"); 
 		yn = scanner.next().charAt(0); 
 		if(yn == 'y'){ 
 			for(i=0;i<3;i++){ 
 				if(scanner.equals(deletename))
 				contacts[connum][i]= null; 
 				 
 			}	 
 		} 
 	}
 	
 	public static void main_contacts() {
 		Scanner scanner = new Scanner(System.in); 
 	
 		int selectnum; 
 		String selname; 
 		int updatenum; 
 		String name, tel, mail; 
 		ManageContacts pb = new ManageContacts(); 
 		 
 		while(true){ 
 			System.out.println("1.Create"); 
 			System.out.println("2.View"); 
 			System.out.println("3.Update"); 
 			System.out.println("4.Delete"); 
 			System.out.println("0.Home"); 
 			System.out.println("Select : "); 
 			selectnum = scanner.nextInt(); 
 			System.out.println(">>>>>>>>>>>>\n"); 
 			 
 			if (selectnum == 0) 
 				break; 
 			else{ 
 				switch(selectnum){ 
 				case 1 :  
 					System.out.println("이름, 번호, 메일을 입력하시오.(띄어쓰기로 구분)\n"); 
 					System.out.println("name : "); 
 					name = scanner.next(); 
 					System.out.println("tel : "); 
 					tel = scanner.next(); 
 					System.out.println("mail : "); 
 					mail = scanner.next();
 					pb.create(name, tel, mail); 
 					break; 
 				case 2 : 
 					System.out.println("주소록의 사람들"); 
 					selectnum = scanner.nextInt(); 
 					pb.view(selectnum); 
 					break; 
 				case 3 : 
 					String updateInfo = null; 
 					System.out.println("Select a name : "); 
 					String selectname = scanner.next(); 
 					System.out.println("1. name\n2. tel\n3. mail\n"); 
 					System.out.println("select number to update : "); 
 					updatenum = scanner.nextInt(); 
 					if(updatenum == 1){ 
 						System.out.println("new name: "); 
 						updateInfo = scanner.next(); 
 					} 
 					if(updatenum == 2){ 
 						System.out.println("new telephone : "); 
 						updateInfo = scanner.next(); 
 					} 
 					if(updatenum == 3){ 
 						System.out.println("new e-mail : "); 
 						updateInfo = scanner.next(); 
 					} 
 					pb.update(selectnum,updatenum,updateInfo); 
 					break; 
 				case 4 : 
 					System.out.println("삭제할 이름 : "); 
 					selectname = scanner.next(); 
 					pb.delete(selectname);
 					break; 
 				} 
 	 
 			} 
 		} 
 	} 
 }  
