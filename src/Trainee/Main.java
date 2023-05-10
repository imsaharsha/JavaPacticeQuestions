package Trainee;

public class Main {

		public static void main(String[] args) {
			TraineeManagementSystem tms = new TraineeManagementSystem();
			TechnicalTrainee ftt1 = new TechnicalTrainee("hari",20,"Baneshwor","Male","Quality Analyst",(double)2000000,5);
			tms.addTrainee(ftt1);
			
			
			ManagementTrainee ptt1 = new ManagementTrainee("Ram",20,"Dhulikhel","Male","Human Resourses",(double)100000,3);
			tms.addTrainee(ptt1);

			TechnicalTrainee ftt2 = new TechnicalTrainee("Sita",22,"Kathmandu","Female","Java Developer",(double)300000,6);
			tms.addTrainee(ftt2);
			//tms.removeTrainee(ftt2);			//using method to remove trainee details
			

			ManagementTrainee ptt2 = new ManagementTrainee("Gita",22,"Lalitpur","Female","PeopleOperations",(double)150000,4);
			tms.addTrainee(ptt2);
			
			TechnicalTrainee ftt3 = new TechnicalTrainee("radha",22,"Chitwan","female","Flutter",(double)300000,6);
			tms.addTrainee(ftt3);
			
			for (Trainee e : tms.getTrainees()) {
			    if (e instanceof TechnicalTrainee) {
			    	TechnicalTrainee ftt = (TechnicalTrainee) e;
			        System.out.println("Technical Trainee: Name: " + ftt.getName() + ", Age: " + ftt.getAge() + ", Address: " + ftt.getAddress()+",Gender:"+ftt.getGender()+ ", Course: " + ftt.getCourse() + ", Salary: " + ftt.getSalary() + ", ID: " + ftt.getId());
			    } else if (e instanceof ManagementTrainee) {
			    	ManagementTrainee ptt = (ManagementTrainee) e;
			        System.out.println("Management Trainee: Name: " + ptt.getName() + ", Age: " + ptt.getAge() + ", Address: " + ptt.getAddress()+",Gender:"+ptt.getGender()+ ", Course: " + ptt.getCourse() + ", Salary: " + ptt.getSalary() + ", ID: " + ptt.getId());
			    }
			}
			System.out.println("Updated Trainee Record");
			tms.updateTraineeRecord(ftt1, "Hari Prasad", 21, "Bhaktapur", "Male", "Automation Engineer");
			
			tms.updateTraineeRecord(ftt2, "sita devi",21,"dhulikhel", "female", "Python developer");
			tms.viewAllTrainees();
		}
		
}



