import java.util.Scanner;

public class Q7find {

	public static void main(String[] args) {
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Elements of array");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		int[] arr=new int[5];
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		arr[3]=d;
		arr[4]=e;
		boolean flag=false;
		System.out.println("Please Enter the number to check");
		int f=sc.nextInt();
		for( i = 0;i<arr.length;i++)
		{
			if(arr[i]==f)
			{
				flag=true;
				break;
			}
			
		}
		
		if(flag==true)
		{
			System.out.println("The number is Present at "+i+" index");
		}
		else
			System.out.println("This number is not Present");

	}

}
