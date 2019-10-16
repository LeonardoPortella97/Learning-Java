package DesignPatterns;

public class Singleton {
	
	private static final Singleton INSTANCE = new Singleton();
	
	private Singleton ( ) {}

	public static Singleton getInstance () {
		return INSTANCE;
	}
}

class NonSingleton {
	
}

class Test {
	public static void main(String[] args) {
		NonSingleton obj1 = new NonSingleton();
		NonSingleton obj2 = new NonSingleton();
		
		System.out.println(obj1==obj2);
		
		
		Singleton single1 = Singleton.getInstance();
		Singleton single2 = Singleton.getInstance();
		
		System.out.println(single1==single2);
	}
}
