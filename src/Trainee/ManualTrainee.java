package Trainee;

public class ManualTrainee extends Trainee { 				//child class inherit from parent class
	private double salary;
	private int id;
    
    
	public ManualTrainee(String name, int age, String address,String gender, String job,Double salary, int id) {
		super(name, age, address,gender,job);    //super class gives access to parent object
		
		this.salary= salary;
		this.id=id;
		
		
		// TODO Auto-generated constructor stub
	}
	public double getSalary()   //method to return the value of salary 
	{
		return salary;
	}
	public int getId()		//method to return the value of working days
	{
		return id;
	}
	

	}

