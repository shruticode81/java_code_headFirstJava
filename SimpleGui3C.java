// Java code to make CIRCLE CHANGES COLOR EVERYTIME U CLICK ON IT.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; //eventlistener

public class SimpleGui3C implements ActionListener{
	JFrame frame;
	public static void main(String[] args){
		SimpleGui3C gui = new SimpleGui3C();
		gui.go(); 
	}
	public void go(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button = new JButton("change color");
		button.addActionListener(this);
		MyDrawPanel drawPanel = new MyDrawPanel();

		frame.getContentPane().add(BorderLayout.SOUTH,button);
		frame.getContentPane().add(BorderLayout.CENTER,drawPanel);
		frame. setSize (300,300) ; 
		frame. setVisible (true) ;

	}
	public void actionPerformed(ActionEvent event){
		frame.repaint(); // everytime user click the button paintcomponent method is called 

	} 

}

class MyDrawPanel extends JPanel{
	public void paintComponent(Graphics g){
		int red = (int) (Math.random()*255);
		int green = (int) (Math.random()*255);
		int blue = (int) (Math.random()*255);
		Color randColor = new Color(red,green,blue);
		g.setColor(randColor);
		g.fillOval(70,70,100,100);
	}
}