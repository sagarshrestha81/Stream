
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
	public static void main(String [] args)  {
		try {
	Employee emp=new Employee("Ram","Manager",4567.54);
	System.out.println(emp);
	FileOutputStream fos= new FileOutputStream("C:\\Users\\User\\Desktop\\Employee.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(emp);
	oos.close();
		}catch (Exception e) {
			System.out.println(e);
	
	
		}
	}

}
