package Day5.BasicCoreJava;
import java.util.Scanner;
public class HarmonicNumber {
	public static void main(String[] args) {
		double N;
		double Hn=0;
		System.out.println("Enter an num :: ");
	    Scanner sc = new Scanner(System.in);
	    N = sc.nextInt();
	    for (double i=1;i<N;i++)
	    { 			Hn=Hn+(1/i);
			System.out.print((1)+"/"+i+"+");
	    }
		System.out.println("\nHarmonic value = "+Hn);
	}
}