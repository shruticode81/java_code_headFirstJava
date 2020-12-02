//implementing simpledotcom game
import java.util.*;
public class SimpleDotComTest{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int numofguess=0;
		SimpleDotCom dot = new SimpleDotCom();
		int randomnum = (int) (Math.random()*5);  //get a random number btw 0 to 4
		int location[] = {randomnum , randomnum+1 , randomnum+2};
		dot.setlocationcell(location);
		boolean isalive = true;
		while(isalive){
			System.out.println("enter ur guess");
			String userguess = s.next(); //u can directly take s.nextInt() 
			String result = dot.checkyourself(userguess);
			numofguess+=1;
			if(result.equals("kill")){
				isalive = false;
				System.out.println("no. of guess "+numofguess);
			}	
		}
	}
}

class SimpleDotCom{
	int locationcells[];
	int numofhit=0;
	public void setlocationcell(int loc[]){
		locationcells=loc;
	}
	public String checkyourself(String strguess){
		int guess = Integer.parseInt(strguess);
		String result = "miss";
		for(int cell : locationcells){
			if(cell == guess){
				result = "hit";
				numofhit++;
				break;
			}

		}
		if(numofhit == locationcells.length){
			result = "kill";
		}
		System.out.println(result);
		return result;
	}
}