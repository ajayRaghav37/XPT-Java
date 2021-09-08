
public class Fucking_Continue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String search="Yo Nigga";
		int i,nump=0;
		int max=search.length();
		for(i=0;i<max;i++)
		{
			if(search.charAt(i)!='N')
				continue;
			nump++;
		}
		System.out.println("Found " + nump + " niggas in yo big nigga");
	}

}
