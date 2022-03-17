package contactdetails;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneNumber {
	public static String help_msg=	" \n Select \n A  Add contact  \n S  Search  \n Q  Exit :";
	public static void main(String[] args) {		
		System.out.println("\n\n*** Welcome to MyPhone Book ***\n\n");
		Scanner s=new Scanner(System.in);		
		HashMap<String , String> map1 = new HashMap<>();
		for(;;){
				System.out.print("[Main Menu] "+help_msg+"\n:");
				String command=s.nextLine().trim();				
 
				if (command.equalsIgnoreCase("A")){
					System.out.print("Type in contact details in the format: name,phone\n:");
					map1.put(s.nextLine(),s.nextLine());
					
					System.out.println(map1);
 
				}else if (command.equalsIgnoreCase("S")){
					System.out.print("Type in the name you are searching for :\n:");
					String sid= s.nextLine();
					if(map1.containsKey(sid)) {
						System.out.println(map1.get(sid));
					}
					else {
						 System.out.println("no value");
					}
						
 
				}else if (command.equalsIgnoreCase("Q")){
					System.out.println("Good Bye User....");
					System.exit(0);
				}else{					
					System.out.print("Unknown command ! Try again \n:");
				}
 
		}
 
	}

}
