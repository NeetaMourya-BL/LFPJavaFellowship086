package Day6.LogicalPrograms;

public class PrimeNumber {
	public static void main(String[] args) {
		PrimeNumber pn=new PrimeNumber();
		pn.primeNumber();
	}
	public static void primeNumber() {
	    int num = 33, i = 2;
	    boolean flag = false;
	    while (i <= num / 2) {
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	      ++i;
	    }
	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }
}
