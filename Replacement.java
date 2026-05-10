import java.util.Scanner;
public class Replacement {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int N=sc.nextInt();
         int []arr= new int[N];
         for(int i=0;i<=N;i++){
         int num=sc.nextInt();

             if(num>0){
                 arr[i]=1;
             }
             else if(num<0){
                arr[i]=2;
             }
             else{
                 arr[i]=0;
             }
         }
         //print the modified array
         for(int i=0;i<N;i++){
             System.out.println(arr[i]);
             if(i<N-1){
                 System.out.println(" ");
             }
         }


    }
}
