public class GameCharacter implements Serializable{   //object of this type of class can be serializable and the subclass of gamecharacter can also be saved
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