package in.unittest.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class ExampleTwoTest {

	@Test
	public void testCountLengthOfListOfNameOne() {

		List<String> names = Arrays.asList("rushikesh", "karan", "mohan", "deepak");
		ExampleTwo exampleTwo = new ExampleTwo();
		List<Integer> excpected = Arrays.asList(9, 5, 5, 6);
		assertThat(exampleTwo.countLengthOfListOfName(names)).isEqualTo(excpected);
	}
	
	@Test
	public void testCountLengthOfListOfNameTwo() {

		List<String> names = Arrays.asList("rushikesh");
		ExampleTwo exampleTwo = new ExampleTwo();
		List<Integer> excpected = Arrays.asList(9);
		assertThat(exampleTwo.countLengthOfListOfName(names)).isEqualTo(excpected);
	}
	
	
	@Test
	public void testCountLengthOfListOfNameThree() {
		ExampleTwo exampleTwo = new ExampleTwo();
	    IllegalArgumentException assertThrows = assertThrows(IllegalArgumentException.class,()-> exampleTwo.countLengthOfListOfName(null));
	    assertThat(assertThrows.getMessage()).isEqualTo("names method parameter should not be null");
	
	}

}
