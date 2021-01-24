import java.io.*;
import java.util.Scanner;
class PYUSH_JAVA_8{
    	public static void main(String args[])throws IOException
	{       
		System.out.println(" enter size of array");
	  Scanner a = new Scanner(System.in);
       int array_size = a.nextInt();
        int array[];
       array = new int[array_size];
	   for(int i =0; i<array_size; i++)
	   { System.out.println(" Enter the "+ i + "th element of array");
          array[i]=a.nextInt();
	   }
		for(int i =0; i<array_size; i++)
	   { System.out.println(array[i]);
	   }
	}
}