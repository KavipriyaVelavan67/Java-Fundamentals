import java.util.*;
public class Ascii{

     public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          
          int[]a=new int[4];
          for(int i=0;i<4;i++){
               a[i]=sc.nextInt();
          }
          for(int i=0;i<4;i++){
            System.out.println((char)a[i]);
          }
     }
}