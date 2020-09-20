import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

	@Test
	public void shouldReturn1WhenInputIs1() {

		FizzBuzz fizzBuzz=new FizzBuzz();
		String actual=fizzBuzz.convert(1);
		assertEquals("1", actual);
	}
	
}
