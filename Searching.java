import java.util.Scanner;
public class Searching {
   public  static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]arr=new int[N];

        for(int i=0;i<=N;i++){
            arr[i]=sc.nextInt();


        }
       int X=sc.nextInt();
        int position=-1;
        for(int i=0;i<N;i++){
            if(arr[i]==X){
                position=i;
                break;
            }
        }
       System.out.println(position);


    }
}
