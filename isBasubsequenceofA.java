import java.util.Scanner;
public class isBasubsequenceofA {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int N=sc.nextInt();
         int M=sc.nextInt();
         int [] A=new int[N];
         int [] B=new int[M];
         for(int i=0;i<N;i++){
             A[i]=sc.nextInt();

         }
         for(int j=0;j<M;j++){
             B[j]=sc.nextInt();

         }
         int i=0;
         int j=0;

         while(i<N&&j<M){
             if(A[i]==B[j]){
                 j++;
             }
             i++;
         }
         if(j==M){
             System.out.println("YES");
         }
         else{
             System.out.println("NO");
         }

    }
}
