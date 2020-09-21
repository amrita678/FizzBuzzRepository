
public class FizzBuzzMainClass {

	public static void main(String[] args) {

	    FizzBuzz fizzBuzz=new FizzBuzz();
		int userInputNumber=fizzBuzz.checkNumberBetween1To50();
		
		for(int number=1;number<=userInputNumber;number++) {
				System.out.println(fizzBuzz.convert(number));
				
			}
	}

}
