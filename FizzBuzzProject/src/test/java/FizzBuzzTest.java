import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

	private FizzBuzz fizzBuzz;
	
	@BeforeEach
	public void init() {
		fizzBuzz=new FizzBuzz();
	}
	
	@Test
	public void shouldReturn1WhenInputIs1() {
		assertEquals("1", fizzBuzz.convert(1));
	}
	
	@Test
	public void shouldReturn2WhenInputIs2() {
		assertEquals("2", fizzBuzz.convert(2));
	}
	
	@Test
	public void shouldReturnFizzWhenInputIs3() {
        assertEquals("Fizz", fizzBuzz.convert(3));
	}
	
	@Test
	public void shouldReturnBuzzWhenInputIs5() {
		assertEquals("Buzz", fizzBuzz.convert(5));
	}

	@Test
	public void shouldReturnFizzBuzzWhenInputIs15() {
		assertEquals("FizzBuzz", fizzBuzz.convert(15));
	}

	@Test
	public void numberBetween1To50() {
		int userInputNumber=fizzBuzz.checkNumberBetween1To50();
        int low=0;
        int high=51;
        assertTrue("Error, Number is too high", high > userInputNumber);
        assertTrue("Error, random is too low",  low  < userInputNumber);
	}	
}

