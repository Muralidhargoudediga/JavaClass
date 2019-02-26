
//Parent 
class Vehicle {
	Vehicle(int a){
		super();
		System.out.println("Vehicle....");
	}
	public void drive() {
		System.out.println("Driving....");
	}	
}

//Child1
class Car extends Vehicle {
	Car(){
		super(10);
		System.out.println("Car....");
	}
	public void start() {
		System.out.println("start Car....");
	}
}

//Child2
class Innova extends Car {
	Innova(){
		System.out.println("Innova....");
	}
	
	Innova(int a) {
	}
	public void start(){
		System.out.println("Start Bike....");
	}
}

public class TestVehicle {
	public static void main(String[] args) {
		Innova car = new Innova();
	}
}


