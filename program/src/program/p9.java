package program;

public class p9 {

	public static void main(String[] args) {
		//regex tryouts
		
		System.out.println(isValidAadhar("ABEDA6781q"));
		System.out.println(isValidAadhar("123456789012"));
		System.out.println(isValidAadhar(null));
		System.out.println(isValidDL("MP0756789012910"));
		System.out.println(isValidDL("RK463284HG4728H"));
		

	}
	
		public static boolean isValidAadhar(String s) {
		
		return s!=null && s.matches("[0-9]{12}");
	}
		public static boolean isValidDL(String s) {
			
			return s!=null && s.matches("[A-Z]{2}[0-9]{13}");
		}

}
