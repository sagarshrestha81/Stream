import java.util.*;
public class UserInputDemo {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	char choice = 0;
	do {
	System.out.println("Enter your name:");
	String name = sc.nextLine();
	try {
	System.out.println("Enter your roll number: ");
	int rollno= sc.nextInt();
	System.out.println("Name is:"+name);
	System.out.println("Roll no. is:"+rollno);
	}
	catch (Exception e){System.out.println("Please input roll number in integer");}
	System.out.println("Do you want to continue \n1)Y for Yes \n2)Any key for NO");
	choice=sc.next().charAt(0);
	
	}while(choice=='Y');
	}}
