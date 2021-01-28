//write a string into a text file

import java.io.*; //we need java.io package for FileWriter .

public class WriteAfile{
	public static void main(String[] args){
		try{
			FileWriter writer = new FileWriter("Foo.txt"); //if foo.txt file doesnot exist then filewriter create it
			writer.write("hello myself shruti!!"); //write() method gets a string
			writer.close();
		}catch(IOException ex){
			ex.printStackTrace();
		}
		 
	}

}