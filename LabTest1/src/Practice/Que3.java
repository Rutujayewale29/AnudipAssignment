package Practice;

import java.util.Scanner;

public class Que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter Any 3 number");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int sum=n1+n2+n3;
		if(sum==180)
		{
		 System.out.println("Prize 1");	
		}else
		{
			System.out.println("No Prize");
			}
	}

}
