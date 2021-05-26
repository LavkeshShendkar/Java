import java.util.Scanner;

public class Q9Arr {

	public static void main(String[] args) {
		 
		int[] arr=new int[6];
		Scanner sc=new Scanner(System.in);
		int i,j,temp=0,temp1=0,sum=0;
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(i=0;i<=5;i++)
		{
			sum +=arr[i];
		}
		
		System.out.println("Sum of Array is"+sum);
		int Average=sum/arr.length;
		System.out.println("Average of Elements of Array is"+Average);
		
		for( i=0;i<=5;i++)
		{
			for(j=i+1;j<=5;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					System.out.println(arr[i]);
					System.out.println(arr[j]);
				}
			}
		}
		System.out.println("Maximum Element Of Array is"+arr[arr.length-1]);
		
		for(i=0;i<=5;i++)
		{
			for (j=i+1;j<=5;j++)
			{
				if(arr[i]<arr[j])
				{
					temp1=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Minimum Element of Array is"+arr[5]);
		
	sc.close();
		

	}

}
