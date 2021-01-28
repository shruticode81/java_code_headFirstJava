// making your own drawing widget
//set the color and draw the shape rectangular 
import java.awt.*;  //contain Graphics class
import javax.swing.*;
class MyDrawPanel extends JPanel{ //subclass of jplane
	public void paintComponent(Graphics g){
		g.setColor(Color.orange);
		g.fillRect(20,50,100,100); //(20,50) is coordiate where it starts and 100 100 is the size of the shape.
	}
}

//FUN THINGS TO DO WITH PAINTCOMPONENT:
//DISPLAY A JPEG

public void paintComponent(Graphics g){ //override the method paintcomponet
	Image image = new ImageIcon("shruti.jpg").getImage();
	g.drawImage(image,3,4,this); //here 3px is from left and 4px from top 
}

//Paint a randomly-colored circle
//on a black background
public void paintComponent(Graphics g){
	g.fillRect(0,0,this.getWidth(),this.getHeight()); //width and height is same as the plane
	int red = (int) (Math.random()*255);
	int green = (int) (Math.random()*255);
	int blue = (int) (Math.random()*255);
	Color randomColor = new Color(red,green,blue); //make color by passing 3 int values
	g.setColor(randomColor);
	g.fillOval(70,70,100,100);
	
}