import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class reverse {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.out.println("Enter The string ending with ,");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String s = br.readLine();
char[] ch = s.toCharArray();
int i=0;
int j = ch.length-1;
while(i<j){
	char temp = ch[i];
	ch[i]=ch[j];
	ch[j] = temp;
	i++;
	j--;
	
}
for(int k =0; k <ch.length;k++){
System.out.println(ch[k]);}
	}

}
