package Day5.FunctionalPrograms;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray  {
	public static void main(String args[])   
	{  
		TwoDArray tda=new TwoDArray();
		TwoDArray.intArray();
		TwoDArray.doubleArray();
		TwoDArray.boolArray();
    }
	public static void intArray() {   
	int m, n, i, j;   
	Scanner sc=new Scanner(System.in);   
	System.out.print("Enter the number of rows: ");   
	m = sc.nextInt();   
	System.out.print("Enter the number of columns: ");   
	n = sc.nextInt();   
	int array[][] = new int[m][n];   
	System.out.println("Enter the elements of the array: ");   
	for (i = 0; i < m; i++)   
	for (j = 0; j < n; j++)   
	array[i][j] = sc.nextInt();   
	System.out.println("Elements of the array are: ");   
	for (i = 0; i < m; i++)   
	{   
	for (j = 0; j < n; j++)   
	System.out.print(array[i][j] + " ");   
	System.out.println();   
	}   
	}   
	public static void doubleArray() {   
		double m, n, i, j;   
		Scanner sc=new Scanner(System.in);   
		System.out.print("Enter the number of rows: ");   
		m = sc.nextDouble();   
		System.out.print("Enter the number of columns: ");   
		n = sc.nextDouble();   
		double array[][] = new double[(int) m][(int) n];   
		System.out.println("Enter the elements of the array: ");   
		for (i = 0; i < m; i++)   
		for (j = 0; j < n; j++)   
		array[(int) i][(int) j] = sc.nextInt();   
		System.out.println("Elements of the array are: ");   
		for (i = 0; i < m; i++)   
		{   
		for (j = 0; j < n; j++)   
		System.out.print(array[(int) i][(int) j] + " ");   
		System.out.println();   
		}   
		}   
	public static void boolArray() {
		    int m,n,i,j;
			Scanner sc=new Scanner(System.in);   
			System.out.print("Enter the number of rows: ");   
			m = sc.nextInt();   
			System.out.print("Enter the number of columns: ");   
			n = sc.nextInt(); 
	        boolean array[][] = new boolean[m][n];
			System.out.println("Enter the elements of the array: ");
	        for (i = 0; i < array.length; i++) {
	            Arrays.fill(array[i], true);
	           System.out.println(Arrays.toString(array[i]));
        }  
}
}