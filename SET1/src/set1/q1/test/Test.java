package set1.q1.test;

import java.util.Scanner;

import set1.q1.Beans.Emp;
import set1.q1.Beans.EmpLL;

public class Test {

	public static void main(String[] args) {
		EmpLL l1 = new EmpLL();
		Emp ob1 = new Emp(1,"Shantanu","M");
		l1.Insert(ob1);
		Emp ob2 = new Emp(2,"Ashwini","F");
		l1.Insert(ob2);
		Emp ob3 = new Emp(3,"Rajshree","F");
		l1.Insert(ob3);
		Emp ob4 = new Emp(4,"Manisha","F");
		l1.Insert(ob4);
		Emp ob5 = new Emp(5,"Suhas","M");
		l1.Insert(ob5);
		
		Scanner sc = new Scanner(System.in);
		
		int ch=0;
		do {
			System.out.println("1. Insert Emp \n 2.Remove Emp \n 3. Display All \n 4.Display F \n 5.Display M \n 6.Empty Queue \n 7.Display Rev \n 8.Exit ");
			System.out.println("Enter Choice");
			ch = sc.nextInt();
			switch(ch) {
			case 1 : System.out.println("Enter Emp id");
			 		 int id = sc.nextInt();
			 		 System.out.println("Enter Name");
			 		 String name = sc.next();
			 		 System.out.println("Enter Gen");
			 		 String gen = sc.next();
			 		 Emp ob = new Emp(id,name,gen);
			 		 l1.Insert(ob);
			 		 break;
			case 2 : l1.remove();
					 break;
			case 3 : l1.displayFemale();
					 break;
			case 4 : l1.displayMale();
					 break;
			case 5 : l1.displayRev();
				   	 break;
			case 6 : l1.removeAll();
					 break;
			case 7 : sc.close();
					 System.out.println("thanks");
					 System.exit(0);
					 break;
			default : 
					System.out.println("Invalid choice");
			}
			
		}while(ch!=8);
	}
}
