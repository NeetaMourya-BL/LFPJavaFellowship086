package Day7.Workshop;
public class SwapTwoNumber {
    public static void main(String[] args) {  
    	SwapTwoNumber s=new SwapTwoNumber();
    	s.swapTwoNumber();
    }
    	public static void swapTwoNumber() {
    	int number, digit, sum = 0;  
	int x=67, y=89, t;  
    System.out.println("Before swapping: "+x +"   " + y);  
    t = x;  
    x = y;  
    y = t;  
    System.out.println("After swapping: "+x +"   " + y);  
    number = Integer.valueOf(String.valueOf(x) + String.valueOf(y));
    System.out.println("combine number:" +number);  
    while(number > 0)  
    {  
    digit = number % 10;  
    sum = sum + digit;  
    number = number / 10;  
    }  
    System.out.println("Sum of Digits: "+sum);  
    if (sum >=30)
        System.out.println("sum greater then equals to sum of digit=>" +sum);   
    else
        System.out.println("sum less then to sum of digit=>" +sum);  
    } 
    }