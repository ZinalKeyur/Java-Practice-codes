import java.util.Scanner;

public class lineType{
	
	public static void main (String[] args){
	
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println(" Provide statement and add a punctualtion if you want" );
	
	String line1 = keyboard.nextLine();
	
	int count = line1.length();     // When we use in array.length, () is not required.
	
	if (count % 2 == 0 && (line1.charAt(count-1)) == '?'){
	System.out.println(" Yes ");}
	else if (count % 2 != 0 && (line1.charAt(count-1)) == '?'){
	System.out.println(" No ");}
	else if ((line1.charAt(count-1)) == '!'){
	System.out.println(" Wow ");}
	else{
	System.out.println(" You always say \" " +line1+ " \"");}
	
	/*
	lineType.java:15: error: char cannot be dereferenced
        if (count % 2 == 0 && (line1.charAt(count-1)).equals("?")){
			
		// Note that int equality  is measured by == and string by .equals.
		// char equality is measured by == 
	*/
	}
	
}

