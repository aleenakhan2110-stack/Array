import java.util.Scanner;
public class Neighbors8 {
  public  static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      int M=sc.nextInt();
      sc.nextLine();
      char [][]A =new char [N][M];

      for(int i=0;i<N;i++){
          String line=sc.nextLine();
          for(int j=0;j<M;j++){
              A[i][j]=line.charAt(j);
          }
      }
      int X=sc.nextInt()-1;
      int Y=sc.nextInt()-1;

      boolean allNeighborsX= true;

      for(int i=X-1;i<=X;i++){
          for(int j=Y-1;j<=Y;j++){
              if(i==X && j==Y) continue;

              if(i>=0 && i<N && j>=0 && j<M){
                  if(A[i][j]!='x'){
                      allNeighborsX=false;
                      break;
                  }

              }


          }
          if(allNeighborsX) break;
      }
      if(allNeighborsX){
          System.out.println("yes");
      }
      else{
          System.out.println("no");
      }




    }
}
