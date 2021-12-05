package Day8.LineComparisonProblem;
import java.lang.Math;
import java.util.Scanner;
public class LineComparisonProblemUC3 {
	public static void main(String args[])
    {
	int x1, x2, y1, y2;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter value of x1=");
    x1 = scan.nextInt();
    System.out.print("Enter value of x2=");
    x2 = scan.nextInt();
    System.out.print("Enter value of y1=");
    y1 = scan.nextInt();
    System.out.print("Enter value of y2=");
    y2 = scan.nextInt();
    int num1=x2-x1;
    int num2=y2-y1;
    double n1=Math.pow(num1,2);
    double n2=Math.pow(num2,2);
    double num=n1+n2;
    double n=Math.sqrt(num);
    System.out.println("Lengths of line="+n);
    if (n < x2 && n < y2)
        System.out.println("line is less then other line");
    else if (n > x2 && n > y2)
        System.out.println("line is greater then other line");
    else
        System.out.println("line is equal");
    scan.close();
}
}
