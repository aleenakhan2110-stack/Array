import java.util.Scanner;
public class ReplaceMinMax {
   public  static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]A=new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        int minindex=0;
        int maxindex=0;
        for(int i=1;i<N;i++){
            if(A[i]<A[minindex]){
                minindex=i;
            }
            if(A[i]>A[maxindex]){
                maxindex=i;

            }
        }
        int temp=A[minindex];
        A[minindex]=A[maxindex];
        A[maxindex]=temp;

        for(int i=0;i<N;i++){
            System.out.print(A[i]);
            if(i<N-1){
                System.out.print(" ");
            }
        }


    }
}
