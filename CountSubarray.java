import java.util.Scanner;
public class CountSubarray {
  public  static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int T=sc.nextInt();
      while(T-->0){
          int N=sc.nextInt();
          int [] A=new int[N];

          for(int i=0;i<N;i++){
              A[i]=sc.nextInt();

          }
          long count=0;
          int length=1;
          for(int i=1;i<N;i++){
              if(A[i]>=A[i-1]){
                  length++;
              }
              else{
                  count+=(long)length*(length+1)/2;
                  length=1;
              }
          }
          count +=(long)length*(length+1)/2;
          System.out.println(count);
      }

    }
}
