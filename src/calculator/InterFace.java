package calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;

public class InterFace extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	Controller C ;
	
	void addController (Controller c){
		C=c;
	}
	////////////////   functions to set  and get  String  called from another classes  
	
	protected void setTextField (String s) {
	 textField.setText(s);
	}
	
	protected String getTextField () {
		 return textField.getText() ;
		}

	/**
	 * Launch the application.
	 * 
	 *
	 */
	
	
	////////////////////////// GUI Code ///////////////////////////////////////////
	

	/**
	 * Create the frame.
	 */
	public InterFace() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 450, 529);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 15));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {if (e.getSource() == btnNewButton ){
				textField.setText("");}
			}
		});
		btnNewButton.setBackground(new Color(255, 102, 102));
		btnNewButton.setBounds(24, 152, 95, 51);
		panel.add(btnNewButton);
		
		JButton btnBackspace = new JButton("Backspace");
		btnBackspace.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 12));
		btnBackspace.setForeground(new Color(0, 0, 0));
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {if (e.getSource() == btnBackspace){
				if (!textField.getText().isEmpty())textField.setText(textField.getText().substring(0, textField.getText().length()-1));}
			}
		});
		btnBackspace.setBackground(new Color(245, 222, 179));
		btnBackspace.setBounds(145, 152, 95, 51);
		panel.add(btnBackspace);
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {if (e.getSource() == btnNewButton_1){
				textField.setText(textField.getText()+"7");}
			}
		});
		btnNewButton_1.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 24));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(24, 233, 63, 57);
		panel.add(btnNewButton_1);
		
		JButton button_3 = new JButton("8");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_3){
					textField.setText(textField.getText()+"8");}
				
				
			}
		});
		button_3.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 24));
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(117, 233, 63, 57);
		panel.add(button_3);
		
		JButton button_4 = new JButton("9");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {if (e.getSource() == button_4){
				textField.setText(textField.getText()+"9");}
			}
		});
		button_4.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 24));
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(209, 233, 63, 57);
		panel.add(button_4);
		
		JButton button_6 = new JButton("5");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {if (e.getSource() == button_6){
				textField.setText(textField.getText()+"5");}
			}
		});
		button_6.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 24));
		button_6.setBackground(Color.WHITE);
		button_6.setBounds(117, 312, 63, 57);
		panel.add(button_6);
		
		JButton button_7 = new JButton("6");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {if (e.getSource() == button_7){
				textField.setText(textField.getText()+"6");}
			}
		});
		button_7.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 24));
		button_7.setBackground(Color.WHITE);
		button_7.setBounds(209, 312, 63, 57);
		panel.add(button_7);
		
		JButton button_8 = new JButton("1");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_8){
					textField.setText(textField.getText()+"1");
					
				}
			}
		});
		button_8.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 24));
		button_8.setBackground(Color.WHITE);
		button_8.setBounds(24, 386, 63, 57);
		panel.add(button_8);
		
		JButton button_5 = new JButton("4");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_5){
					textField.setText(textField.getText()+"4");}
			}
		});
		button_5.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 24));
		button_5.setBackground(Color.WHITE);
		button_5.setBounds(24, 312, 63, 57);
		panel.add(button_5);
		
		JButton button_9 = new JButton("2");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_9){
					textField.setText(textField.getText()+"2");}
			}
		});
		button_9.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 24));
		button_9.setBackground(Color.WHITE);
		button_9.setBounds(117, 386, 63, 57);
		panel.add(button_9);
		
		JButton button_10 = new JButton("3");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_10){
					textField.setText(textField.getText()+"3");}
			}
		});
		button_10.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 24));
		button_10.setBackground(Color.WHITE);
		button_10.setBounds(209, 386, 63, 57);
		panel.add(button_10);
		
		JButton btnNewButton_2 = new JButton("+");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	if (e.getSource() == btnNewButton_2){
				textField.setText(textField.getText()+"+");}
			}
		});
		btnNewButton_2.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 24));
		btnNewButton_2.setBackground(new Color(245, 222, 179));
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setBounds(298, 439, 63, 41);
		panel.add(btnNewButton_2);
		
		JButton button_1 = new JButton("-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_1){
					textField.setText(textField.getText()+"-");}
			}
		});
		button_1.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 24));
		button_1.setBackground(new Color(245, 222, 179));
		button_1.setForeground(new Color(0, 0, 0));
		button_1.setBounds(298, 387, 63, 41);
		panel.add(button_1);
		
		JButton button_2 = new JButton("*");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	if (e.getSource() == button_2){
				textField.setText(textField.getText()+"*");}
			}
		});
		button_2.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 24));
		button_2.setBackground(new Color(245, 222, 179));
		button_2.setForeground(new Color(0, 0, 0));
		button_2.setBounds(298, 335, 63, 41);
		panel.add(button_2);
		
		JButton button_11 = new JButton("/");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_11){
					textField.setText(textField.getText()+"/");}
			}
		});
		button_11.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 24));
		button_11.setBackground(new Color(245, 222, 179));
		button_11.setForeground(new Color(0, 0, 0));
		button_11.setBounds(298, 283, 63, 41);
		panel.add(button_11);
		
		JButton button_12 = new JButton("%");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_12){
					textField.setText(textField.getText()+"%");}
			}
		});
		button_12.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 24));
		button_12.setBackground(new Color(245, 222, 179));
		button_12.setForeground(new Color(0, 0, 0));
		button_12.setBounds(298, 233, 63, 41);
		panel.add(button_12);
		
		JButton button_13 = new JButton("=");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_13){
					textField.setText(textField.getText()+"=");
					
				    C.setEquationFromView();                                 
					textField.setText(textField.getText()+C.GetResult());}
				}
			
		});
		button_13.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 24));
		button_13.setForeground(Color.BLACK);
		button_13.setBackground(new Color(245, 222, 179));
		button_13.setBounds(266, 152, 95, 51);
		panel.add(button_13);
		
		JButton btnNewButton_3 = new JButton("0");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnNewButton_3){
					textField.setText(textField.getText()+"0");}
			}
			
		});
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 24));
		btnNewButton_3.setBounds(117, 453, 63, 33);
		panel.add(btnNewButton_3);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 35));
		textField.setForeground(Color.WHITE);
		textField.setBackground(new Color(0, 0, 0));
		textField.setBounds(23, 25, 338, 82);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnSqr = new JButton("sqr");
		btnSqr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnSqr){
					textField.setText(textField.getText()+"\u221A");
					
				}
				
			}
		});
		btnSqr.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 19));
		btnSqr.setBackground(new Color(245, 222, 179));
		btnSqr.setBounds(209, 454, 63, 33);
		panel.add(btnSqr);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 24));
		lblNewLabel.setBounds(0, -117, 450, 635);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Mohammad B Obaid\\Desktop\\b1.jpg"));
		panel.add(lblNewLabel);
	}
}
