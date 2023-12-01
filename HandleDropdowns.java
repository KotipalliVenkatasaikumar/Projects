package com.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdowns {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html"); 
		Thread.sleep(3000);
		WebElement courseElement=driver.findElement(By.id("course"));
		Select courseNameDropDown= new Select(courseElement);
		List<WebElement> courseNameDropDownOptions =courseNameDropDown.getOptions();
		for(WebElement options: courseNameDropDownOptions) {
			System.out.println(options.getText());
			}
		courseNameDropDown.selectByIndex(1);  // java
		Thread.sleep(3000);
		courseNameDropDown.selectByValue("net");  // dot net
		Thread.sleep(3000);
		courseNameDropDown.selectByVisibleText("javascript");  // javascript
		
	    String selectedtext = courseNameDropDown.getFirstSelectedOption().getText();	
		System.out.println("selected visable text " + selectedtext);

}
}