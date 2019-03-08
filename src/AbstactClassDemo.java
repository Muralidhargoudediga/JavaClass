abstract class Animal {
	abstract void sound();
	
	Animal(){
		System.out.println("Animal cons");
	}
	
}

class Cat extends Animal {
	void sound(){
		System.out.println("MEOW");
	}
}

class Tiger extends Animal {
	void sound(){
		System.out.println("ROAR");
	}
}

class AbstactClassDemo {
	public static void main(String[] ar){
		
		Animal a;
		a = new Cat();
		a.sound();
		a = new Tiger();
		a.sound();
	}
}