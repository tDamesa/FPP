package w2l6_homework.prob1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import w2l6_homework.prob2.Rainbow_Listner;

public class StringUtility implements ActionListener {
	JButton countLBtn;
	JButton reverseLBtn;
	JButton removeDupBtn;
	JTextField input;
	JTextField output;
	JLabel lab1;
	JLabel lab2;
	private String result;

	public static void main(String[] args) {
		StringUtility st = new StringUtility();

	}

	StringUtility() {
		JFrame frame = new JFrame("String Utility");
		frame.setLayout(null);
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		countLBtn = new JButton("Count Letters");
		countLBtn.setBounds(20, 40, 150, 25);
		frame.add(countLBtn);
		countLBtn.addActionListener(this);

		reverseLBtn = new JButton("Reverse Letters");
		reverseLBtn.setBounds(20, 100, 150, 25);
		frame.add(reverseLBtn);
		reverseLBtn.addActionListener(this);

		removeDupBtn = new JButton("Remove Duplicates");
		removeDupBtn.setBounds(20, 160, 150, 25);
		frame.add(removeDupBtn);
		removeDupBtn.addActionListener(this);

		lab1 = new JLabel("inout");
		lab1.setBounds(190, 40, 40, 25);
		frame.add(lab1);

		input = new JTextField(5);
		input.setBounds(180, 65, 150, 25);
		frame.add(input);

		lab2 = new JLabel("Output");
		lab2.setBounds(190, 100, 40, 25);
		frame.add(lab2);

		output = new JTextField(5);
		output.setBounds(180, 125, 150, 25);
		frame.add(output);

	}

	public static String removeDuplicates(String str) {

		if (str.length() == 0 || str == null || str == "")
			return str;
		else {
			if (removeDuplicates(str.substring(1)).contains(str.subSequence(0, 1)))
				return removeDuplicates(str.substring(1));
			else
				return str.substring(0, 1) + removeDuplicates(str.substring(1));
		}

	}

	// Implemented action listener
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		String in = input.getText();

		if (source == countLBtn) {
			int count = 1;
			while (in.length() != 1) {
				count++;
				in = in.substring(1);
			}
			String cou = String.valueOf(count);
			output.setText(cou);
		} else if (source == reverseLBtn) {
			String str = new StringBuilder(in).reverse().toString();
			output.setText(str);
		} else {
			String str1 = removeDuplicates(in);
			output.setText(str1);
		}
	}
}
