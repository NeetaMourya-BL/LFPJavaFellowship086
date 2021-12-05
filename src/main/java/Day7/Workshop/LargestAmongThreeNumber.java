package Day7.Workshop;
import java.util.Scanner;
public class LargestAmongThreeNumber {
	static int max=0;
	public static void main(String[] args) {
		LargestAmongThreeNumber l=new LargestAmongThreeNumber();
		l.threeDigitNumber();
		System.out.println("The sum of digits: "+findSum(max)); 
	}
		public static void threeDigitNumber() {
			  int number1;
			  int number2;
			  int number3;
			  Scanner scanner = new Scanner(System.in);
			  System.out.println("Enter numner 1 : ");
			  number1 = scanner.nextInt();
			  System.out.println("Enter numner 2 : ");
			  number2 = scanner.nextInt();
			  System.out.println("Enter numner 3 : ");
			  number3 = scanner.nextInt();
			  if(number1>=number2 && number1>=number3) {
				  System.out.println(number1+" is the largest Number");  
			  max=number1;
		      System.out.println("Max is " + max);}
				  else if (number2>=number1 && number2>=number3)  {
				  System.out.println(number2+" is the largest Number");  
			  max=number2;	      
			  System.out.println("Max is " + max);}
				  else  {
				  System.out.println(number3+" is the largest number");  
			  max=number3;
		      System.out.println("Max is " + max);}
			 }
		static int findSum(int max)  
	    {     
	    	int sum = 0;  
	    while (max != 0)  
	    {  
	    sum = sum + max % 10;  
	    max = max/10;  
	    }           
	    return sum;  
	    }  
}