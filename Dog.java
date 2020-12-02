//Using reference variables and implementing a Dog class
public class Dog{
	String name;
	public static void main(String[] args){
		
		//make a Dog object & access it.
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "Bart";
		//making a dog array
		Dog mydogs[] = new Dog[3];
		//and put some dogs in it
		mydogs[0]=new Dog();
		mydogs[1]=new Dog();
		mydogs[2]=dog1;
		//now access the Dogs using the array reference
		mydogs[0].name = "fred";
		mydogs[1].name = "tom";
		System.out.println("last name of dog "+ mydogs[2].name);
		int x=0;
		while(x< mydogs.length){
			mydogs[x].bark();
			x=x+1;
		}
		
		
		

	}
		public void bark(){
			System.out.println(name+" says rufff");
		}
}