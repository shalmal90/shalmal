import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;


public class anagramsort {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.out.println("Enter 1st string");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String s = br.readLine();
System.out.println("Enter 2nd string");
//BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
String t = br.readLine();
anagram(s,t);

	}

	private static void anagram(String s, String t) {
		// TODO Auto-generated method stub
		char ch []= s.toCharArray();
		char ch1 []= t.toCharArray();
		int h=  0;
		if(ch.length == ch1.length){
			System.out.println("Length is same");
		Arrays.sort(ch);
		Arrays.sort(ch1);
for(int j=0;j<ch.length;j++)
{
	System.out.println("1st" +ch[j]);
	
	}
for(int k=0;k<ch1.length;k++)
{
	System.out.println(ch1[k]);
	
	}
		for(int i=0; i<ch.length;i++)
		{
			if (ch[i] == ch1[i]){
				h++;
			} 
			else
			{
				h--;
			}
			
		}
		if(h==ch.length && h==ch1.length){
			System.out.println("Strings are anagram");
		}
		else{
			System.out.println("Strings are not not anagram");
		}}
		
		else
		{
		//sort(s);
		System.out.println("String1 " +s+ "String2 " +t+ "Are not anagrams");
		}
	}


}
