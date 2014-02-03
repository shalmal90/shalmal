import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class stringun {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.out.println("Enter the string:");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String s = br.readLine();

char[] ch = s.toCharArray();
char[]ch1 = s.toCharArray();
for(int i=0;i<s.length();i++)
{
	for(int j = i+1;j<s.length();j++)
	{
		if (ch[i] == ch1[j])
		{
			if(i!=j)
			System.out.println("Match Found: Not a Unique String:- "+i+" and "+j);
		}
	}
	}
	}

}
