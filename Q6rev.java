
public class Q6rev {

	public static void main(String[] args) {
		int[] arr=new int[5];
		arr[0]=45;
		arr[1]=56;
		arr[2]=67;
		arr[3]=48;
		arr[4]=92;
		System.out.println("Original Array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		
		System.out.println(  "Reversed array Printed");
		
		for(int i=4;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		

	}

}
