import java.util.Scanner;
public class SumDigits {
   public  static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int sum=0;
       long number=sc.nextLong();
       int[]A=new int [N];
       for(int i=N-1;i>=0;i--) {
           A[i]=(int)(number%10);
           sum+=A[i];
           number/=10;
       }
       System.out.println(sum);




    }
}
