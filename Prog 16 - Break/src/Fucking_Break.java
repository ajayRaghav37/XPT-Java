import java.util.*;
public class Fucking_Break {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int array[]={5,10,1,50,30,56,80,74,47,4,7};
		int i;
		System.out.println("Enter a nigga to look for");
		int searchFor=sc.nextInt();
		boolean inIt = false;
		for(i=0;i<array.length;i++)
			if (array[i]==searchFor)
			{
				inIt=true;
				break;
			}
		if(inIt)
			System.out.println("Nigga found at " + (i+1) + " position");
		else
			System.out.println("Yo nigga is lost");
	}

}
