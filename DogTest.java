//method uses instance variable by the size affects the bark

class Dogs{
	int size;
	String name;
	void bark(){
		if(size>60){
			System.out.println("WOOFF");
		}
		else if(size>14){
			System.out.println("rufff");

		}
		else{
			System.out.println("YIPP");
		}
	}
}

class DogTest{
	public static void main(String[] args){
		Dogs d1 = new Dogs();
		d1.size=70;
		//d1.bark();
		Dogs d2 = new Dogs();
		d2.size=30;
		Dogs d3 = new Dogs();
		d3.size = 10;
		
		d1.bark();
		d2.bark();
		d3.bark();
		
	}

}