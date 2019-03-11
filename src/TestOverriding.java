class Cat {
	static void sound(){
		System.out.println("MEOW");
	}
}

class Tiger extends Cat {
	static void sound(){
		System.out.println("Roar");
	}
	
	void show() {
		System.out.println("test");
	}
}

class TestOverrinding {
	public static void main(String[] args){
		Cat c = new Cat();
		printSound(c);
		c = new Tiger();
		((Tiger)c).show();
		Tiger t = (Tiger)c;
		printSound(c);
	}
	
	static void printSound(Cat c){
		c.sound();
	}
}
