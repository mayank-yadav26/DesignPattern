package abstract_design_pattern;

public class WebDeveloper implements Employee{

	@Override
	public int salary() {
		return 1000;
	}

	@Override
	public String name() {
		System.out.println("I am a web developer");
		return "WEB DEVELOPER";
	}

}
