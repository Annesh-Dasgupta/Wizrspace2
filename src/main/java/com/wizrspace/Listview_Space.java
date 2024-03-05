package com.wizrspace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Listview_Space extends Wizrspace {

	public Listview_Space(WebDriver driver) {
		super(driver);
	}
	
	//Sort heading
	
	By filename = By.xpath("(//div[@class='ListViewHeader_file_info__ulfAD'])[1]");
	By Lastmodified = By.xpath("(//div[@class='ListViewHeader_file_info__ulfAD'])[2]");
	By Size = By.xpath("(//div[@class='ListViewHeader_file_info__ulfAD'])[3]");
	By Type = By.xpath("(//div[@class='ListViewHeader_file_info__ulfAD'])[4]");
	By Owner = By.xpath("(//div[@class='ListViewHeader_file_info__ulfAD'])[5]");
	
	
	By Clearfilter = By.xpath("//div[@class='ListViewHeader_clearall_filter__b2v_H']");
	
	public void FilenameSort() throws InterruptedException {
		driver.findElement(Listview).click();
		Thread.sleep(2000);
		driver.findElement(filename).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@style='cursor: pointer;'])[2]")).click();
		Thread.sleep(2000);
		super.scrolldownpage();
		super.scrolluppage();
		
	}
	public void LastmodifiedSort() throws InterruptedException {
		driver.findElement(Lastmodified).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@style='cursor: pointer;'])[2]")).click();
		Thread.sleep(2000);
		super.scrolldownpage();
		Thread.sleep(5000);
		super.scrolluppage();
	}
	public void Sizesort() throws InterruptedException {
		driver.findElement(Size).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@style='cursor: pointer;'])[3]")).click();
		super.scrolldownpage();
		Thread.sleep(5000);
		super.scrolluppage();
		Thread.sleep(5000);
		driver.findElement(By.className("ListViewHeader_arrow_icon__o9G_T")).click();
		Thread.sleep(5000);
	}
	public void clearfilter() throws InterruptedException {
		driver.findElement(Clearfilter).click();
		Thread.sleep(5000);
	}
	public void Typesort() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(Type).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@style='cursor: pointer;'])[4]")).click();
		super.scrolldownpage();
		super.scrolluppage();
	}
	public void Fileownersort() throws InterruptedException {
		driver.findElement(Owner).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@style='cursor: pointer;'])[3]")).click();
		
	}
	public void openlistviewfile() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='FileListView_image_body__G77OI'][1]")).click();
		Thread.sleep(5000);
		driver.findElement(Backopenview).click();
	}
	

}
