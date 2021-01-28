//Simple animation of moving the ball from top left corner to bottom right corner using inner class
//in this code we haven't erased the previous writen code 
import javax.swing.*;
import java.awt.*;
public class SimpleAnimation{
	int x=70;
        int y=70;
	public static void main(String[] args){
		SimpleAnimation gui = new SimpleAnimation();
		gui.go();
	}
	public void go(){
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyDrawPanel drawPanel = new MyDrawPanel();
		frame.getContentPane().add(drawPanel);
		frame.setSize(300,300);
		frame.setVisible(true);

		//main line of code to change the location of ball byy increamenting x,y
		for(int i=0;i<130;i++){
			x++;
			y++;
			drawPanel.repaint(); // tell the plane to repaint itselfs
			try{
				Thread.sleep(50);
			}
				catch(Exception ex){}
			
		} //closing of for loop
	}//close go method
		class MyDrawPanel extends JPanel{
			public void paintComponent(Graphics g){
				g.setColor(Color.white);
				g.fillRect(0,0,this.getWidth(),this.getHeight()); //getWeight() method get inherit from JPanel.
				g.setColor(Color.green);
				g.fillOval(x,y,40,40);
			}
		}//close of inner class
	
}