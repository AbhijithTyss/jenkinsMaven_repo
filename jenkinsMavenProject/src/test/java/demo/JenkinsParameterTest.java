package demo;

import org.testng.annotations.Test;

public class JenkinsParameterTest {
	@Test
	public void recieveData() {
		String browserValue = System.getProperty("browser");
		System.out.println(browserValue);
	}
}
