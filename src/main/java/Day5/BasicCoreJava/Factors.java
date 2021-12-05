package Day5.BasicCoreJava;
import java.util.Scanner;
public class Factors {
	public static void main(String args[]){
	      int N;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number ::");
	      N = sc.nextInt();
	     
	      for(int i = 2; i< N; i++) {
	         while(N%i == 0) {
	            System.out.println(i+" ");
	            N = N/i;
	         }
	      }
	      if(N >2) {
	         System.out.println("Prime factor of N number is" +N);
	      }
	   }
}
