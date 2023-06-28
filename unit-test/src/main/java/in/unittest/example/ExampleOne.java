package in.unittest.example;

public class ExampleOne {
	
	public Integer getNamelength(String name) {
		if(name==null) {
			throw new NullPointerException("name should not be null");
		} 
		return name.length();
	}

}


