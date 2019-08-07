import java.io.Serializable;
public class Employee implements Serializable{
	String name,post;
	double salary;
	public Employee(String name, String post,double salary) {
		this.name=name;
		this.post=post;
		this.salary=salary;
	}
	public String toString() {
		return "Name: "+name+ "\n"+"Post: "+post+"\n"+"Salary: "+salary;
	}

}
