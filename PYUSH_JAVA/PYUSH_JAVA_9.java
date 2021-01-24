import java.io.*;
import java.util.Scanner;
class PYUSH_JAVA_9
{
    	public static void main(String args[])throws IOException
	{       
	   Scanner a = new Scanner(System.in);
       int M1[][];
	   int M2[][];
	   int M3[][];
	   int i,j;
        System.out.println();
       M1 = new int[3][3];
	   M2 = new int[3][3];
	   M3 = new int[3][3];
	   System.out.println(" enter elements of first matrix");
	    for( i =0; i<3; i++)
	   { for(j=0;j<3; j++)
		   { M1[i][j] = a.nextInt();
		   }
       }
   	   System.out.println(" enter elements of second matrix");
	    for( i =0; i<3; i++)
	   { for(j=0;j<3; j++)
		   { M2[i][j] = a.nextInt();
		   }
       }
	   System.out.println("  first matrix");
	    for( i =0; i<3; i++)
	   { for(j=0;j<3; j++)
		   { System.out.print(M1[i][j]+" ");
		   }System.out.println();
       }
		System.out.println("  second matrix");
	    for( i =0; i<3; i++)
	   { for(j=0;j<3; j++)
		   { System.out.print(M2[i][j]+" ");
		   }System.out.println();
       }
	   System.out.println(" addition of above matrix " );
	   
	    for( i =0; i<3; i++)
	   { for(j=0;j<3; j++)
		   { M3[i][j] = M1[i][j]+M2[i][j];
		   }
       }
	   	for( i =0; i<3; i++)
	   { for(j=0;j<3; j++)
		   { System.out.print(M3[i][j]+" ");
		   }System.out.println();
       }
		System.out.println(" subtraction of above matrix " );
	   
	    for( i =0; i<3; i++)
	   { for(j=0;j<3; j++)
		   { M3[i][j] = M1[i][j]-M2[i][j];
		   }
       }
	   	for( i =0; i<3; i++)
	   { for(j=0;j<3; j++)
		   { System.out.print(M3[i][j]+" ");
		   }System.out.println();
       }
		System.out.println(" multiplication of above matrix " );
	   
	    for( i =0; i<3; i++)
	   { for(j=0;j<3; j++)
		   for(int k=0;k<3;k++)
		   {
		   { M3[i][j] += M1[i][k]*M2[k][j];
		   }
		   }
       }
	   	for( i =0; i<3; i++)
	   { for(j=0;j<3; j++)
		   { System.out.print(M3[i][j]+" ");
		   }System.out.println();
       }
	}
}