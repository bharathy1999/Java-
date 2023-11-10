/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{   static int number (int n){
    if(n==0){
        return 0;
        
    }
    return n+number(n-1);
}
	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      int a=sc.nextInt();
	      int array[][]=new int [a][a];
	      int num =Main.number(a);
	      boolean acc=true;
	      int i=0;
	      int j=0;
	      int k=1;
	      while(acc){
	          if(a[i][j]!=0){
	              a[i][j]=k;
	              k++;
	          }
	          if(j==i&&i<a-1&&j<a-1){
	              i++;
	              j++;
	          }
	         if(j==i&&i==a-1&&j==a-1){
	              i--;
	          }
	          if(k==num){
	              acc=false;
	          }
	          
	      }
	      
	      
	      
	}
}
