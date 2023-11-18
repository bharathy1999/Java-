import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int count=0;
		int num=a;
		while(a!=0){
		    count++;
		    a=a/10;
		}
		int b[]=new int[count];
		for(int i=0;i<count;i++){
		    b[i]=num%10;
		    num=num/10;
		}
		boolean d=true;
		for(int i=0;i<b.length-1;i++){
		    if(Math.abs(b[i]-b[i+1])!=1){
		        d=false;
		        break;
		    }
		}
		if(d){
		    System.out.println("Given number is a jumbled number");
		}
		else{
		    System.out.print("Given number is not a jumbled number");
		}
	}
}
