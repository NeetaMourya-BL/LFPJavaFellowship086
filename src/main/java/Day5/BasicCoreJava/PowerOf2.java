package Day5.BasicCoreJava;
import java.util.Scanner;
public class PowerOf2 {
	public static void main(String[] args) {
	int N;
	long p=1;
	System.out.println("Enter an num :: ");
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    if (N <31) {
    for (int i=0;i<=N;i++)
    {
        p=p*2;
    }
	System.out.println("Enter an num :: "+p);
	}
	else {
		System.out.println("N greater then 31");
}
}
	}