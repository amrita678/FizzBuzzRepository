import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

	@Test
	public void shouldReturn1WhenInputIs1() {

		FizzBuzz fizzBuzz=new FizzBuzz();
		String actual=fizzBuzz.convert(1);
		assertEquals("1", actual);
	}
	
	@Test
	public void shouldReturn2WhenInputIs2() {

		FizzBuzz fizzBuzz=new FizzBuzz();
		String actual=fizzBuzz.convert(2);
		assertEquals("2", actual);
	}
	
	@Test
	public void shouldReturnFizzWhenInputIs3() {

		FizzBuzz fizzBuzz=new FizzBuzz();
		String actual=fizzBuzz.convert(3);
		assertEquals("Fizz", actual);
	}
	@Test
	public void shouldReturnBuzzWhenInputIs5() {

		FizzBuzz fizzBuzz=new FizzBuzz();
		String actual=fizzBuzz.convert(5);
		assertEquals("Buzz", actual);
	}

	
}
