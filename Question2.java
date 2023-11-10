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
	      String a=sc.next();
	      boolean v=true;
	      int bl=0;
	      int br=0;
	      
	      for(int i=0;i<a.length;i++){
	          if(a.charAt(i)=='('){
	              bl++;
	          }
	           if(a.charAt(i)==')'){
	              br++;
	          }
	      }
	      if(bl!=br){
	          v=false;
	      }
	      
	      
	}
}
