import java.util.*;
public class Fucking_Quad {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,D;
		double x1,x2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Yo nigga gimme three numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		D=(b*b)-(4*a*c);
		if (D>0)
		{
			x1=(-b+Math.sqrt(D))/(2*a);
			x2=(-b-Math.sqrt(D))/(2*a);
			System.out.println("Niggas are " + x1 + " and " + x2);
		}
		else if (D==0)
		{
			System.out.println("Niggas are same that is " + (-b/2*a));
		}
		else
		{
			System.out.println("Niggas don't exist in real world");
		}
	}
}
