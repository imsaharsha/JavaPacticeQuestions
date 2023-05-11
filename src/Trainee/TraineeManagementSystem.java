package Trainee;
import java.util.ArrayList;

public class TraineeManagementSystem {						//class named TraineeManagementSyatem is created
    private ArrayList<Trainee> trainees = new ArrayList<>();        //creating array list to add or delete records
    public ArrayList<Trainee> getTrainees() {						//get trainees can be called to initiate trainee
        return trainees;
    }

    public void addTrainee(Trainee e) {								//local variable e 
        trainees.add(e);
    }

    public void removeTrainee(Trainee e) {
        trainees.remove(e);
    }

    public void viewAllTrainees() {
        for (Trainee e : trainees) {
            System.out.println("Name: " + e.getName() + ", Age: " + e.getAge()+ ", Address: " + e.getAddress()+", Gender: " + e.getGender() + ", Course: " + e.getCourse());
        }
    }
    public void updateTraineeRecord(Trainee e, String name, int age, String address, String gender, String course) {   	//updates the record of trainee
        int index = trainees.indexOf(e); 		
        //check whether  particular trainee object, represented by the variable e, exists in a list called trainees.	
        if (index != -1) {
			Trainee updatedTrainee = new Trainee(name, age, address, gender, course);
            trainees.set(index, updatedTrainee);
        }
    }
      
}

    


	

