package abstract_design_pattern;

public class WebDeveloperFactory extends EmployeeAbstractFactory{

	@Override
	public Employee createEmployee() {
		return new WebDeveloper();
	}
	
}
