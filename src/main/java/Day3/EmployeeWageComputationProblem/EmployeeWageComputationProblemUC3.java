package Day3.EmployeeWageComputationProblem;

public class EmployeeWageComputationProblemUC3 {
	public static void main(String[] args) {
		 int wagePerHour=20;
		 int present=1;
		 int absent=2;
		 int dailyEmployeeWage=0;
		 int empHours=0;
		 int empCheck= (int)Math.floor(Math.random()*10)%3;
		if(empCheck==present)
			empHours=8;
		else if(empCheck==absent)
			empHours=0;
		else
			empHours=8;
		dailyEmployeeWage=empHours*wagePerHour;
		System.out.println("Employee Daily wage hour:" +dailyEmployeeWage);
	}

}