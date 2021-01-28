//generic works in array in case of polymorphism 

import java.util.*;

public class TestGenerics1{
	public static void main(String[] args){
		new TestGenerics1().go();
	}

	public void go(){
		Animal[] animals = {new Dog(),new Cat(),new Dog()};
		Dog[] dogs = {new Dog(),new Dog(),new Dog()}; // declare and create dog type array
		takeAnimals(animals);
		takeAnimals(dogs); 
	}
	public void takeAnimals(Animal[] animals) {  //point is takeAnimals can get Animal[] and Dog[] array polymorphism
		for(Animal a: animals){
			a.eat();
		}

	}
}

abstract class Animal{
	void eat(){
		System.out.println("animal eating");
	}
}

class Dog extends Animal{
	void bark(){}
}

class Cat extends Animal{
	void meow(){}
}
















