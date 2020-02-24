package s61;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Face {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\S61\\driver\\chromedriver.exe");
	WebDriver a = new ChromeDriver();
	a.get("https://www.facebook.com/");
	
}
}
