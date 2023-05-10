package Trainee;


public class TechnicalTrainee extends Trainee {     //Child class inherits attributes from parent class
    private double salary;
    private int workingDays;
   

    public TechnicalTrainee(String name, int age, String address, String gender,String course, double salary, int workingDays) {
        super(name, age, address,gender,course, salary, workingDays);     //super class gives access to parent object
        this.salary = salary;
        this.workingDays = workingDays;  			//reference 
       
    }

    public double getSalary() {  			//creating methods which returns the value of salary 
    	
        return salary; 						
    }

    public int getWorkingDays() {      		//creating method which returns working day
        return workingDays;
    }
    
   
}
