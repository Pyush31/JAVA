import java.io.*;
class PYUSH_JAVA_3{
    	public static void main(String args[])throws IOException
	{ 
	int n,f=1;
	String s;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.println(" enter values of n");
		s=br.readLine();
	n=Integer.parseInt(s);
	for(int i=n;i>0;i--)
	{ f*=i;

    }
	System.out.println("factorial "+f);
	
		}
}