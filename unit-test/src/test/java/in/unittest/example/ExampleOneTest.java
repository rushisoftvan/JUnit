package in.unittest.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ExampleOneTest {

	@Test
	//@Disabled
	public void testGetNamelengthOne() {
		
		String name ="sachin";
		Integer excpected=6;
		ExampleOne exampleOne = new ExampleOne();
		 assertThat(exampleOne.getNamelength(name)).isEqualTo(excpected); 
	}
	
	@Test
	//void execute() to 
	public void testGetNamelengthTwo() {
		
		
		String name ="rushikesh";
		ExampleOne exampleOne = new ExampleOne();
		NullPointerException assertThrows = assertThrows(NullPointerException.class, ()-> exampleOne.getNamelength(null));
		
		assertThat(assertThrows.getMessage()).isEqualTo("name should not be null"); 
		 
	}
	
	

}


