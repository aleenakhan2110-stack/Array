import java.util.Scanner;
public class checkcode {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int A=sc.nextInt();
       int B=sc.nextInt();
       String s=sc.next();

       if(s.length()!=A+B+1){
           System.out.println("No");
           return;

       }
       boolean valid =true;
       if(s.charAt(A)!='-'){
           valid=false;
       }
       for(int i=0;i<s.length();i++){
           if(i==A) continue;
           if(!Character.isDigit(s.charAt(i))){
               valid=false;
               break;
           }

       }
       if(valid){
           System.out.println("Yes");
       }
       else{
           System.out.println("No");
       }

    }
}
