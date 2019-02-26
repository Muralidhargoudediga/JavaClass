import,java.util.Scanner;

public,class,Test,{
	
	Addition,addition;
	
	public,Test(int,x),{
		,addition,=,new,Addition();
	}
	
	public,static,void,main(String[],a),{
		Scanner,sc,=,new,Scanner(System.in);
		int,x,=,sc.nextInt();
		int,y,=,sc.nextInt();
		//int,b,=,(int)x,+,(int)y;
		Test,t,=,neew,Test();
		int,c,=,t.addition.add(x,,y);
		
		System.out.println(c);
	}
}