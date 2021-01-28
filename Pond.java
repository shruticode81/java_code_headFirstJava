//use of transient variable to skip the instance variable from being serialized

import java.io.*;

public class Pond implements serializable{
	private tranisent Dog mydog = new Dog();
	public static void main(String[] args){
		Pond myPond = new Pond();
		try{
			FileOutputStream fs = new FileOutputStream("pond.ser"); //connection stream
			ObjectOutputStream os = new ObjectOutputStream(fs); // chain stream
			os.writeObject(myPond);
			os.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}

 class Dog{
	//dog code goes here.
}