package Trainee;


public class AutomationTrainee extends Trainee {     //Child class inherits attributes from parent class
    private double salary;
    private int id;
   

    public AutomationTrainee(String name, int age, String address, String gender,String job, double salary, int id) {
        super(name, age, address,gender,job);     //super class gives access to parent object
        this.salary = salary;
        this.id = id;  			//reference 
       
    }

    public double getSalary() {  			//creating methods which returns the value of salary 
    	
        return salary; 						
    }

    public int getId() {      		//creating method which returns working day
        return id;
    }
    
   
}
