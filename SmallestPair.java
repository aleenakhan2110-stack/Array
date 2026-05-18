import java.util.Scanner;
public class SmallestPair {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
       while(T-->0){
           int N=sc.nextInt();
           int [] A=new int[N];
           for(int i=0;i<N;i++){
               A[i]=sc.nextInt();

           }
           int minResult=Integer.MAX_VALUE;
           for(int i=0;i<N;i++){
               for(int j=i+1;j<N;j++){
                   int result=A[i]+A[j]+(j-i);
                   if(result<minResult){
                       minResult=result;
                   }
               }
           }
           System.out.println(minResult);
       }

    }
}
