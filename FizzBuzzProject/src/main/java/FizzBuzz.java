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
				return 0;
		}

}
