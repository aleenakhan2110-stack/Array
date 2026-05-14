import java.util.Scanner;
public class Reversing {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int N=sc.nextInt();
         long [] arr=new long [N];
         for(int i=0;i<N;i++){
             arr[i]=sc.nextInt();

         }
         for(int i=N-1;i>=0;i--){
             System.out.print(arr[i]);
             if(i>0){
                 System.out.print(" ");
             }
         }
    }
}
