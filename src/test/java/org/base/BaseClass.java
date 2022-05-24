package org.base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;

	public WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return driver;
	}

	public void geturl(String url) {
		driver.get(url);
	}
	public void quit() {
		driver.quit();
	}

	public void txtKeys(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void btnClick(WebElement element) {
		element.click();
	}

	public void getAttribute(WebElement element) {
		String text = element.getAttribute("Value");
		System.out.println(text);
	}

	public void dropSelect(WebElement element, String option, String data) {
		Select select = new Select(element);
		switch (option) {
		case "value":
			select.selectByValue(data);
			break;
		case "text":
			select.selectByVisibleText(data);
			break;
		case "index":
			select.selectByIndex(Integer.parseInt(data));
			break;
		default:
			System.out.println("Wrong Values Slected!");
			break;
		}
	}
}
