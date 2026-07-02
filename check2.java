import java.util.Scanner;// not correct code
public class check2 {
    static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int []A=new int [N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();}
        for(int i=1;i<N;i++){
            if(A[i]<A[i-1]){
                System.out.println("not sorted");

                break;
            }
            else{
                System.out.println("sorted");
            }


            }


        }
    }

