import java.util.Scanner;

public class FizzBuzz {

	public String convert(int i) {

		String output="";
		if(i%3==0)
			output+= "Fizz";
		if(i%5==0)
			output+= "Buzz";
		if(output=="")
			output= String.valueOf(i);
		return output;			
		
	}
	
	public int checkNumberBetween1To50() {
		int userInputNumber=0;
		Scanner input = new Scanner(System.in);
		do {
		    System.out.print("enter a number between 1 to 50 : ");
		    userInputNumber=input.nextInt();	
		   }while(userInputNumber<1 || userInputNumber>50);

		return userInputNumber;
		}

}
