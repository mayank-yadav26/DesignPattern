package abstract_design_pattern;

public class AndroidDeveloperFactory extends EmployeeAbstractFactory{

	@Override
	public Employee createEmployee() {
		return new AndroidDeveloper();
	}

}
