import java.io.*;
import java.lang.*;
import java.util.*;

class complex
{ 
    int i;
	int r;
	
	complex()
	{ 
	    this.i=0;
		this.r=0;
	}

	complex( int i, int r)
	{ this.i=i;
	  this.r=r;
	}

	void input()
	{ 
		Scanner a = new Scanner(System.in);
		System.out.println(" Enter the real number");
		this.r = a.nextInt();
		System.out.println(" enter the imaginary number");
		this.i = a.nextInt();
	}
	
	complex add(complex a)
	{
		complex temp = new complex();
		temp.r = this.r + a.r;
		temp.i = this.i + a.i;
		return temp;
	}		
	
	complex pro( complex a)
	{
		complex temp = new complex();
		temp.r = ( this.r*a.r )-( this.i*a.i );
		temp.i = ( this.r*a.i )+(this.i*a.r);
		return temp;
	}
	
	public String toString()
	{
		return this.r + "+" + this.i +"i";
	}
	
}