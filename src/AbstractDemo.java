abstract class Vehicle {
	abstract void petrolStart();
	abstract void dieselStart();
}

class Bike extends Vehicle {
	void petrolStart() {
		System.out.println("Needs petrol...");
	}
	
	void dieselStart() {
	}
}

interface A {
	void show();
}

interface B {
	void show();
}

class C implements A,B{
	public void show() {
		System.out.println("zsfdfdsfs");
	}
	
	public static void main(String[] a){
		C c = new C();
		c.show();
	}
}