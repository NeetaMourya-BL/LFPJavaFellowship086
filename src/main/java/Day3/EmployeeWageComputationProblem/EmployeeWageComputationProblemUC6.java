package Day3.EmployeeWageComputationProblem;

public class EmployeeWageComputationProblemUC6 {
	public static final int wagePerHour=20;
    public static final int present=1;
    public static final int absent=2;
    public static final int workingdayPerMonth=20;
    public static final int totalWorkingHours=100;
public static void main(String[] args) {
	 int totalWorkingDays=0; 
	 int totalEmpHours=0;
	 int empHours=0;
     while (totalEmpHours<=totalWorkingHours && totalWorkingDays<workingdayPerMonth)
	 {
    	 totalWorkingDays++;
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
	totalEmpHours=totalEmpHours+empHours;
	System.out.println("Day:" +totalWorkingDays+ "\nEmployee Daily wage hour:" +empHours);
	 }
	int totalEmpWage=totalEmpHours+wagePerHour;
    System.out.println("Total Emp wage hour:" +totalEmpWage);
}
}