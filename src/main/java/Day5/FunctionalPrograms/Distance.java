package Day5.FunctionalPrograms;
import java.util.Scanner;

public class Distance {
	
    public static void main(String[] args) {
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x value");
        x=sc.nextInt();
        System.out.println("enter y value");
        y=sc.nextInt();
        double dist = Math.sqrt(x*x + y*y);
        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
    }
}
