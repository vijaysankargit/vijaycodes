import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.sun.net.httpserver.Authenticator.Result;

public class SOSMarsExplanation {
	
	public static int marsExploration(String s) {
        List<String> sosMsg = new ArrayList<>();
        int size = 3;
        int wrongMsg = 0;
        for(int start=0;start<s.length();start+=size){
            sosMsg.add(s.substring(start,Math.min(s.length(), start+size)));
        }
        for(int i = 0;i < sosMsg.size(); i++){
        	if(sosMsg.get(i).equals("SOS")){
        		continue;
        	}else{
        		String checkString = sosMsg.get(i);
                if(checkString.charAt(0) != 'S'){
                   ++wrongMsg; 
                }
                if(checkString.charAt(1) != 'O'){
                    ++wrongMsg;  
                } 
                if(checkString.charAt(2) != 'S'){
                    ++wrongMsg;
                }  
        }
    }
        	System.out.println("wrongmsg count" + wrongMsg);
        	return wrongMsg;
    }

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        SOSMarsExplanation sos = new SOSMarsExplanation();
        int result = sos.marsExploration(s);
        bufferedReader.close();
	}
}
