package factory_design_pattern;

public class EmployeeFactory {
	public static Employee getEmployee(String empType) {
		if(empType!=null && empType.trim().equalsIgnoreCase("ANDROID DEVELOPER")) {
			return new AndroidDeveloper();
		}else if(empType!=null && empType.trim().equalsIgnoreCase("WEB DEVELOPER")){
			return new WebDeveloper();
		}
		return null;
	}
}
