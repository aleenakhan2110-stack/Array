import java.util.Scanner;
public class minimumoperations {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int[]A=new int[N];
       for(int i=0;i<N;i++){
           A[i]=sc.nextInt();

       }
       int maxOperations=Integer.MAX_VALUE;
       for(int i=0;i<N;i++){
           int count=0;
           if(A[i]%2==0){
               A[i]/=2;
               count++;

           }
           maxOperations=Math.min(maxOperations,count);
       }
       System.out.println(maxOperations);

    }
}
