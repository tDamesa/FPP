package w2l6_homework.prob2;

import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Rainbow_Listner implements ActionListener {
	private JButton b;
	private JPanel p;
	private JFrame frame;
	String storeText;

	public static void main(String[] args) {
		Rainbow_Listner r = new Rainbow_Listner();

	}

	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	JButton b5 = new JButton();
	JButton b6 = new JButton();
	JButton b7 = new JButton();

	public Rainbow_Listner() {
		frame = new JFrame();
		// frame.setLayout(null);
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		p = new JPanel();
		p.setLayout(null);
		frame.add(p);
		p.add(b1);
		b1.setBounds(0, 0, 40, 40);
		b1.setBackground(Color.red);

		p.add(b2);
		b2.setBounds(41, 0, 40, 40);
		b2.setBackground(Color.ORANGE);
		p.add(b3);
		b3.setBounds(81, 0, 40, 40);
		b3.setBackground(Color.GREEN);
		p.add(b4);
		b4.setBounds(121, 0, 40, 40);
		b4.setBackground(Color.BLUE);
		p.add(b5);
		b5.setBounds(161, 0, 40, 40);
		b5.setBackground(Color.YELLOW);
		p.add(b6);
		b6.setBounds(201, 0, 40, 40);
		b6.setBackground(Color.MAGENTA);
		p.add(b7);
		b7.setBounds(241, 0, 40, 40);
		b7.setBackground(Color.pink);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
	}

	// Implementing action listener
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();

		if (source == b1) {
			JOptionPane.showMessageDialog(source,
					source.getText() + "Red siginifies Power, energy, passion, desire, speed");
		} else if (source == b2) {
			JOptionPane.showMessageDialog(source,
					source.getText() + "Orange signifies energy, balance, enthusiasm, warmth, vibrant, expansive");
		} else if (source == b3) {
			JOptionPane.showMessageDialog(source,
					source.getText() + "Green signifies nature, environment, health, good luck, renewal");
		} else if (source == b4) {
			JOptionPane.showMessageDialog(source,
					source.getText() + "Blue siginifies peace, harmony, unity, trust, truth, security");
		} else if (source == b5) {
			JOptionPane.showMessageDialog(source,
					source.getText() + "Yello signifies joy, optimism, happiness, danger, sunshine, idealism");
		} else if (source == b6) {
			JOptionPane.showMessageDialog(source,
					source.getText() + "Purple siginifies royalty, nobility, spirituality, ceremony, mysterious");
		} else {
			JOptionPane.showMessageDialog(source, source.getText() + "Pink signifies unconditional love and nurturing");
		}

	}

}
