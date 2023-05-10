package Trainee;

public class Trainee {
    private String name;//attributes
    private int age;
    private String address;
    private String gender;
    private String course;

    public Trainee(String name, int age, String address,String gender, String course, Double salary, int workingdays) {
        this.name = name; // assigning the value of name parameter to name instance
        this.age = age; //reference variable This
        this.address = address;
        this.gender = gender;
        this.course = course;
    }

    public String getName() {    //method creation
        return name;               //returns name 
    }

    public int getAge() {
        return age;					// returns age
    }

    public String getAddress() {
        return address;					//returns address
    }

    public String getCourse() {
        return course;						//returns course		
    }

	public String getGender() {
		return gender;						//returns gender
	}
}