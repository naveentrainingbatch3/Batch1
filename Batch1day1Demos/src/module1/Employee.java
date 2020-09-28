package module1;

public class Employee {
	private int employeeId;
	private String employeeName;

	public Employee(int employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public void display() {
		System.out.println("Employee Id" + employeeId);
		System.out.println("Employee Name" + employeeName);
	}

	int sum(int a, int b) {
		return (a + b);
	}

	public static void main(String[] args) {
		Employee emp = new Employee(13, "Rekha");
		Employee emp1 = new Employee(14, "Shikhar");
		emp.display();
		emp1.display();
		int p = emp.sum(34, 56);
		System.out.println("Sum" + p);

	}
}
