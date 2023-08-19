package factory_design_pattern;

public class AndroidDeveloper implements Employee{

	@Override
	public int salary() {
		System.out.println("Android Developer salary: "+100);
		return 100;
	}

}
