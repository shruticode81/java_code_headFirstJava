//basic borderlayout adding buttons of north,south,east and west

import javax.swing.*;
import java.awt.*;
public class Buttons1{
	public static void main(String[] args){
		Buttons1 button = new Buttons1();
		button.go();
	}
	public void go(){
		JFrame frame = new JFrame();
		JButton west = new JButton("WEST");
		JButton east = new JButton("EAST");
		JButton north = new JButton("NORTH");
		JButton south = new JButton("SOUTH");
		JButton center = new JButton("CENTER");

		frame.getContentPane().add(BorderLayout.EAST,east);
		frame.getContentPane().add(BorderLayout.WEST,west);
		frame.getContentPane().add(BorderLayout.NORTH,north);
		frame.getContentPane().add(BorderLayout.SOUTH,south);
		frame.getContentPane().add(BorderLayout.CENTER,center);
		frame.setSize(300,300);
		frame.setVisible(true);

	}
}
