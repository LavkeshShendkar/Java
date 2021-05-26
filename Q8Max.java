import java.util.Collections;

public class Q8Max {

	public static void main(String[] args) {
		
		int[] arr=new int[] {10,40,80,50,30,5,70};
		int i,j,temp,f=0;
		
		for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
					
					
				}
			}
			
		}
		
		
		System.out.println("Maximum Element of Array is"+arr[arr.length-1]);
		}
	}


