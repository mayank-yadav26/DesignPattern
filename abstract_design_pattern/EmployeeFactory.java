package abstract_design_pattern;

public class EmployeeFactory {
	public static Employee getEmployee(EmployeeAbstractFactory absFactory) {
		return absFactory.createEmployee();
	}
}
