/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

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
               a= false;
           }
         String st=str.replace("+","*").replace("-","*").replace("/","*").replace("%","*").replace("x","*");
         if(st.charAt(0)=='*'||st.charAt(st.length()-1)=='*'){
             a=false;
         }
         for(int i=1;i<st.length()-1;i++){
             char c1=st.charAt(i-1);
             char c2=st.charAt(i+1);
             
             if(st.charAt(i)=='*'){
                 if((Character.isLetter(c1)||Character.isDigit(c1))&&(Character.isLetter(c2)||Character.isDigit(c2))){
                 a=true;
                 }
                 else{
                 a=false;
                 break;
             }
             }
             
         }
        return a;
          
    }
    
	public static void main(String[] args) {
		String a="(10+4/5+6+12)";
		boolean v=isValid(a);
		System.out.print(v);
	}
}
