public class T2 {
	final int a;
	final static int b;
	final Addition add;
	
	static {
		System.out.println("static block");
		b = 10;
	}
	
	
	 public  T2(int x){
		 System.out.println("Constructor");
		 add = new Addition(23,  43);
		 a = x;
	 }
	 //Instance block
	 {
		 //a = 20;
		System.out.println("instance block");
	}
	 public static void main(String [] args){
		final T2 t1 = new T2(15);
		T2 t2 = new T2(30);
		final int c = 27;
		
		
		
		t1.add.a = 25;
		
		System.out.println(t1.add.a);
		
		System.out.println("C : " + c);
		
		System.out.println("t1.a : " + t1.a);
		System.out.println("t1.b : " + t1.b);
		System.out.println("t2.a : " + t2.a);
		System.out.println("t2.b : " + t2.b);
		t1.show(120);
	  }
  
	  public final void show(final int x){
		  
		System.out.println(x);
	  }
}

class T3 extends T2 {
	T3(){
		super(10);
	}
	public void show(int a){
		System.out.println(a);
	}
}
