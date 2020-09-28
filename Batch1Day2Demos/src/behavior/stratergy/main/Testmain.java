package behavior.stratergy.main;

import behavior.stratergy.PayAlgorithm;
import behavior.stratergy.impl.InternPayAlgorithm;
import behavior.stratergy.impl.TraineePayAlgorithm;
import behavior.stratergy.impl.WebDesignerPayAlgorithm;
import behavior.stratergy.impl.WebDeveloperpayAlgorithm;
import behavior.stratergy.model.Designation;
import behavior.stratergy.model.Employee;

public class Testmain {

	public static void main(String[] args) {
		
		PayAlgorithm internPayAlgorithm=new InternPayAlgorithm();
		PayAlgorithm traineePayAlgorithm=new TraineePayAlgorithm();
		PayAlgorithm webDesignerPayAlgorithm=new WebDesignerPayAlgorithm();
		PayAlgorithm webDeveloperPayAlgorithm=new WebDeveloperpayAlgorithm();
		
		Designation intern=new Designation("Intern", internPayAlgorithm, 20000.00);
		Designation trainee=new Designation("Trainee", traineePayAlgorithm, 25000.00);
		Designation webDesigner=new Designation("WebDesigner", webDesignerPayAlgorithm, 30000.00);
		Designation webDeveloper=new Designation("WebDeveloper", webDeveloperPayAlgorithm, 35000.00);
		Employee emp1=new Employee("Shikhar", intern);
		Employee emp2=new Employee("Madhura", trainee);
		Employee emp3=new Employee("Rekha", webDesigner);
		Employee emp4=new Employee("Sonal", webDeveloper);
		
		System.out.println(emp1.getEmployeeName()+" with designation "+emp1.getDesignation().getDesignation()+" and total pay is"+emp1.getPay());
		System.out.println(emp2.getEmployeeName()+" with designation "+emp2.getDesignation().getDesignation()+" and total pay is"+emp2.getPay());
		System.out.println(emp3.getEmployeeName()+" with designation "+emp3.getDesignation().getDesignation()+" and total pay is"+emp3.getPay());
		System.out.println(emp4.getEmployeeName()+" with designation "+emp4.getDesignation().getDesignation()+" and total pay is"+emp4.getPay());
		System.out.println("\n Changing Pay Algoritm for employee emp1");
		emp1.setPayAlgorithm(traineePayAlgorithm);
		System.out.println(emp1.getEmployeeName()+"with designation "+emp1.getDesignation().getDesignation()+"and total pay is"+emp1.getPay());
		
		
		
	}
}
