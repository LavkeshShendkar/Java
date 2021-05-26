import java.util.Scanner;

public class Q11Stat {
	
	public static void main(String[] args)
	{
		int pen=10;
		int pencil=5;
		int bottle=30;
		int colorbox=50;
		int notebook=20;
		int price=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("1:Pen 2:Pencil 3:Bottle 4:ColorBox 5:Notebook");
		System.out.println("Please Enter the choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter Quantity");
			int q1=sc.nextInt();
			price=pen*q1;
			break;
		case 2:
			int q2=sc.nextInt();
			price=pencil*q2;
			break;
		case 3:
			int q3=sc.nextInt();
			price=bottle*q3;
			break;
		case 4:
			int q4=sc.nextInt();
			price=colorbox*q4;
			break;
		case 5:
			int q5=sc.nextInt();
			price=notebook*q5;
			break;
			
			default:
			System.out.println("Enter Correct Input");
		}
		System.out.println("Total price="+price);
	}

}
