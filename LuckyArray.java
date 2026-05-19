import java.util.Scanner;
public class LuckyArray {
     public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         int N=sc.nextInt();
         int []A=new int[N];
         for(int i=0;i<N;i++) {
             A[i] = sc.nextInt();
         } int min =A[0];
         for(int i=0;i<N;i++){
             if(A[i]<min) {
                 min=A[i];

             }}int freq=0;
             for(int i=0;i<N;i++){
                 if(A[i]==min){
                     freq++;
                 }
             }//check if frequency is odd
             if(freq%2!=0){
                 System.out.println("Lucky");

             }
             else{
                 System.out.println("unlucky");
             }






    }
}
