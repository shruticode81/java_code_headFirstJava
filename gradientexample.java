// drawing circle with gradient 
public void paintComponent(Graphics g){
	Graphics2D g2d = (Graphics2D) g; //casting the parameter g of reference type graphic to graphics2d 
	GradientPaint gradient = new GradientPaint(70,70,Color.blue,150,150,Color.orange); //1st two args is the starting point and follows with startig color and endpoint cordinate and end color.
	g2d.setPaint(gradient); //this sets the virtual paint brush to a gradient instead of solid color.
	g2d.fillOval(70,70,100,100); //(70,70) is the starting coordinate and 100 100 is the width and height.
 

}

// adding random start and end color
public void paintComponent(Graphics g){
	Graphics2D g2d = (Graphics2D) g;

	int red = (int) (Math.random()*255);
	int green = (int) (Math.random()*255);
	int blue = (int) (Math.random()*255);
	Color startColor = new Color(red,green,blue);

	red = (int) (Math.random()*255);
	green =(int) (Math.random()*255);
	blue = (int) (Math.random()*255);
	Color endColor = new Color(red,green,blue);
	GradientPaint gradient = new GradientPaint(70,70,startColor,150,150,endColor);
	g2d.setPaint(gradient);
	g2d.fillOval(70,70,100,100); 
}