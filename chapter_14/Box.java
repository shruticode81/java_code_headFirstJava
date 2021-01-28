//serializing an object .e savng the object in a file

import java.io.*; // serializable interface exsts inside java.io package

public class Box implements serializable{
	private int width;  //the value of these instance variable can be saved
	private int height;

	public void setWidth(int w){
		width = w;
	}
	public void setHeight(int h){
		height = h;	
	}

	public static void main(String[] args){
		Box mybox = new Box();
		mybox.setWidth(50);
		mybox.setHeight(20);

		try{
			FileOutputStream fs = new FileOutputStream("foo.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(mybox); // copyng the object mybox into  a file and retrive it later.
			os.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	

	} 

	
}