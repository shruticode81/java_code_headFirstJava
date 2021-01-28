// using polymorphic argument in case of arraylist
//in case of arraylist ,, complier checks the type of arraylist at first and check if it's safe or not

import java.util.*;

public class TestArrayList{
	public static void main(String[] args){
		new TestArrayList().go();
	}
	public void go(){
		ArrayList<Animal> animals = new ArrayList<Animal>();
			animals.add(new Dog());
			animals.add(new Cat());
			animals.add(new Dog());

			takeAnimals(animals);
	} 
	public void takeAnimals(ArrayList<Animal> animals){
		for(Animal a : animals){
			a.eat();
		}
	}
}

class Animal{
	void eat(){
		System.out.println("animals eating");
	}
}