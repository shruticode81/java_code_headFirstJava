//assigment for comparator

import java.util.*;
public class SortMountains{
	LinkedList<Mountain> mtn = new LinkedList<Mountain>();
	class NameCompare implements Comparator<Mountain>{
		public int compare(Mountain one,Mountain two){
			one.name.compareTo(two.name);
		}
	}
	class HeightCompare implements Comparator<Mountain>{
		public int compare(Mountain one, Mountain two){
			one.height.compareTo(two.height);
		}
	}
	public static void main(String[] args){
		new SortMountains().go();
	}
	public void go(){
		mtn.add(new Mountain("longs",14225));
		mtn.add(new Mountain("elbert",14433));
		mtn.add(new Mountain("maroon",14256));
		mtn.add(new Mountain("castle",14265));
		System.out.println("as entered:\n"+mtn);
		NameCompare nc = new NameCompare();
		Collections.sort(mtn,nc);
		System.out.println("by name:\n",mtn);
		HeightCompare hc = new HeightCompare();
		Collections.sort(mtn,hc);
		System.out.println("by height:\n",mtn);
	}

}

class Mountain{
	String name;
	int height;
	Mountain(String n,int h){
		name = n;
		height = h;
	}
	public String toString(){
		return name+" "+height;
	}
	
}











































































