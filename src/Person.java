class Person {
	private int age;
	private String name, addr;
	
	public void setAge(int age){
		this.age=age;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setAddr(String addr){
		this.addr=addr;
	}
	
	public String getName(){
		return name;
	}
	
	public String getAddr(){
		return addr;
	}
	
	public int getAge(){
		return age;
	}
}

class Student extends Person {
	private int sno;
	private String course;
	
	public void setSno(int sno){
		this.sno=sno;
	}
	
	public int getSno(){
		return sno;
	}
	
	public void setCourse(String course){
		this.course=course;
	}
	
	public String getCourse(){
		return course;
	}
	
	public void output(){
		System.out.println("Name : "+getName());
		System.out.println("Age : "+getAge());
		System.out.println("Address : "+getAddr());
		System.out.println("Sno : "+getSno());
		System.out.println("Course : "+getCourse());
	}
}

class TestSLInheritence {
	public static void main(String[] args){
		Person student = new Student();
		student.setName("Kanta");
		student.setAge(28);
		student.setAddr("Delhi");
		((Student)student).setSno(1234);
		((Student)student).setCourse("MPC");
		//((Student)student).output();
		
		printDetails(student);
		
		Employee e = new Employee();
		e.setName("Pavan");
		e.setAge(35);
		e.setAddr("Kurnool");
		
		printDetails(e);
	}
	
	public static void printDetails(Person p){
		System.out.println("Name : "+p.getName());
		System.out.println("Age : "+p.getAge());
		System.out.println("Address : "+p.getAddr());
	}
}

class Employee extends Person {
	int empno;
	double salary;
	String role;
}

class BankEmployee extends Employee {
	String bankName;
}

