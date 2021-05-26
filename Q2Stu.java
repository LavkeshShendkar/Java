import java.util.Scanner;

public class Q2Stu {

	public static void main(String[] args) {
	int roll,total,hindi,marathi,english,maths,science;
	double percentage;
	String name;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Name");
	name=sc.next();
	System.out.println("Enter Roll no");
	roll=sc.nextInt();
	System.out.println("Enter hindi marks");
	hindi=sc.nextInt();
	System.out.println("Enter Marathi marks");
	marathi=sc.nextInt();
	System.out.println("Enter English marks");
	english=sc.nextInt();
	System.out.println("Enter Maths marks");
	maths=sc.nextInt();
	System.out.println("Enter Science marks");
	science=sc.nextInt();
	total=hindi+marathi+english+maths+science;
	percentage=((total*100)/500);
	System.out.println("Total:"+total);
	System.out.println("Percentage:"+percentage);
	
	if(percentage>=75)
	{
		System.out.println("Grade:A");
	}
	else if(percentage<75&&percentage>60)
	{
		System.out.println("Grade:B");
	}
	if(percentage<59)
	{
		System.out.println("Grade:C");
	}
	
	}

}
