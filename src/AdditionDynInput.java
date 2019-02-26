import java.util.Scanner;

public class AdditionDynInput {
	int a;
	int b;
	
	//Initialization purpose
	public AdditionDynInput(int x, int y){ //Constructor
		a = x;
		b = y;
	}
	
	public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Please enter a value : ");
		 int x = sc.nextInt();
		 System.out.println("Please enter b value : ");
		 int y = sc.nextInt();
		 
		 AdditionDynInput addition = new AdditionDynInput(x, y);
		 int c = addition.add();
		 
		 show(c);
		 
		 sc.close();
	}
	
	static void show(int c) {
		System.out.println("Addition is : " + c);
	}
	
	public int add() {
		return this.a+this.b;
	}
} 