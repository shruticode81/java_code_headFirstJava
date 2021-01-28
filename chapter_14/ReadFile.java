//code to read from a text file using bufferedreader class

import java.io.*;

public class ReadFile{

	public static void main(String[] args){
		try{
			File myFile = new File("MyText.txt"); // making a file object
			FileReader fileReader = new FileReader(myFile);//filereader is the connection stream to conect to the text file 
			BufferedReader reader = new BufferedReader(fileReader); // buffer is use to store the lines efficient in reading
			String line = null;
			while((line=reader.readLine())!=null){ //read a line of text and assign it to the string variable line.
				System.out.println(line); //print out the line that is just read
			}
			 
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}