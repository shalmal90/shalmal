import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class booleanunique {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
System.out.println("Enter String:");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String s = br.readLine();
boolean bs= checkcopy(s);
System.out.println(bs);
	
	}

	private static boolean checkcopy(String s) {
		// TODO Auto-generated method stub
		boolean[] b = new boolean[256];
		for(int i=0;i<s.length();i++)
		{
			int check = s.charAt(i);
	
			if(b[check]){return false;}
			else
		b[check]=true;
		}
return true;
	}

}
