//writing a chaT CLIENT version1 where the client send the msg to the server and server get msg but it donot send it to other client connected

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import javax.swing.*;

public class SimpleChatClientA{
	JTextField outgoing;
	PrintWriter writer;
	Socket sock;
	public void go(){
		JFrame frame = new JFrame("Simple Chat Client");
		JPanel mainPanel = new JPanel();
		outgoing = new JTextField(20);
		JButton sendButton =new JButton("send");
		sendButton.addActionListener(new SendButtonListener());
		mainPanel.add(outgoing);
		mainPanel.add(sendButton);
		frame.getContentPane().add(BorderLayout.CENTER,mainPanel);
		setUpNetworking();
		frame.setSize(400,500);
		frame.setVisible(true);

	}//close go

	private void setUpNetworking(){
		try{
			sock = new Socket("127.0.0.1",5000);
			writer = new PrintWriter(sock.getOutputStream()); // chain the low level output stream from the socket to the printwriter
			System.out.println("networking established");
			
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}
	public class SendButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent ev){
			try{
				writer.println(outgoing.getText()); // when the send button is cllicked server recice a text msg by doing writing
				writer.flush();
			}catch(Exception ex){
				ex.printStackTrace();
			}
			outgoing.setText("");
			outgoing.requestFocus();
		}
		
	}// close of button inner class
	public static void main(String[] args){
		SimpleChatClientA gui = new SimpleChatClientA();
		gui.go();
	}

}