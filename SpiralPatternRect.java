import java.util.Scanner;
public class Main
{
    static int lastind(int a){
        if(a==0){
            return 0;
        }
        return a+lastind(a-1);
    }
	  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int lastindex=lastind(n);
        int a[][]=new int[n][n];
        int k=1;
        int i=0;
        int j=0;
        while(k<=lastindex){
            
         if(a[i][j]!=0&&i==0){
             i=i+1;
             j=j+2;
         }
         
            while(a[i][j]==0&&i<n-1){
            a[i][j]=k;
            i++;
            j++;
            k++;
            if(k==lastindex){
                break;
                       }
            }
            
            if(j<=n-1&&a[i][j]!=0){
             i=i-2;
             j=j-1;
                }
         
            while(a[i][j]==0&&i>0){
                a[i][j]=k;
                i--;
                k++;
                if(k==lastindex){
                break;
                         }
            }
            if(j<=n-1&&a[i][j]!=0){
             i=i+1;
             j=j-1;
                }
            
            while(a[i][j]==0&&j<=n-1&&i==0){
                a[i][j]=k;
                j--;
                k++;
                if(k==lastindex){
                break;
            }
            }
            
        }
 


         for (int m=0;m<n;m++) {
            for (int l=0;l<n;l++) {
                if(a[m][l]!=0){
               if(a[m][l]<10)
                System.out.print(a[m][l] +"   ");
                else
                 System.out.print(a[m][l]+"  " );
                }
                else{
                    System.out.print("    ");
                }
            }
            System.out.println(" "); 
        }

	
}

}
