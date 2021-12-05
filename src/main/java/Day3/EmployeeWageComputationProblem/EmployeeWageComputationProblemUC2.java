package Day3.EmployeeWageComputationProblem;
public class EmployeeWageComputationProblemUC2 {
	public static void main(String[] args) {
		int wagePerHour=20;
		 int present=1;
		 int absent=2;
		 int empHours=0;
		 int dailyEmployeeWage=0;
	   	 int empCheck= (int)Math.floor(Math.random()*10)%2;
		if(empCheck==present)
			empHours=8;
		else
			empHours=0;
		dailyEmployeeWage=empHours*wagePerHour;
		System.out.println("Employee Daily wage hour:" +dailyEmployeeWage);
	}
}