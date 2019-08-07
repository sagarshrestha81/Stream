import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
	public static void main(String[] args) {
		try {
			Employee emp;
			FileInputStream fis= new FileInputStream("C:\\Users\\User\\Desktop\\Employee.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			emp=(Employee)ois.readObject();
			ois.close();
			System.out.println(emp);
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
