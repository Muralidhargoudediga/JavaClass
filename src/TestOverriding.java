class Cat {
	void sound(){
		System.out.println("MEOW");
	}
}

class Tiger extends Cat {
	void sound(){
		System.out.println("Roar");
	}
}

class TestOverrinding {
	public static void main(String[] args){
		Cat c = new Cat();
		printSound(c);
		c = new Tiger();
		printSound(c);
	}
	
	static void printSound(Cat c){
		c.sound();
	}
}
