//ducking concept when you don't want to handle the exception thrown by a method so the exception is thrown back at the caller method and that method too throw the exception
public class Washer{
	Laundry laundry = new Laundry();
	public void foo() throws ClothingException{
		laundry.doLaundry();
	}
	public static void main(String[] args) throws ClothingException{
		Washer a = new Washer();
		a.foo();
	}
}