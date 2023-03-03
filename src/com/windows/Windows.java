package com.windows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
	
	public static void main(String[] args) {
		
		WebDriver w = new ChromeDriver();
		w.get("https://www.google.com/");
		w.manage().window().maximize();
		System.out.println(w.getTitle());
		w.quit();
		
		
	}

}
