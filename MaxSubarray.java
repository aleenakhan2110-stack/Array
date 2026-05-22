import java.util.Scanner;
public class MaxSubarray {
     public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         int T=sc.nextInt();
         while(T-->0){
             int N=sc.nextInt();
             int [] A=new int[N];
             for(int i=0;i<N;i++){
                 A[i]=sc.nextInt();

             }
             for(int i=0;i<N;i++){
                 int max=A[i];
                 for(int j=i;j<N;j++){
                     if(A[i]>max){
                         max=A[j];
                     }
                     System.out.print(max+" ");
                 }
             }
             System.out.println();
         }

    }
}
