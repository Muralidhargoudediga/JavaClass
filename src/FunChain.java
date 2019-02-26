class FuncChain {
	int x, y;
	
	void output(){
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}
	
	FuncChain input(int x, int y) {
		this.x = x;
		this.y = y;
		return this;
	}
	
	
	public static void main(String[] args) {
		FuncChain f = new FuncChain();
		f.input(10, 20).output();
	}
}

class FuncChain2 {
	
	int x, y;
	void output(){
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}
}