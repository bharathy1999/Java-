import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number of strings ");
   int a=sc.nextInt();
   String st[]=new String[a];
   for (int i=0;i<a;i++){
       st[i]=sc.next();
   }
   
   for(int i=0;i<a;i++){
       char c[]=st[i].toCharArray();
       st[i]="";
       Arrays.sort(c);
       for(int j=c.length-1;j>=0;j--){
           st[i]=st[i]+c[j];
       }
   }
   
	}
}
