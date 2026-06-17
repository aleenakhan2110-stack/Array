import java.util.Scanner;
public class RangeSumQuery {
  public  static void main(String[] args) {
      Scanner  sc=new Scanner(System.in);
      int N=sc.nextInt();
      int Q=sc.nextInt();
      int []A=new int[N+1];
      long []prefix=new long[N+1];
      for(int i=1;i<=N;i++){
              A[i]=sc.nextInt();
              prefix[i]=prefix[i-1]+A[i];
      }
      for(int i=0;i<Q;i++){
          int L=sc.nextInt();
          int R=sc.nextInt();
          long sum=prefix[R]-prefix[L-1];
          System.out.println(sum);
      }


    }
}
