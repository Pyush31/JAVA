import java.io.*;
import java.lang.*;
import java.util.*;

class funcOverloading
{
	void one(byte a, byte b)
	{
		System.out.println("one");
	}
	void one(int a, int b)
	{
		System.out.println("two");
	}
}




class PYUSH_JAVA_11 
{
	public static void main( String args[])throws IOException
	{
		byte x = 10;
		int y = 1200;
		funcOverloading a = new funcOverloading();
		//byte>>>>int.
		a.one(y,x);
		
	}

	
}	