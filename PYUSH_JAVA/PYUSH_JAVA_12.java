import java.io.*;
import java.lang.*;
import java.util.*;

class Distance
{
	Scanner a = new Scanner(System.in);
	int feet;
	int inch;
	//default constructor
	Distance()
	{
		System.out.println(" enter feet  ");
		this.feet = a.nextInt();
		System.out.println(" enter inches  ");
		this.inch = a.nextInt();
		while(inch>=12)
		{ int x= inch/12;
			feet = feet+x;
			inch = inch%12;
		}
	}
	
	Distance(int f, int i )
	{
		feet = f;
		inch = i;
		while(inch>=12)
		{ int x= inch/12;
			feet = feet+x;
			inch = inch%12;
		}
	}
	//copy constructor
	Distance( Distance a)
	{
		this.feet = a.feet;
		this.inch = a.inch;
	}
	
	//Display
	public String toString()
	{
		return this.feet + "\'" + this.inch + "\"";
	}
		
	
}

class PYUSH_JAVA_12
{
	public static void main(String args[])throws IOException
	{ Distance dist = new Distance();
	System.out.println(dist);
	Distance d1,d2,d3;
	d1 = new Distance(12,48);
	System.out.println("di = "+d1);
	d2 = new Distance(0,48);
	System.out.println("d2 = "+d2);
	d3=d2;
	d3 = new Distance(d1);
	System.out.println(" d3 = "+d3);
	
	
	
	
	}
}