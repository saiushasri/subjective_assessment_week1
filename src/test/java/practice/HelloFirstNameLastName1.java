package practice;

import java.util.Scanner;

public class HelloFirstNameLastName1 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name : ");
		String firstName=sc.nextLine();
		System.out.println("Enter last name : ");
		String lastName=sc.nextLine();
		System.out.println("Hello "+firstName+" "+lastName);

	}

}
