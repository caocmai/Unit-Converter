package main;

import java.util.regex.Pattern;

// https://www.baeldung.com/java-check-string-number
public class CheckDigit {
	private Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
	
	public boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false; 
	    }
	    return pattern.matcher(strNum).matches();
	}

}
