public,class,Addition,{
	
	Addition(),{
	
	}
	
	Addition(int,a,,int,b){
		.....
		.....
	}
	
	public,static,int,add(float,a,,int,b),{
		return,a+b;
	}
	
	public,int,add(int,a,,int,b){
		return,a+b;
	}
	
	public,static,void,main(String[],args),{
		,Addition,addition,=,new,Addition();
		,Addition,addition2,=,new,Addition(10,,20);
		addition.add(1,,2f);
		
		add(1f,,2);

	}
	
	static,void,show(int,c),{
		System.out.println("Addition,is,:,",+,c);
	}
}
