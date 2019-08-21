package day19_web;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test06_Command {

	public static void main(String[] args) {
		
		Map<String,Command> map = new HashMap<String,Command>();
		
		map.put("delete", new DeleteCommand());
		map.put("update", new UpdateCommand());
		map.put("insert", new InsertCommand());
		map.put("select", new SelectCommand());
		map.put("new", new Command() {

			@Override
			public void exec() {
				System.out.println("기능 추가");
				
			}
			
		} );
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("delete update select insert new 중 하나 입력 하세요");
		String cmd = scanner.nextLine(); //delete update select insert
		//map.get(cmd).exec();
		Command command = map.get(cmd);
		if(command != null) command.exec();
		
	
		
		/*Command delete = new DeleteCommand();
		Command update = new UpdateCommand();
		Command select = new SelectCommand();
		Command insert = new InsertCommand();
		
		String cmd = scanner.nextLine();
		
	   /* switch (cmd) {
		case "insert":
			insert.exec();
			
			break;

		case "update":
			update.exec();
			break;
		case "select":
			select.exec();
			break;
		case "delete":
			delete.exec();
			break;
		default:
			System.out.println("잘못입력");
			break;
		*/}

	
		
	

	}


