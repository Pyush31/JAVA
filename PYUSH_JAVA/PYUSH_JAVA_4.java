import java.io.*;
class PYUSH_JAVA_4{
    	public static void main(String args[])throws IOException
	{ 
	  int sum=0,rem,n;
	  String s;
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	  System.out.println(" enter values of n");
		s=br.readLine();
	  n=Integer.parseInt(s);
      while(n!=0)
	{ rem=n%10;
      sum=(sum*10)+rem;
	  n=n/10;
	}
		
	System.out.println("reverse is "+sum);
	
		}
}