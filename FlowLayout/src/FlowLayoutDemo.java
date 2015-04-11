/*
 * 
Requirements:
	- Create a class named FlowLayoutDemo extends JFrame.
	- Create user interface using JPanels and JButtons. 
	- Add the instances of 3 JButtons using FlowLayout to JPanel named panel1 and other 3 instances of JButtons using FlowLayout to JPanel named panel2. 
	- Add panel1 and panel2 to JFrame using FlowLayout and set frame title to FlowLayout Demo.
	- Use pack method of JFrame, center the frame, and make the frame visible
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.FlowLayout;
public class FlowLayoutDemo extends JFrame
{
	private static final long serialVersionUID = -8946040297698670508L;
	//Eclipse auto generated this serial UID
	private JButton button1, button2, button3, button4, button5, button6; 
	private JPanel panel1, panel2;
	public FlowLayoutDemo()
	{				
		button1=new JButton("Button 1");
		button2=new JButton("Button 2");
		button3=new JButton("Button 3");
		button4=new JButton("Button 4");
		button5=new JButton("Button 5");
		button6=new JButton("Button 6");
		
		setLayout(new FlowLayout());		
		setSize(new Dimension(552,82));
		//Width, height
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Close the program by the X button
		setLocationRelativeTo(null);
		//Sets pop-up to center
		
		panel1= new JPanel();
		panel2= new JPanel();
		
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6);
		
		add(panel1);
		add(panel2);
		
		setTitle("FlowLayout Demo");
	}
	public static void main(String[] args) 
	{
		FlowLayoutDemo flowLayoutTest = new FlowLayoutDemo();	
	}
}