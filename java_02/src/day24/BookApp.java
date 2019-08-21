package day24;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BookApp {
	static int num = 0;
	public static void main(String[] args) {
		new Gui();
	}
}

class Gui extends JFrame {
	static int num = 0;
	BookMgr mgr;
	JButton add, list, delete, search, exit, save, load;
	TextField title, price, isbn;
	TextArea output;

	Gui() {
		mgr = new BookMgr();
		Panel p1 = new Panel();
		p1.add(add = new JButton("ADD"));
		p1.add(list = new JButton("LIST"));
		p1.add(delete = new JButton("DELETE"));
		p1.add(search = new JButton("SEARCH"));
		p1.add(exit = new JButton("EXIT"));
		p1.add(save = new JButton("SAVE"));
		p1.add(load = new JButton("LOAD"));
		add(p1, BorderLayout.SOUTH);
		Panel p2 = new Panel();
		p2.setLayout(new GridLayout(3, 2));
		p2.add(new JLabel("ISBN"));
		p2.add(isbn = new TextField(20));
		p2.add(new JLabel("제   목"));
		p2.add(title = new TextField(20));
		p2.add(new JLabel("가격"));
		p2.add(price = new TextField(20));
		add(p2, BorderLayout.NORTH);

		add(output = new TextArea(15, 40));
		output.setFont(new Font(null, 1, 20));

		pack();// 자동적으로 사이즈 잡아주는 애
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		list.addActionListener(e -> {
			output.setText("======Book List=======\n");
			mgr.bookList().forEach(i -> output.append(i + "\n"));
		});

		add.addActionListener(e -> {
			int p = 0;
			try {
				p = Integer.parseInt(price.getText());
			} catch (Exception e1) {
				output.setText("Book 등록 실패\n");
				output.append("가격에 문자가 포함되면 안됩니다.\n");
				output.append(e1.getMessage());
			}
			num = mgr.maxIsbn();
			boolean b = mgr.addBookList((new Book(title.getText(), p, ++num)));
			if (b) {
				output.setText("등록성공\n");
			} else {
				output.setText("등록실패\n");
			}
		});
		delete.addActionListener((e) -> {
			String title_ = null;
			try {
				title_ = title.getText();
			} catch (Exception e2) {
				output.setText("Book 삭제 실패\n");
				output.append(e2.getMessage());
			}
			boolean b = mgr.deleteBookList(title.getText());

			if (b) {
				output.setText("삭제 성공\n");
			} else {
				output.setText("삭제실패\n");
			}

		});
		search.addActionListener((e) -> {
			String title_ = null;
			List<Book> list_;
			try {
				title_ = title.getText();
			} catch (Exception e2) {
				output.setText("Book 검색 실패\n");
				output.append(e2.getMessage());
			}
			list_ = mgr.selectBookList(title.getText());
			mgr.selectBookList(title.getText()).forEach(i -> output.append(i + "\n"));
			if (list_.isEmpty()) {
				output.setText("Book 검색 실패\n");
			}

		});
		save.addActionListener((e) -> {
			mgr.save();

		});
		load.addActionListener((e) -> {
		    mgr.load(mgr.fileName);
		});

		exit.addActionListener((e) -> System.exit(0));

	}

}