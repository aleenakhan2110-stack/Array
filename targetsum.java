import java.util.Scanner;
public class targetsum {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int []A=new int [N];
        for(int i=0;i<N;i++){
           A[i]=sc.nextInt();
        }
        int target =sc.nextInt();
        int ans=0;
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++)
            if(A[i]+A[j]==target){
                ans++;

            }
        }
        System.out.println(ans);
    }
}
