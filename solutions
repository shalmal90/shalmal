package cracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class solutions {
	enum colors {R,G,B,Y};
//public static int min = 0 ;
	private static final char SP = 40;
	public solutions() {
		// TODO Auto-generated constructor stub
	}
public static void main(String args[]){
	 qstack();
	//getcolor();
	// getcommstring();
	//maxsubarray();
	//stringreverse();
	//strings();
	/*int arr[] = new int [256];
	String s = "sss";
	for(int i = 0;i<s.length();i++){
		arr[s.charAt(i)]++;
	}
	//arr[s.charAt(i)]++;
	for(int i = 0;i<arr.length;i++){
		System.out.print(arr[i]);
	}*/
//checkunique();	
//cstylestring();
//removeduplicate();
	//anagram();
	//replacespaces();
	//Matrix();
	}


private static void removeduplicate() {
	// TODO Auto-generated method stub
	String s  = "shalmal ";
	boolean[] br = new boolean[256];
	char chr[] = s.toCharArray();
	int  j  = 0;
	int k = 0;
	String a; 
	//boolean flag = false;
	for(int i =0;i< s.length();i++){
		if(!br[s.charAt(i)]){
			//System.out.println("not unique" + s.charAt(i));
			//s.charAt(i)="";
		//chr[s.charAt(i)]=(Character) null;
			chr[j] = s.charAt(i); 
			//break;
			j++;
		}
		else
		{k++;}
		br[s.charAt(i)] = true;
	}
	for(int i =0;i< chr.length-k;i++){
		System.out.println(chr[i]);
	}
	a = new String(chr,0,chr.length-k);
	s = new String(chr,0,chr.length-k);
	//s = chr.toString();
	System.out.println(s);
}
private static void checkunique() {
	// TODO Auto-generated method stub
	boolean[] br = new boolean[256];
	String s = "shalm ";
	boolean flag = false;
	for(int i =0;i< s.length();i++){
		if(br[s.charAt(i)]){
			System.out.println("not unique");
			flag = true;
			break;
		}
		br[s.charAt(i)] = true;
	}
	if (!flag){
		System.out.println("Unique");
	}
	
}
private static void cstylestring() {
	// TODO Auto-generated method stub
	String a = "shalmal ";
	char chr[] = a.toCharArray();
	int start = 0;
	int end = a.length()-2;
	while(start<end){
		
		char temp= chr[start];
		chr[start]=chr[end];
		chr[end]= temp;
		start++;
		end--;
	}
	for(int i =0;i< chr.length;i++){
	System.out.print(chr[i]);
	}
}

public static void anagram(){
	String s = "shalmal";
	String sh = "lmaalsh";
	//System.out.println(sort(s));
	 sh = sort(sh);
	 s = sort(s);
	 if (sh.equals(s)){
		 System.out.println("Anagram");
	 }
	//if( == sort(sh)){
	//	System.out.println("anagram");
//	}
}
public static String sort(String s){
	char arr[] = s.toCharArray();
	Arrays.sort(arr);
	String f = new String(arr,0,arr.length);
	//System.out.println(f);
	return f;
	
}
public static void replacespaces(){
	
	String s = "s h alma l";
ArrayList<Character>arr = new ArrayList<Character>();
char[]ar = new char[20000];
ar =s.toCharArray();
for(int i = 0;i<ar.length;i++){
	char sh = ar[i];
	if((sh == ' ')){
		
		arr.add('%');
		arr.add('2');
		arr.add('0');
		}
	else{	arr.add(sh);}
	
	}
String shj = "";
for (Character sh:arr){
	shj += sh;
}
//char []ar1 = arr.toArray();
System.out.println(arr);
System.out.println(shj);
//arr.add('h');
//char sp = SP;
String shal = "";
Iterator<Character>ir = arr.listIterator();
int cout = 0;
while(ir.hasNext()){
	char ival = ir.next();
	shal += ival;
	//arr.add('a');
	//System.out.println(ival);
	/*if(ival == ' '){
arr.add('a');
//arr.remove(i);
		}
*/}
System.out.println(shal);
}

public static void Matrix(){
	
	int [][] mat = new int[5][5];
	int k =1 ;
	for(int i = 0 ; i<mat.length;i++){
		for(int j = 0;j<mat[i].length;j++){
		
				mat[i][j]= (k);
				k++;
			}
		}
	mat[2][3]  = 0;
	int[] row = new int[mat.length];
	int[] column = new int[mat[0].length];
	
	for(int i = 0 ; i<mat.length;i++){
		for(int j = 0;j<mat[i].length;j++){
		
			if(mat[i][j]== 0){
				//int x = j;
				row[i] = 1;
				column[j] = 1;
			/*	for(int y = 0,z =0;y<mat.length;y++){
					
					//mat[y][j] = 0;
					//if(mat[i][x] == 0)
					//mat[i][x] = 0;
					//mat[x][z] = 0;
				}*/
			/*	for(int z = 0;z<mat[i].length;z++){
					mat[i][z] = 0;
				}*/
				
			}
			}
		}
	for(int i = 0 ; i<mat.length;i++){
		for(int j = 0;j<mat[i].length;j++){
			if(row[i]==1 || column[j] == 1){
				
			}
		}
		}
	
	for(int i = 0 ; i<mat.length;i++){
		System.out.println(" ");
		for(int j = 0;j<mat[i].length;j++){
System.out.print(" "+mat[i][j]);

		}
	}
	//MAtrixrotate(mat);
}
public static void pushpopmin(int input){
	int min = 0;
	
	if(min == 0){
		min  = input;
	}
	  
	else {
		if(input<min){
		 	min = input;
		}
	}
	System.out.println(min);
	
	int[] arr =new int[100];
}

public static void strings(){
	String s = "aabbccdddasbd";
	int arr[] = new int[256];
	//int n = 0;
	for(int i= 0;i<s.length();i++){
		//int n = 0;
			arr[s.charAt(i)]++;	
	}
	
	
	String sh ="";
	for(int i= 0;i<arr.length;i++){
	if(arr[i]>0){
	sh = sh+arr[i] +(char)i+" and "+i+"  ";}
	}
	System.out.println(sh);
	
}
public static void stringreverse(){
	String s = "hello";
	String sh="";
	for(int i=s.length()-1;i>=0;i--){
		
		sh=sh+s.charAt(i);
	}
/*for(int i=s.length()-1;i>=0;i--){
		
		s.charAt(i);
	}*/
	 s = sh;
	System.out.println(s);
}

public static void maxsubarray(){
	int arr[] = {-2,-1,3,4,5,6,7,8};
	int arr1[] = {-2,-1,3,4,-5,6,-3,5};
	int arr2[] = new int[10];
	int max_current = arr1[0];
	int seq = arr[0];
	int max_final = arr1[0];
	//int start = 0;
	//int end = 0;
	
	for(int i = 0;i<arr.length;i++){
		
		if(arr[i]<seq)
		{
			max_current = 0;
		}
		if(max_current+arr1[i] < 0){
			max_current = 0;
		//	start = i;
		//	end = i;
		}
		else{
			max_current = max_current + arr1[i];
			//end = i;
		}
	if(max_current > max_final){
		
		max_final = max_current;
		arr2[i] = max_final;
	}
	seq = arr[i];
	}
	System.out.println(max_final);
	for(int i = 0;i<arr2.length-1;i++){
		System.out.println(arr2[i]);
	}
}
public static void seq(){
	int arr[] ={0,0,1,1,0,1,0,1,0,0,1};
	int len = 0;
	int least_current = arr.length;
	int final_least=  arr.length;
	for(int i=0;i<arr.length;i++){
		least_current++;
		if(arr[i] == 0){
			len++;
			
		}
		if(len == 3){
			if(least_current<final_least){
				final_least = least_current;
			}
		}
	}
	
}
public static String getcommstring()
{
    String s = "";
    String s1 = "hello";
    String s2 = "helloy";
    int size1 = s1.length() ;
    int size2 = s2.length() ;
    int hash[]= new int[30] ;
    for (int i = 0 ; i < 30 ; i++)
    {
        hash[i] = 0 ;
    }
    for ( int i = 0 ; i < size1 ; i++ )
    {
        hash[s1.charAt(i) - 'a'] = 1 ;
    }

    for (int i = 0 ; i < size2 ; i++)
    {
        if ( hash[s2.charAt(i) - 'a'] == 1 )
        {
            s= s + (s2.charAt(i)) ;
            hash[s2.charAt(i)-'a']= 0 ;
        }
    }

    System.out.println(s);
    return s ;
}

 static colors getcolor(){
	
	 char s = 'G';
	
	switch(s){
	case 'G':
		{
			 System.out.println(" here"+colors.B);
			 return colors.G;
		}
	case 'B':
		return colors.B;
		
	default:
		System.out.println("no coor");
		return null;
	}
	//System.out.println("here no color");
	
	
}
 public static void qstack(){
/*	 Queue<Integer> q1 = new LinkedList<Integer>();
	 Queue<Integer> q2 = new LinkedList<Integer>();
	 
	 int pop = q1.remove();*/
	 String s1 = "shalmal";
	 String s2 = "shlamal";
	if(sort(s1).equals(sort(s2))){
		System.out.println("anagram");
	}
	 int arr[] = {1,2,3,4,5,6,7};
	 HashMap hash = new HashMap();
	/* hash.put(10, 1);int i = 10;
	 int sum = 20*/;
	int sum = 10;
	
	
	for(int i = 0;i<arr.length;i++){
		int value = sum - arr[i];
		if(hash.containsKey(value)){
			System.out.println(value+" and "+arr[i]);
		}
		else
		{
			hash.put(arr[i], arr[i]);
		}
	}
	Arrays.sort(arr);
for(int i = 0 ;i<arr.length;i++){
		
	}	 
 }
 
}

	

	

