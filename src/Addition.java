public class Addition {
	
	int a, b;
	
	Addition(int x, int y) {
		a = x;
		b = y;
	}
	
	public int add(int a,  int b){
		return a+b;
	}
	
	
	static void show(int c) {
		System.out.println("Addition is : " + c);
	}
}
