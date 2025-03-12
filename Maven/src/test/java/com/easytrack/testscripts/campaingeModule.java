package com.easytrack.testscripts;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class campaingeModule {

	
	@Test
	public void Createmodule() {
		Reporter.log("created module ", true );
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.co.in/");
		String title = driver.getTitle();
		Reporter.log(title , true);
	}
}
