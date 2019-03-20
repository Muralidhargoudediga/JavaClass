public class Test1 {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.empno = 123;
		e.name = "Venkat";
		System.out.println(e);
		
		Employee e1 = new Employee();
		e1.empno = 1234;
		e1.name = "Venkat";
		
		System.out.println(e.equals(e1));
		
	}

}

class Employee {
	int empno;
	String name;
	
	public String toString() {
		return "Employee[empno="+empno+", name="+name+"]";
	}
	
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj instanceof Employee) {
			Employee e = (Employee) obj;
			if(this.empno == e.empno && this.name == e.name) {
				return true;
			}
		}
		
		return false;
	}
}
