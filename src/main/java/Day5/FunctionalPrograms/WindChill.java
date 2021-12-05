package Day5.FunctionalPrograms;
import java.util.Scanner;
import java.lang.Math;
import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		WindChill wc =new WindChill();
		WindChill.windChill();
	}
		public static void windChill() {
		Scanner sc=new Scanner(System.in);  
        double t = 0,v = 0,w = 0;
        System.out.println("Enter the value of t"); 
        t=sc.nextDouble();
        System.out.println("Enter the value of v");  
		v=sc.nextDouble();
        if (t<50 && v<=120 && v>=3) 
        {
	    w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
		System.out.println("Temperature = " + t);
        System.out.println("Wind speed  = " + v);
        System.out.println("Wind chill  = " + w);
        }
        else 
        {
        System.out.println("the formula is not valid if t is larger than 50 in absolute value or if v is larger than 120 or less than 3 (you may assume that the values you get are in that range)"); 
        }
    }
}
