class A extends B {
	int i;
	A(int i) {
		super();
		System.out.println("Sub-class cons");
		this.i = i;
		super.i = 20;
	}
	
	void show() {
		
		System.out.println("Sub class i value:"+this.i);
		super.show();
	}
	
	public static void main(String [] args) {
		A a = new A(10);
		//System.out.println(a.i);
		//System.out.println(a.super.i);
		a.show();
	}
}

class B{
	int i;
	B() {
		System.out.println("Super-class cons");
	}
	
	 void show() {
		System.out.println("Super class i value:"+this.i);
	}
}