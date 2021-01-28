//TRY TO SORT THE SONG OBJECTS INSIDE ARRAYLIST

public class Song{
	String title;
	String artist;
	String rating;
	String bpm;
	
	public boolean equals(Object aSong){
		Song s = (Song) aSong;
		return getTitle().equals(s.getTitle());
	}
	public int hashCode(){
		return title.hashCode();
	}
	Song(String t,String a,String r,String b){//constructing a constructor to create objec to song class
		title = t;
		artist = a;
		rating = r;
		bpm = b;
	}//variables are all set inside the constructor

	public String getTitle(){
		return title;
	}
	public String getArtist(){
		return artist;
	}
	public String getRating(){
		return rating;
	}
	public String getBpm(){
		return bpm;
	}
}