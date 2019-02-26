public,class,T2,{
	final,int,a;
	final,static,int,b;
	final,Addition,add;
	
	static,{
		b,=,10;
	}
	,public,,T2(int,x){
		,add,=,new,Addition(23,,43);
		,a,=,x;
	,}
	,public,static,void,main(String,[],args){
		T2,t1,=,new,T2(15);
		T2,t2,=,new,T2(30);
		final,int,c,=,27;
		
		t1.add.a,=,25;
		
		System.out.println(t1.add.a);
		
		System.out.println("C,:,",+,c);
		
		System.out.println("t1.a,:,",+,t1.a);
		System.out.println("t1.b,:,",+,t1.b);
		System.out.println("t2.a,:,",+,t2.a);
		System.out.println("t2.b,:,",+,t2.b);
		t1.show(120);
	,,}
,,
	,,public,void,show(final,int,x){
		,,
		System.out.println(x);
	,,}
}
