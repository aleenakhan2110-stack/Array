import java.util.Scanner;
public class fibonacci {
  public  static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      if(N==1){
          System.out.println(0);
      }
      else if(N==2){
          System.out.println(2);

      }
      else{
          int a=0;
          int b=1;
          int result=0;

          for(int i=3;i<=N;i++){
              result=a+b;
              a=b;
              b=result;
          }
          System.out.println(result);
      }

    }
}
