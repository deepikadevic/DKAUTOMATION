package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());
driver.findElement(By.id("ap_customer_name")).sendKeys("deepikasonu");
driver.findElement(By.id("ap_phone_number")).sendKeys("12345678");



	}
}
