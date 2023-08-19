package factory_design_pattern;

public class WebDeveloper implements Employee{

	@Override
	public int salary() {
		System.out.println("Web developer salary is : "+2000);
		return 2000;
	}

}
