import java.io.*;
import java.util.Scanner;
class PRACTICAL_1
{
    	public static void main(String args[])throws IOException
	{   complex a = new complex();    
		complex b = new complex();
		complex c = new complex();
		
		a.input();
		b.input();
		
		c = a.add(b);
		System.out.println(c);
		System.out.println(a.pro(b));
	}
}