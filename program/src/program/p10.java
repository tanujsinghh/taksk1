package program;

public class p10 {

	public static void main(String[] args) {
		// Domain Extraction program
		String 	str = "https://en.wikipedia.org/wiki/Main_Page";
		String str1 = str.replaceAll("[// / :]", "").replace("httpsen.wikipedia.orgwikiMain_Page", "en.wikipedia.org");
		System.out.println(str1);
	}

}
