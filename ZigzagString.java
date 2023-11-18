/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int row=sc.nextInt();
	    int c=row-1;
	    int k=row+(row-2);
	    String str=sc.next();
	    while(k<str.length()) {
	    	c=c+row-1;
	    	k=k+row+(row-2);
	    }
		char [][]ch=new char[row][c];
		
int index=0;
int i=0,j=0;
outer:
  while(index<str.length()) {
	  
	  for(int f=0;f<row;f++) {
		  if(index==str.length()) {
			   break outer;
		  }
		  ch[i][j]=str.charAt(index);
		  if(i==row-1) {
			i--;
			j++;
		  }
		  else {
			  i++;
		  }
		   index++;
	  }

	  
	  for(int f=0;f<row-2;f++) {
		  if(index==str.length()) {
			   break outer;
		  }
		  ch[i][j]=str.charAt(index);
		 i--;
		 j++;
		 index++;
	  }
  }
for (int x=0;x<row;x++) {
    for (int y=0;y<c;y++) {
        if (ch[x][y]!='\u0000') {
            System.out.print(ch[x][y]+" ");
        } 
        else {
            System.out.print("  ");
        }
    }
    System.out.println();
}



		
	}

}
