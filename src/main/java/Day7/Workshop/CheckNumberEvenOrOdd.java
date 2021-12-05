package Day7.Workshop;

import java.util.Scanner;
public class CheckNumberEvenOrOdd {
    public static void main(String[] args) {
    	CheckNumberEvenOrOdd c= new CheckNumberEvenOrOdd();
    	c.checkNumberEvenOrOdd();
    }
    	public static void checkNumberEvenOrOdd() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
       int num = reader.nextInt();
        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    
    for (int i=1;i<=10;i++)
    {
    	int table=num*i;
        System.out.println("Table is" +table);
    }
    }
}