import java.util.Scanner;
public class Matrix {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int N=sc.nextInt();
         int [][]A=new int [N][N];
         for(int i=0;i<N;i++){
             for(int j=0;j<N;j++){
                 A[i][j]=sc.nextInt();
             }
         }
         int primarysum=0;
         int secondarysum=0;

         for(int i=0;i<N;i++){
             primarysum+=A[i][i];
             secondarysum+=A[i][N-1-i];

         }
        int result=primarysum-secondarysum;
         if(result<0){
             result=-result;
         }
         System.out.println(result);


    }
}
