
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class strongPassword {
	    public static int minimumNumber(int n, String password) {
	    	Pattern smallLetterPattern = Pattern.compile("[a-z]");
	        Pattern capitalLetterPattern = Pattern.compile("[A-Z]");
	        Pattern numberPattern = Pattern.compile("[0-9]");
	        Pattern specialCharacterPattern = Pattern.compile("(\\W)");
	        Matcher smallLetterMatcher = smallLetterPattern.matcher(password);
	        Matcher capitalLetterMatcher = capitalLetterPattern.matcher(password);
	        Matcher numberMatcher = numberPattern.matcher(password);
	        Matcher specialCharacterMatcher = specialCharacterPattern.matcher(password);
	        int minimumCharacter = 0;
	        int maxCharacter = 6;  
	        if(!smallLetterMatcher.find()){
	        	++minimumCharacter;
	        } if(!capitalLetterMatcher.find()){
	        	++minimumCharacter;
	        } if(!numberMatcher.find()){
	        	++minimumCharacter;
	        }if(!specialCharacterMatcher.find()){
	        	++minimumCharacter;
	        }
	        int extraCharAddedValue = minimumCharacter + n;
	        if(extraCharAddedValue < maxCharacter){
	        	return minimumCharacter = minimumCharacter + (maxCharacter - extraCharAddedValue);
	            }
	        	return minimumCharacter;   
	    }
	
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(bufferedReader.readLine().trim());
	        String password = bufferedReader.readLine();
	        strongPassword sp = new strongPassword();
	        int answer = sp.minimumNumber(n, password);
	        System.out.println(answer);
	        bufferedReader.close();
	    }
}



