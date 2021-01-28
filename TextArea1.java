//JTextArea example

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextArea1 implements ActionListener{
	JTextArea text;
	public static void main(String[] args){
		TextArea1 gui = new TextArea1();
		gui.go();
	}
	public void go(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("click me");
		button.addActionListener(this);
		text = new JTextArea(10,20); //making a textarea of 10 lines rows and 20 cols
		text.setLineWrap(true); //it to control overflow 

		JScrollPane scroller = new JScrollPane(text); //making a scroll frame and put te textarea inside it
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		panel.add(scroller);
		frame.getContentPane().add(BorderLayout.CENTER,panel);
		frame.getContentPane().add(BorderLayout.SOUTH,button);

		frame.setSize(350,350);
		frame.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ev){
		text.append("button clicked \n"); //\n to insert a new line so the word goes to new line everytime a button is clicked.
	}
}