package Day3.EmployeeWageComputationProblem;

public class EmployeeWageComputationProblemUC1 {
	public static void main(String[] args) {
		int present=1;
		int empCheck= (int)Math.floor(Math.random()*10)%2;
		if(empCheck==present)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
	}
}