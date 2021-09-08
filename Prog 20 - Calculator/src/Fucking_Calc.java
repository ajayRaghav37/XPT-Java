import java.util.Scanner;
public class Fucking_Calc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter a & b");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter operation\n1. Add\n2. Sub\n3. Mul\n4. Div\n5. Mod");
		int oper;
		oper=sc.nextInt();
		switch(oper)
		{
		case 1:
			c=a+b;
			break;
		case 2:
			c=a-b;
			break;
		case 3:
			c=a*b;
			break;
		case 4:
			c=a/b;
			break;
		case 5:
			c=a%b;
			break;
		default:
			c=0;
		}
		System.out.println("Yo nigga is " + c);
	}

}
