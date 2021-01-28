class Temp{
	private static int x=10;
	private static int y=10;

	private Temp(){
		this(5); //this() method invokes the current class constructor
	}
	private Temp(int x){
		this(x,y);
	}
	private Temp(int x,int y){
		System.out.println(x*y);
	}
	public final static void main(String args[]){
		Temp t = new Temp(); 
	}

}