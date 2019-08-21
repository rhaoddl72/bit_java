package java_prob;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BookApp {

	public static void main(String[] args) {
		new Gui();
	}
}

class Gui extends JFrame {
	static int num = 0;
	BookMgr mgr;
	JButton add, list, delete, search, uqdate, exit;
	TextField title, price, isbn;
	TextArea output;

	Gui() {
		mgr = new BookMgr();
		

		Panel p1 = new Panel();
		p1.add(add = new JButton("ADD"));
		p1.add(list = new JButton("list"));
		p1.add(delete = new JButton("DELETE"));
		p1.add(search = new JButton("SEARCH"));
		p1.add(exit = new JButton("EXIT"));
		add(p1, BorderLayout.SOUTH);

		Panel p2 = new Panel();
		p2.setLayout(new GridLayout(3, 2));
		p2.add(new JLabel(" ISBN   "));
		p2.add(isbn = new TextField(20));
		p2.add(new JLabel(" 제   목   "));
		p2.add(title = new TextField(20));
		p2.add(new JLabel(" 가격  "));
		p2.add(price = new TextField(20));

		add(p2, BorderLayout.NORTH);

		add(output = new TextArea(15, 40));
		    //입력받을창만드는 변수
		output.setFont(new Font(null, 1, 20));
             
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		list.addActionListener((e) -> {
			  //버튼을눌렀을떄 어떤식으로 시행할지정해주는함수
			mgr.booklist().forEach(i -> output.append(i + "\n"));

		});
		add.addActionListener(e -> {
			// int p = 0;

			int p = Integer.parseInt(price.getText());
			boolean b = mgr.addbook(new Book(++num, title.getText(), p));
			if (b) {
				output.setText("등록 성공");
			} else {
				output.setText("등록 실패");
			}

		});

		delete.addActionListener((e) -> {
		}

		);

		search.addActionListener((e) -> {

		});
		exit.addActionListener(e -> System.exit(0));

	}
}