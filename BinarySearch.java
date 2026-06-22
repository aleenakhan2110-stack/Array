import java.util.Scanner;
public class BinarySearch {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int Q=sc.nextInt();

       int []A=new int [N];
       for(int i=0;i<N;i++){
           A[i]=sc.nextInt();

       }
       for(int i=0;i<Q;i++){
           int X=sc.nextInt();
           boolean found=false;

       for(int j=0;j<N;j++){
           if(A[j]==X){
               found=true;
           break;}
           }
       if(found){
           System.out.println("found");
       }
       else{
           System.out.println("not found");
       }
       }

    }
}
