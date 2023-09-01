package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ihgJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
driver.manage().window().maximize();
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());
driver.findElement(By.id("firstName")).sendKeys("deepika");
driver.findElement(By.id("lastName")).sendKeys("sonu");
driver.findElement(By.id("email")).sendKeys("deeps@gmail.com");
driver.findElement(By.id("confirmEmail")).sendKeys("deeps@gmail.com");
driver.findElement(By.id("password")).sendKeys("abc123");
driver.findElement(By.id("confirmPassword")).sendKeys("abc123");
driver.findElement(By.id("address1")).sendKeys("#202,srs estates banjara hills hyd-");
driver.findElement(By.id("address2")).sendKeys("500034");
driver.findElement(By.id("city")).sendKeys("hyderabad");
driver.findElement(By.id("state")).sendKeys("telangana");
driver.findElement(By.id("zipCode")).sendKeys("500001");
	}

}
