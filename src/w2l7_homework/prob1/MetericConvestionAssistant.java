package w2l7_homework.prob1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MetericConvestionAssistant extends JFrame {

	public static void main(String[] args) {
		MetericConvestionAssistant mac = new MetericConvestionAssistant();

	}

	JLabel mile;
	JLabel pound;
	JLabel gallon;
	JLabel faranite;
	JLabel kilometer;
	JLabel kilogram;
	JLabel liter;
	JLabel centigrade;
	JTextField miletext;
	JTextField poundtext;
	JTextField gallontext;
	JTextField faranitetext;
	JTextField kilometertext;
	JTextField kilogramtext;
	JTextField litertext;
	JTextField centigradetext;
	JButton convert;

	public MetericConvestionAssistant() {
		setLayout(null);
		setTitle("Meteric Convestion Assistant");
		setSize(800, 800);
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mile = new JLabel("Mile:");
		mile.setBounds(20, 40, 80, 25);
		add(mile);

		miletext = new JTextField(5);
		miletext.setBounds(100, 40, 80, 25);
		add(miletext);

		kilometer = new JLabel("Kilometer:");
		kilometer.setBounds(220, 40, 80, 25);
		add(kilometer);

		kilometertext = new JTextField(5);
		kilometertext.setBounds(310, 40, 80, 25);
		add(kilometertext);

		pound = new JLabel("Pound:");
		pound.setBounds(20, 100, 80, 25);
		add(pound);

		poundtext = new JTextField(5);
		poundtext.setBounds(100, 100, 80, 25);
		add(poundtext);

		kilogram = new JLabel("Kilogram:");
		kilogram.setBounds(220, 100, 80, 25);
		add(kilogram);

		kilogramtext = new JTextField(5);
		kilogramtext.setBounds(310, 100, 80, 25);
		add(kilogramtext);

		gallon = new JLabel("Gallon:");
		gallon.setBounds(20, 160, 80, 25);
		add(gallon);

		gallontext = new JTextField(5);
		gallontext.setBounds(100, 160, 80, 25);
		add(gallontext);

		liter = new JLabel("Liter:");
		liter.setBounds(220, 160, 80, 25);
		add(liter);

		litertext = new JTextField(5);
		litertext.setBounds(310, 160, 80, 25);
		add(litertext);

		faranite = new JLabel("Faranite:");
		faranite.setBounds(20, 220, 80, 25);
		add(faranite);

		faranitetext = new JTextField(5);
		faranitetext.setBounds(100, 220, 80, 25);
		add(faranitetext);

		centigrade = new JLabel("Centigrade:");
		centigrade.setBounds(220, 220, 80, 25);
		add(centigrade);

		centigradetext = new JTextField(5);
		centigradetext.setBounds(310, 220, 80, 25);
		add(centigradetext);

		convert = new JButton("Convert");
		convert.setBounds(150, 300, 80, 25);
		add(convert);
		// Implementing action listener by using Lambda
		convert.addActionListener(evt -> {
			double mil = Double.valueOf(miletext.getText());
			double gall = Double.valueOf(gallontext.getText());
			double poun = Double.valueOf(poundtext.getText());
			double far = Double.valueOf(faranitetext.getText());

			double km = mil * 1.6;
			kilometertext.setText(String.valueOf(km));
			double kg = poun * 0.45;
			kilogramtext.setText(String.valueOf(kg));
			double l = gall * 3.78;
			litertext.setText(String.valueOf(l));
			double c = far * -17.22;
			centigradetext.setText(String.valueOf(c));

		});
	}

}
