import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaesarCipher {

	public static String caesarCipher(String s, int k) {
	    char[] alphabets = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	    StringBuilder sb = new StringBuilder();
	    for(int i = 0;i < s.length();i++){
	        for(int j = 0;j < alphabets.length;j++){
	            if (new String(alphabets).indexOf(s.charAt(i)) == -1) {
	                sb.append(s.charAt(i));
	                break;
	            }else{
	                int appendValue = new String(alphabets).indexOf(s.charAt(i));
	                sb.append(alphabets[appendValue + k]);
	                break;
	            }
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
