class ConChain {
	String fname, lname;
	
	ConChain() {
		this("");//This statement must be the first line in constructor
		System.out.println("Con1");
	}
	
	ConChain(String fname) {
		this(fname, "");
		System.out.println("Con2");
		
	}
	
	ConChain(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
		System.out.println("Con3");
	}
	
	void output() {
		System.out.println("First name : "+fname);
		System.out.println("Last name : "+lname);
	}
	public static void main(String[] args) {
		ConChain c = new ConChain();
		c.output();
	}
}