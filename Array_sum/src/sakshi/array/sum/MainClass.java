package sakshi.array.sum;
import java.util.*;

public class MainClass {
	
	public static void main(String args[]){
		
		int a[] = new int[5];
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the array element :");
		for(int i=0; i<5; i++)
		{
			a[i] = sc.nextInt();		
		}
		
		System.out.println("Array elements :");
		for(int i=0; i<5; i++)
		{
			System.out.println(a[i]+"");
			sum= a[i]+sum;
		}
		
		System.out.println("Addition of an array ele :" +sum);
	}
}
