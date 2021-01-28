//code for implemenation of song type and sort by using comparator 

import java.io;
import java.util.*;// consist of collections class

public class Jukebox5{
	ArrayList<Song> songList = new ArrayList<Song>();
	public static void main(String[] args){
		new Jukebox5().go();

	}

class ArtistCompare implements Comparator<Song>{
	public int compare(Song one, Song two){
		one.getArtist().compareTo(two.getArtist());
	}

}

public void go(){
	getSongs();
	System.out.println(songList);
	Collections.sort(songList);
	System.out.println(songList);

	ArtistCompare artistCompare = new ArtistCompare();//make an instance of the comparator inner class
	Collections.sort(songList,artistCompare); //invoke a sort() passing it the list and the reference to new cdustom comparator
	System.out.println(songList);
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


















































