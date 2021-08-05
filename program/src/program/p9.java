package program;

public class p9 {

	public static void main(String[] args) {
		//regex tryouts
		
		System.out.println(isValidAadhar("ABEDA6781q"));
		System.out.println(isValidAadhar("123456789012"));
		System.out.println(isValidAadhar(null));

	}
	
		public static boolean isValidAadhar(String s) {
		
		return s!=null && s.matches("[0-9]{12}");
	}

}
