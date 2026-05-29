import java.util.Scanner;
public class minimumoperations {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int[]A=new int[N];
       for(int i=0;i<N;i++){
           A[i]=sc.nextInt();

       }
      int count=0;
       boolean canPreform=true;

       while(true){
           for(int i=0;i<N;i++){
               if(A[i]%2!=0){
                   canPreform=false;
                   break;
               }
               A[i]/=2;
           }
           if(canPreform){
               count++;
           }
           else{
               break;
           }
       }
       System.out.println(count);


    }
}
