package day14;

import javax.swing.JOptionPane;

public class Commandtest {

	public static void main(String[] args) {
		
		Command cmd = new ListCommand();
		String key = JOptionPane.showInputDialog("List/delete/insert/update 중 하나 입력");
		//Joptionpane 커맨드창띄우기
		
		switch (key) {
		case "List":
		cmd = new ListCommand();
		break;
		case "Delete":
		cmd = new DeleteCommand();
		break;
		case "Insert":
			cmd = new InsertCommand();
		break;
		case "Update":
			cmd = new UpdateCommand();
		break;
		default:
			break;
		}
		
		
		cmd.exec();
		cmd.check();

	}

}
