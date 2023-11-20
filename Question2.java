import java.util.Scanner;
import java.util.Stack;
public class Main
{
   static  boolean isValid(String str){
           boolean a=true;
           int bl=0;
           int br=0;
           for(int i=0;i<str.length();i++){
               if(str.charAt(i)=='('){
                   bl++;
                           }
                if(str.charAt(i)==')'){
                   br++;
                      }
           }
            if(bl!=br){
               return false;
           }
           
           
           
           
           
           return a;
          
    }
    
	  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a mathematical expression :");
        String a=sc.next();
        
         boolean b=isValid(a);
         if(b){
         System.out.print(true);
	}
	else{
        System.out.print(false);
        }
}

}
