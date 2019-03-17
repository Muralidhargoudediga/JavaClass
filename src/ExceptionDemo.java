class ExceptionDemo {
	public static void main(String[] args) {
		String str = null;
		try{
			str.length();
			//System.exit(0);
		} catch(Exception e){
			System.out.println("NPE.."+e);
		}finally {
			System.out.println("finally...");
		}
		//str.length();
		System.out.println("After Exception");
	}
}