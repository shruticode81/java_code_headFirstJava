// {usiing inner class concept}implementation of two buttons which perform different tasks 1. changes the color 2. changes the label ( so two diiferent eventlistener to implemement).
//The Color class is a part of Java Abstract Window Toolkit(AWT) package. The Color class creates color by using the given RGBA values where RGBA stands for RED, GREEN, BLUE, ALPHA or using HSB value where HSB stands for HUE, SATURATION, BRIcomponents.
import java.awt.*;
import java.swing.*;
import java.awt.event.*;
public class TwoButtons{
	JFrame frame;
	JLabel label;
	public static void main(String[] args){
		TwoButtons gui = new TwoButtons();
		gui.go();
	}
	public void go(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton labelButton = new JButton("change Label");
		labelButton.addActionListener(new LabelListener());
		JButton colorButton = new JButton("change color");
		colorButton.addActionListener(new colorListener());

		label = new JLabel("I'm a label");
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		frame.getContentPane().add(BorderLayout.SOUTH,colorButton);
		frame.getContentPane().add(BorderLayout.CENTER , drawPanel);
		frame.getContentPane().add(BorderLayout.EAST , labelButton);
		frame.getContentPane().add(BorderLayout.WEST , label);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	class LabelListener implements ActionListener { // implement eventlisteners in one single class
		public void actionPerformed(ActionEvent event){
			label.setText("ouch"); // inner class labellistener know about label variable

		}
	}
	class ColorListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			frame.repaint();
		}
	}

}

class MyDrawPanel extends JPanel{ // mydrawpanel is the subclass of jpanel class from java.awt.graphics module
	public void paintComponent(Graphics g){ // g it take a new plane to draw
		int red = (int) (Math.random()*255);
		int blue = (int) (Math.random()*255);
		int green = (int) (Math.random()*255);
		Color mycolor = new Color(red,green,blue);
		g.setColor(mycolor);
		g.fillOval(70,70,100,100);
		
	}
}