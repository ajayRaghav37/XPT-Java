import java.util.*;
public class Fucking_Prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nigga enter a number");
		Scanner sc=new Scanner(System.in);
		int testNum,nigga;
		boolean isPrime=true;
		testNum=sc.nextInt();
		for(nigga=2;nigga<=testNum/2;nigga++)
			if(testNum%nigga==0)
			{
				isPrime=false;
				break;
			}
		if (isPrime)
			System.out.println("Nigga yo prime number");
		else
			System.out.println("Nigga yo no prime");
	}

}
