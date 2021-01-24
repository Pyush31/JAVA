import java.io.*;
class PYUSH_JAVA_2{
    	public static void main(String args[])throws IOException
	{ 
	int n;
	String s;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	float t=0,i;
	System.out.println(" enter values of n");
	s=br.readLine();
	n=Integer.parseInt(s);
	for(i=1;i<=n;i++)
	{ if(i%2==0)
	 t-=i;
     else
	t=t+1;}
	System.out.println("total "+t);

	
		}
}