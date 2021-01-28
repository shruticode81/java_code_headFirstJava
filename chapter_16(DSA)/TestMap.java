//HashMap implementation in an example

import java.util.*;

public class TestMap{
	public static void main(String[] args){
		HashMap<String,Integer> scores = new HashMap<String,Integer>(); //hashmap used
		scores.put("shruti",100);
		scores.put("neha",40);
		scores.put("pallavi",10);
		scores.put("ankita",30);
		System.out.println(scores);
		System.out.println(scores.get("shruti")); // get() method gets in key and returns value 
	}


}