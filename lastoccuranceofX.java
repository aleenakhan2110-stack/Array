import java.util.Scanner;
public class lastoccuranceofX {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int []A=new int [N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        int X=sc.nextInt();
        int count=-1 ;
        for(int i=0;i<A.length;i++){
            if(A[i]==X){
                count=i;//because here we have to print the last index in which X appers
            }
        }
        System.out.println(count);
    }
    }

