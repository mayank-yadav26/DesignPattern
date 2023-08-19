package abstract_design_pattern;

public class Client {
	
	public static void main(String[] args) {
		Employee androidDev = EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
		Employee webDevFact = EmployeeFactory.getEmployee(new WebDeveloperFactory());
		
		System.out.println(androidDev.name());
		System.out.println(webDevFact.name());
	}
}
