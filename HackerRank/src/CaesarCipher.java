import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaesarCipher {

	public static String caesarCipher(String s, int k) {
	    String alphabets = "^[a-zA-Z]*$";
	    StringBuilder sb = new StringBuilder();
	    for(int i = 0;i < s.length();i++){
	            if (String.valueOf(s.charAt(i)).matches(alphabets)) {
	            	int base = Character.isLowerCase(s.charAt(i)) ? 'a' : 'A';
	            	char resultValue = (char)((s.charAt(i) + k - base) % 26 + base);
	            	sb.append(resultValue);
	            }else{
	                sb.append(s.charAt(i));
	            }    
	    }
	    System.out.println("finalValue" + sb);
	    return sb.toString(); 
	    }
	
	    public static void main(String[] args) throws IOException {
	        BufferedReader CaesarString = new BufferedReader(new InputStreamReader(System.in));
	        BufferedReader CaesarCipher = new BufferedReader(new InputStreamReader(System.in));
	        String cs = CaesarString.readLine();
	        String cc = CaesarCipher.readLine();
	        CaesarCipher Result = new CaesarCipher();
	        String result = Result.caesarCipher(cs, Integer.valueOf(cc));
	        CaesarString.close();
	        CaesarCipher.close();
	    }
	

}
