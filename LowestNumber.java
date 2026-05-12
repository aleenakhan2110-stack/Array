import java.util.Scanner;
public class LowestNumber {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int min=Integer.MAX_VALUE;
        int position=0;
        for(int i=0;i<=N;i++){
            int current=sc.nextInt();
            if(current<min){
                min=current;
                position=i;
            }
        }
        System.out.println(min+" "+position);
    }
}
