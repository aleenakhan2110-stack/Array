import java.util.Scanner;
public class PalindromeArray {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int [] arr=new int[N];
       for(int i=0;i<N;i++){
           arr[i]=sc.nextInt();

       }
       boolean isPalindrome=true;
       for(int i=0;i<N/2;i++){

           if(arr[i]!=arr[N-1-i]){
               isPalindrome=false;
               break;

           }
       }
       if(isPalindrome){
           System.out.print("Yes");

       }

       else{
           System.out.print("No");
       }

    }
}
