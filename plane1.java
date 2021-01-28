//adding a plane and a button inside the plane , the plane layout manager is flowlayout and the frame is the border
//let's add the button to the plane
import javax.swing.*;
import java.awt.*;
public class Plane1{
	public static void main(String[] args){
		Plane1 gui = new Plane1();
		gui.go();
	}
	public void go(){
		JFrame frame = new JFrame();
		JPanel plane = new JPanel();
		plane.setBackground(Color.darkGray);
		JButton button = new JButton("click me");
		JButton button1 = new JButton("bliss me");
		plane.add(button);
		plane.add(button1);
		frame.getContentPane().add(BorderLayout.EAST,plane);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}