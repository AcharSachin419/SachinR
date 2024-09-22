package BasePages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyskaBase {
public static WebDriver driver=new ChromeDriver();
public static Properties prop=new Properties();

public  SyskaBase() {
	try {
		FileInputStream fd= new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Test\\src\\test\\resources\\Syska.properties");
		prop.load(fd);
	} catch (IOException e) {
		e.getMessage();
	}
}

public static void intialization() {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64");

driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));

driver.get(prop.getProperty("url1"));
}

}
