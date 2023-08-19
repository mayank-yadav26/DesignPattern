package singleton;

public class Samosa {

	private static Samosa samosaObj;

	private Samosa() {

	}

	/**
	 * This is a lazy way to creating singleton object.
	 * For eager way we need to create object while declaring it.
	 * Here the problem is we need to synchronized only a particular line of code
	 * but we are doing synchronization on method level.
	 * 
	 * @return
	 */
//	synchronized public static Samosa getSamosa() {
//
//		if (samosaObj == null) {
//			samosaObj = new Samosa();
//		}
//		return samosaObj;
//	}
	
	public static Samosa getSamosa() {

		if (samosaObj == null) {
			synchronized(Samosa.class){
				if(samosaObj==null) {
					samosaObj = new Samosa();					
				}
			}
		}
		return samosaObj;
	}
}
