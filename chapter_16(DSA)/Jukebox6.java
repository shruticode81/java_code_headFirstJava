//whiling printing the song title from the page ,, page can contain duplicate songs so we have to remove the duplpicate 
//using hashset<> collection version 

import java.io.*;
import java.util.*;
public class Jukebox6{
	ArrayList<Song> songList = new ArrayList<Song>();
	public static void main(String[] args){
		new Jukebox6().go();
	}	
	public void go(){
		getSongs(); // get the songs attrbutes from the list and store it i arraylist
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);
		//making hashset and pass the collection arraylist into it and it will remove the duplicates by calling hashcode() and equal() methods
		//when arraylist is passed inside the hashset the hashset will call hashcode() method if two obect have same hashcode then equal method is called to check if the content is same 
		//for two object if yes remove one of the object.
		HashSet<Song> songSet = new HashSet<Song>();
		songSet.addAll(songList);
		System.out.println(songSet);
	}

	void getSongs(){
	//IO code get the song from a file 
	try{
		File file = new File("SongList.txt");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = null;
		while((line=reader.readLine())!=null){
			addSong(line);
		}
	}catch(Exception ex){
		ex.printStackTrace();
	}
	
}
	void addSong(String lineToParse){
	String[] tokens = lineToParse.split("/");
	Song nextSong = new Song(token[0],token[1],token[2],token[3]);
	songList.add(nextSong);
	}

}





























































