// code to saving and restoring the gamecharacter using serizable interface

import java.io.*;

public class GameSaverTest{
		public static void main(String[] args){
			GameCharacter one = new GameCharacter(50,"elf",new String[] {"bow","sword","dust"});
			GameCharacter two = new GameCharacter(200,"troll",new String[] {"bare hands","big ax"});
			GameCharacter three = new GameCharacter(120,"Magician",new String[] {"spells","invisibility"});

			//code that changes the state value of character objects created

			//now we will save the object into a file
			try{
				//FileOutputStream fs = new FileOutputStream("Game.ser");
				ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.txt"));
				os.writeObject(one); //writing the obj into the file
				os.writeObject(two);
				os.writeObject(three);
				os.close(); 
			} catch(IOException ex){
				ex.printStackTrace();	
			}
			
			one = null;
			two = null;  // making the object null so it can't accessed by the heap and print the current value
			three = null;

			try{
				ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.txt"));
				GameCharacter onerestore = (GameCharacter) is.readObject(); // object is read in the
			        GameCharacter tworestore = (GameCharacter) is.readObject(); //same order it is wrote in the file
 				GameCharacter threerestore = (GameCharacter) is.readObject();
				System.out.println("one's type:" + onerestore.getType());
				System.out.println("two's type:" + tworestore.getType());
				System.out.println("three's type:" + threerestore.getType());		
	
				
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
}

class GameCharacter implements Serializable{   //object of this type of class can be serializable and the subclass of gamecharacter can also be saved
	int power;
	String type;
	String[] weapons;
	public GameCharacter(int p,String t, String[] w){  //make the constructor method
		power = p;
		type = t;
		weapons = w;
	}
	public int getPower(){
		return power;
	}
	public String getType(){
		return type;
	}
	public String getWeapons(){
		String weaponList = "";
		for(int i=0;i<weapons.length;i++){
			weaponList+=weapons[i]+" ";
		}
		return weaponList;
	}
}
