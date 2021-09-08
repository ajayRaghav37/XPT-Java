import java.io.DataInputStream;

public class Fucking_Read_Int {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String snum;
		int num;
		try
		{
			DataInputStream input;
			input=new DataInputStream(System.in);
			System.out.println("Enter a nigga number");
			snum=input.readLine();
			num=Integer.parseInt(snum);
			System.out.println("Nigga entered " + num);
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}
}
