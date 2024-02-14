import java.util.Scanner;

public class convertTemperature{
	
	public static void main (String[] args){
	
	double celTemp, fereinTemp;	
	
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println(" Provide  a temperature followed a space and than degree alphabet \n "
					 + " Eg.: \n" 
					 + " 78 C \n"
					 + " 45 F \n"
					 + " 65 c ");
	
	String inputTemp = keyboard.nextLine();
	
	int space = inputTemp.indexOf(" ");
	
	

	if ( ((inputTemp.substring(space + 1)).toUpperCase()).equals("C") ){
		celTemp = Integer.parseInt(inputTemp.substring(0,space));          // DONT FORGET
		fereinTemp = (9 * (celTemp / 5) + 32);
		System.out.println(" Input " +inputTemp+ " = " +fereinTemp+ " F." );
	}
	else if ( ((inputTemp.substring(space + 1)).toUpperCase()).equals("F") ){
		fereinTemp = Integer.parseInt(inputTemp.substring(0,space));
		celTemp = (5 * (fereinTemp - 32) / 9);
		System.out.println(" Input " +inputTemp+ " = " +celTemp+ " C." );
	}
	else {
		System.out.println(" Temperature must be in Celcius \" C \" or Fereinheit \" F \".");
	}
	
	}
	
}

