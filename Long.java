
public class Long {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    String s = "-123";
		    long ans = test(s);
		    System.out.println("String: "+s+" converted to long: " +ans);
		    System.out.println("Additon with other long number answer is: " +check(ans));
		    
		}

		public final static long test(CharSequence s) {
		   
			int l = s.length();
		    boolean n= s.charAt(0) == '-';//true if negative
		    long v = 0;
		    int p = n?1:0;//if n is true i.e. -ve return  else 0
		    do {
		        v = v*10;
		        int i = s.charAt(p)-48;//Ascii
		        if (i < 0 | i > 9){
		        	//System.out.println("Number format exception");
		            throw new NumberFormatException( s+" Not a Number from 0 to 9 cannot be converted to long" );
		            }
		        v = v+i;//add i
		        p++;
		    } while (l > p);
		    return n?-v:v;//if n true return -ve v.
		}
		
		
		public static long check(long ans){
			long a = 25;
		    long b = a + ans;
		  //  System.out.println(b);
		    return b;
		}
				}


