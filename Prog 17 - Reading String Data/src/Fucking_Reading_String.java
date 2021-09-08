import java.io.DataInputStream;

public class Fucking_Reading_String {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sname;
		try
		{
			DataInputStream input;
			input=new DataInputStream(System.in);
			System.out.println("Enter your name");
			sname=input.readLine();
			System.out.println("Yo " + sname);
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}

}
