//make a socket and makes a bufferedreader and read a single line from the server

import java.net.*; //class xocket is in java.net
import java.io.*;

public class DailyAdviceClient{

	public void go(){
		try{
			Socket s = new Socket("127.0.0.1",4242);
			InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
			BufferedReader reader = new BufferedReader(streamReader);//chain the bufferedreader to inputstreamreader and this to input stream from the socket.
			String advice = reader.readLine();
			System.out.println("today you should :"+advice);

			reader.close();
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}
	public static void main(String[] args){
		DailyAdviceClient client = new DailyAdviceClient();
		client.go();
	}
}