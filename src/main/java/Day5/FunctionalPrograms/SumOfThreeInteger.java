package Day5.FunctionalPrograms;
import java.util.Scanner;
public class SumOfThreeInteger {

	public static void main(String[] args) {
		
		SumOfThreeInteger s= new SumOfThreeInteger();
		SumOfThreeInteger.addThreeInteger();
	}
		public static void addThreeInteger() {
		int N;
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		N=sc.nextInt();  
		int[] array = new int[10];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<N; i++)  
		{  
		array[i]=sc.nextInt();  
		}  
		System.out.println("Array elements are: ");  
		for (int i=0; i<N; i++)   
		{  
		System.out.println(array[i]);  
		}  
		  
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == 0) {
                        System.out.println("Numbers found : " + array[i] + "," + array[j] + " and " + array[k]);
                    }
                }
            }
        }
    }
}