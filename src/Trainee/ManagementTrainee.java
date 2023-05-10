package Trainee;

public class ManagementTrainee extends Trainee { 				//child class inherit from parent class
	private Double salary;
	private int workingDays;
    
    
	public ManagementTrainee(String name, int age, String address,String gender, String course,Double salary, int workingDays) {
		super(name, age, address,gender, course, salary, workingDays);    //super class gives access to parent object
		
		this.salary= salary;
		this.workingDays=workingDays;
		
		
		// TODO Auto-generated constructor stub
	}
	public double getSalary()   //method to return the value of salary 
	{
		return salary;
	}
	public int getWorkingDays()		//method to return the value of working days
	{
		return workingDays;
	}
	

	}

