import java.io.*;
import java.util.*;
import java.lang.*;
class PYUSH_JAVA_10 
{ 
    public static void main(String args[])throws IOException
	{
		Scanner a = new Scanner(System.in);
        System.out.println(" enter some number");
		 int num = a.nextInt();
		 String sum="";
		 int rem = 0;
		 while( num!=0)
		 {
			 rem=num%2;
			 sum+=rem;
			 num = num/2;
		 }
		StringBuilder b = new StringBuilder();
			b.append(sum);
			b=b.reverse();
			System.out.println(b);
	}
}	