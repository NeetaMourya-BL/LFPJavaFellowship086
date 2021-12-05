package Day3.EmployeeWageComputationProblem;

public class EmployeeWageComputationProblemUC5 {
	public static final int wagePerHour=20;
    public static final int present=1;
    public static final int absent=2;
    public static final int workingdayPerMonth=20;
public static void main(String[] args) {
	 int dailyEmployeeWage=0; 
	 int totalEmpWage=0;
	 int empHours=0;
	 for(int day=0; day<workingdayPerMonth; day++) 
	 {
	int empCheck= (int)Math.floor(Math.random()*10)%3;
	switch(empCheck)
	{
	    case present:
	        System.out.println("Employee is present");
	        empHours=8;
	        break;
	    case absent:
	        System.out.println("Employee is absent");
	        empHours=0;
	        break;
	    default:
	        System.out.println("Employee is part time");
	    	empHours=8;
	} 
	dailyEmployeeWage=empHours*wagePerHour;
	System.out.println("Employee Daily wage hour:" +dailyEmployeeWage);
	totalEmpWage=totalEmpWage+dailyEmployeeWage;
}	
    System.out.println("Total Emp wage hour:" +totalEmpWage);
}
}