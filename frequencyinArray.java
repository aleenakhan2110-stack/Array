import java.util.Scanner;
public class frequencyinArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int []A=new int[N];
        int [] freq=new int[M+1];// initalizing the frequency array of size M+1
        for(int i=0;i<N;i++){
            int num=sc.nextInt();
            freq[num]++;
        }
        for(int i=1;i<M;i++){
            System.out.println(freq[i]);
        }

    }
}
