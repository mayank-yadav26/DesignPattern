package abstract_design_pattern;

public class AndroidDeveloper implements Employee{

	@Override
	public int salary() {
		return 5000;
	}

	@Override
	public String name() {
		System.out.println("I am an android developer");
		return "ANDROID DEVELOPER";
	}

}
