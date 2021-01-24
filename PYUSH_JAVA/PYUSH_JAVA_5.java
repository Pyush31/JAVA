import java.io.*;
class PYUSH_JAVA_5{
    	public static void main(String args[])throws IOException
	{ 
	  int i,j,c,n;
	  String s;
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	  System.out.println(" enter values of n");
		s=br.readLine();
	  n=Integer.parseInt(s);
      for(j=2;j<=n;j++)
	  { c=0;
		for(i=1;i<=j;i++)
		{ if(j%i==0)
		c++;}
	if(c==2)
	System.out.println("prime nos "+j);
	  }
	
	}
	}