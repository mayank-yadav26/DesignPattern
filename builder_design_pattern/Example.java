package builder_design_pattern;

public class Example {
	public static void main(String[] args) {
		User user = new User.UserBuilder()
				.setEmailId("mayankyadav@gmail.com")
				.setUserName("Mayank")
				.setUserId("123")
				.build();
		
		System.out.println(user);
		
		User user2 = User.UserBuilder.builder()
				.setEmailId("mayankyadav@gmail.com")
				.setUserId("123")
				.setUserName("Mayank")
				.build();
		
		System.out.println(user2);
	}
}
