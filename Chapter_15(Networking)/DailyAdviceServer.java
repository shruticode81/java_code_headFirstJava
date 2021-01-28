//DailyAdviceServer code this program make serversocket and wait for client requests.when the client request, the server makes a new socet connection to that clent.

import java.net.*;
import java.io.*;

public class DailyAdviceServer{
	String[] adviceList = {"Take smaller bites","Go for the tight jeans.No they do NOT mae you look fat.","One word:inappropriate","jst for today","you might want to rethink that haircut."};
	public void go(){
		try{
			ServerSocket serverSock = new ServerSocket(4242);//serverSocket makes this server application listen for the client requests on the port 4242 on the machine thsi code is running on
			while(true){ //server goes into a permanent loop,waiting for client requets and servicing their requests
				Socket sock = serverSock.accept(); // accept() method blocks until a request comes in , and then the methods returns the socket for communicating with the client
				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				String advice = getAdvice();
				writer.println(advice);
				writer.close();
				System.out.println(advice);
				
				}
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}//close go
	private String getAdvice(){
		int random = (int) (Math.random()*adviceList.length);
		return adviceList[random];
	}
	public static void main(String[] args){
		DailyAdviceServer server = new DailyAdviceServer();
		server.go();
	}
} 