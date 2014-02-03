import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class removeduplicate {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.out.println("Enter String");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String s = br.readLine();
char[] ch = s.toCharArray();
for(int i = 0;i<s.length();i++){
	for(int j = i+1;j<s.length();j++){
		if (ch[i]== ch[j]){
			ch[j] = 0;			
		}
	}
}
for(int k =0;k<ch.length;k++) {
	if(ch[k]!=0){
	System.out.println(ch[k]);}
}
	}

}
