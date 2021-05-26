import java.util.Scanner;

public class Q10Sal {

	public static void main(String[] args) {
		int Salary;
		int value=0;
		int HRA,DA;
		int Final;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Salary");
		Salary=sc.nextInt();
		if(Salary<10000)
			value=1;
		if(Salary<20000 && Salary>10000)
			value=2;
		if(Salary>20000)
		value=3;
		
		switch (value)
		{
		case 1:
			System.out.println("Basic Salary="+Salary);
			System.out.println("HRA="+((Salary*20)/100));
			System.out.println("DA="+((Salary*80)/100));
			break;
		case 2:
			System.out.println("Basic Salary="+Salary);
			System.out.println("HRA="+((Salary*25)/100));
			System.out.println("DA="+((Salary*90)/100));
			break;
		case 3:
			System.out.println("Basic Salary="+Salary);
			System.out.println("HRA="+((Salary*30)/100));
			System.out.println("DA="+((Salary*95)/100));
			break;
			default :
				System.out.println("Please Enter the Correct Amount");
				break;
		}
		
		

	}

}
