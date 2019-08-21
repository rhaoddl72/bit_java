package day21;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test05 {
	public static void main(String[] args) {
		new UI_5().createUI();
	}

}

class UI_5 extends JFrame implements ActionListener {
	// Frame f1; //AWT에서 스윙에 있는 J프레임으로바뀜
	// has a
	JButton red, blue, exit;
	Panel p1, p2;
	TextField msg;
	TextArea output;

	void createUI() {
		// super("awt UI Test~~");
		super.setTitle("awt UI Test~~");
		// 뭐지
		p1 = new Panel();
		p1.add(red = new JButton("RED"));
		p1.add(blue = new JButton("BLUE"));
		p1.add(exit = new JButton("종료"));
		add(p1, BorderLayout.SOUTH);

		p2 = new Panel();
		p2.setLayout(new GridLayout(1, 2));
		p2.add(new JLabel("메세지창"));
		p2.add(msg = new TextField(20));
		add(p2, BorderLayout.NORTH);

		add(output = new TextArea(15, 40));
		output.setFont(new Font(null,1,20));

		setSize(300, 300);
		setVisible(true);

		red.addActionListener(this);
		blue.addActionListener(this);
		exit.addActionListener(this);

		red.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				p1.setBackground(Color.red);
			}
		});

		blue.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				p1.setBackground(Color.blue);
			}
		});

		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				p1.setBackground(Color.BLACK);
				System.exit(0);
			}
		});

		// f1.addWindowListener(new windowEventP());
		/*
		 * addWindowListener(new WindowAdapter() { public void windowClosing(WindowEvent
		 * e) { setVisible(false); dispose(); System.exit(0); } });
		 */

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// J프레임에서는 위에주석을 한문장으로 표현가능

		msg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.append(msg.getText() + "\n");
				msg.setText("");
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {
		case "red":
			p1.setBackground(Color.red);
			break;
		case "blue":
			p1.setBackground(Color.blue);
			break;
		case "exit":
			System.exit(0);
		default:
			break;
		}

		// System.out.println("ActionEvent 발생");
		// System.out.println(e.getActionCommand());

	}
}
