//your first gui code

import javax.swing.*;
public class SimpleGui1{
	public static void main(String[] args){
		JFrame frame = new JFrame();
		JButton button = new JButton("click me");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(button); //add button to the frame's content pane
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}