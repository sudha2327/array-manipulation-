import java.util.*;
import java.math.*;

public class hii {
    public static void main(String args[]) {
        int n,m;
         int p,q,sum;
          long max=0,x=0;
        
        //Scanner
        Scanner input=new Scanner(System.in);
        n=input.nextInt(); //no of the elements gonna store
        m=input.nextInt(); // no of the operations
        long[] a=new long[n+1];
        for(int i=0;i<m;i++){
             
            p=input.nextInt();         
            q=input.nextInt();         
            sum=input.nextInt();
            
            a[p-1]+=sum;
            a[q]-=sum;

            
            

        }

        for(int i=0;i<n;i++){
    
           
            x+=a[i];
            max=Math.max(max,x);
            
        }

         System.out.println(max);    
    }
}
