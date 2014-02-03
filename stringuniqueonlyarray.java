import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class stringuniqueonlyarray {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.out.println("Enter String");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String s = br.readLine();
char[] ar = s.toCharArray();
for(int i =0; i<s.length();i++)
{
	for(int j =i+1;j<s.length();j++)
	{
		if(ar[i]==ar[j])
		{
			System.out.println("match found at "+i+" and "+j);
		}
	}
	}
	}

}
