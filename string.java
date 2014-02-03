import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class string {

	/**
	 * @param args
	 * @throws IOException 
	 */
	@SuppressWarnings("null")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
char[] s1 = s.toCharArray();
int i,j;
char[] s2 = new char[s.length()];
int r = s.length();
for(int u =0; !(s1.equals('/')) ;u++)
{
	int length = u;
	System.out.println("length is" +length);
	}
//System.out.println("length is \t" +s1.length);
for( i = s.length()-1,j=0;i>=0;i=i-1,j++){
//System.out.print(s1[i]);
{
s2[j]=s1[i];

	}
}
System.out.println();

//System.out.println(s.length());
for(int h = 0;h<s.length();h++){
	System.out.print(s2[h]);
}
}
	
	
}
