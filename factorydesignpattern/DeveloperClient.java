package factorydesignpattern;

public class DeveloperClient {
	 public static void main(String[] args) {
		Employee empAndroid = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
		System.out.println(empAndroid.salary());
		
		Employee empWeb = EmployeeFactory.getEmployee("WEB DEVELOPER");
		System.out.println(empWeb.salary());
	}
}
