package day15;

import javax.swing.JOptionPane;

public class Test06 {
	public static void main(String[] args) {
	 String msg = JOptionPane.showInputDialog("1.list 2.update 3.delete 4.insert");
		
	 
	 
	 
	 Command list = 

			 () ->
				 System.out.println("*** list****");
			

		        


		Command update =  
			() -> 

				System.out.println("*** update ****");

			

		


		Command delete =  
			() -> 

				System.out.println("*** delete ****");

			

		

		Command insert =  
		() -> 
			

				System.out.println("*** insert ****");
			

		

		
		
		switch (msg) {
		case "1":
			list.exac();
			break;
			
			case "2":
				update.exac();
				break;
			case "3":
				delete.exac();
				break;
			case "4":
				insert.exac();
				break;
			default:
				break;
		}

	}
}


