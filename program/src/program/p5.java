package program;

public class p5 {

	public static void main(String[] args) {
		//Task - Convert every word's last letter to upper case
		
				String str = "consider this as a random word";
		        System.out.println(str);
		        System.out.println(Last(str));

			}
			
			 static String Last(String str)
			    {
			 
			        char[] ch = str.toCharArray();
			        for (int i = 0; i < ch.length; i++) {
			 
			            
			            while (i < ch.length && ch[i] != ' ')
			                i++;
			 
			            
			            
			            ch[i - 1] = (char)(ch[i - 1] >= 'a' && ch[i - 1] <= 'z'
			                                   ? ((int)ch[i - 1] - 32)
			                                   : (int)ch[i - 1]);
			        }
			 
			        return new String(ch);
			    }

}
