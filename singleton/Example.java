package singleton;

public class Example {
	public static void main(String[] args) {
//		int s1 = new Samosa().hashCode();
//		int s2 = new Samosa().hashCode();
		int s1 = Samosa.getSamosa().hashCode();
		int s2 = Samosa.getSamosa().hashCode();
		
		System.out.println(s1+" , "+s2);
	}
}
