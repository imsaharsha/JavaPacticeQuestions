package Trainee;

public class Main {

		public static void main(String[] args) {
			TraineeManagementSystem tms = new TraineeManagementSystem();
			AutomationTrainee ftt1 = new AutomationTrainee("hari",20,"Baneshwor","Male","Selenium",(double)2000000,5);
			tms.addTrainee(ftt1);
			
			ManualTrainee ptt1 = new ManualTrainee("Ram",20,"Dhulikhel","Male","Android",(double)100000,3);
			tms.addTrainee(ptt1);

			AutomationTrainee ftt2 = new AutomationTrainee("Sita",22,"Kathmandu","Female","Appium",(double)300000,6);
			tms.addTrainee(ftt2);
			//tms.removeTrainee(ftt2);			//using method to remove trainee details
			

			ManualTrainee ptt2 = new ManualTrainee("Gita",22,"Lalitpur","Female","IOS",(double)150000,4);
			tms.addTrainee(ptt2);
			
			AutomationTrainee ftt3 = new AutomationTrainee("radha",22,"Chitwan","female","Jenkins",(double)300000,6);
			tms.addTrainee(ftt3);
			
			for (Trainee e : tms.getTrainees()) {
			    if (e instanceof AutomationTrainee) {
			    	AutomationTrainee ftt = (AutomationTrainee) e;
			        System.out.println("Automation Trainee: Name: " + ftt.getName() + ", Age: " + ftt.getAge() + ", Address: " + ftt.getAddress()+",Gender:"+ftt.getGender()+ ", Job: " + ftt.getJob() + ", Salary: " + ftt.getSalary() + ", ID: " + ftt.getId());
			    } else if (e instanceof ManualTrainee) {
			    	ManualTrainee ptt = (ManualTrainee) e;
			        System.out.println("Manual Trainee: Name: " + ptt.getName() + ", Age: " + ptt.getAge() + ", Address: " + ptt.getAddress()+",Gender:"+ptt.getGender()+ ", Job: " + ptt.getJob() + ", Salary: " + ptt.getSalary() + ", ID: " + ptt.getId());
			    }
			}
			System.out.println("Updated Trainee Record");
			tms.updateTraineeRecord(ftt1, "Hari Prasad", 21, "Bhaktapur", "Male", "Automation Engineer");
			
			tms.updateTraineeRecord(ftt2, "sita devi",21,"dhulikhel", "female", "Python developer");
			tms.viewAllTrainees();
		}
		
}



