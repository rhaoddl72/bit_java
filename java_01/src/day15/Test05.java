package day15;

import javax.swing.JOptionPane;

public class Test05 {
	public static void main(String[] args) {
		
		
        String msg = JOptionPane.showInputDialog("1.list 2.update 3.delete 4.insert");
		Command list = new Command() {

			@Override
			public void exac() {
				System.out.println("*** List ****");
			}

		};


		Command update = new Command() {

			@Override
			public void exac() {
				System.out.println("*** update ****");

			}

		};


		Command delete = new Command() {

			@Override
			public void exac() {
				System.out.println("*** delete ****");

			}

		};

		Command insert = new Command() {

			@Override
			public void exac() {
				System.out.println("*** insert ****");

			}

		};

		
		
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
