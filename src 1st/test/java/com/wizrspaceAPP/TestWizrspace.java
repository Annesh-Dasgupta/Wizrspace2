package com.wizrspaceAPP;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wizrspace.Listview_Space;
import com.wizrspace.Masterwizr;
import com.wizrspace.RecentPage;
import com.wizrspace.Sharedlogin;
import com.wizrspace.Wizrspace;
import com.wizrspace.Wizrspace_Home;

public class TestWizrspace {
	WebDriver driver;
	WebDriver driver1;
	Wizrspace ws;
	Wizrspace_Home wshome;


	@BeforeTest 
	public void openlogin() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.wizrapps.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));




	}
	@Test(priority = 1)
	public void login () {
		Masterwizr mw = new Masterwizr(driver);
		mw.loginmw();

	}
	@Test(priority = 2)
	public void wizr_space() throws InterruptedException{
		ws = new Wizrspace(driver);
		//		ws.newfileupload();
		ws.uploadfile2();

	}

	@Test(priority = 3)
	public void wizrspace_home() throws InterruptedException {
		wshome = new Wizrspace_Home(driver);
		wshome.cloudhome();
//		wshome.Openfile();
		wshome.videoopenfile();
//		wshome.documentfileopen();
		wshome.starredfile();
//		wshome.sharedfile();
//		wshome.sharedfile_via_generatelink();
//		wshome.renamefile();
//				wshome.tag_file();
//				wshome.enable_disableComment();
//				wshome.duplicate_file();
//		wshome.view_comment();
//		wshome.movefile();
//		wshome.properties();
//		wshome.delete1();
//		wshome.delete2();
//		wshome.downloadmain();
		wshome.addtoStarred();
//		wshome.delete(); //grid view lower modal
		
	}
	@Test(priority = 4)
	public void changelogin() throws InterruptedException {
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://accounts.wizrapps.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		Masterwizr mw1 = new Masterwizr(driver);
//		mw1.loginmw2();
//		Sharedlogin sl = new Sharedlogin(driver);
//		sl.shared_with_me();
	}
	@Test(priority = 5)
	public void recentpage() throws InterruptedException {
		RecentPage rp = new RecentPage(driver);
//		rp.scrollrecent();
	}
		
	@Test(priority = 6)
	public void duplicatefile_allOptioncheck() throws InterruptedException {
		//		wshome.Openfile();
		//		wshome.renamefile();
		//		wshome.tag_file();
		//		wshome.enable_disableComment();
	}
 @Test(priority = 7)
 public void Listviewpage() throws InterruptedException {
	 Listview_Space Lvs = new Listview_Space(driver);
	 Lvs.FilenameSort();
//	 Lvs.LastmodifiedSort();
//	 Lvs.Sizesort();
//	 Lvs.openlistviewfile();
//	 Lvs.Typesort();
//	 Lvs.Fileownersort();
//	 Lvs.clearfilter();
//	 Lvs.differntviewfileupload();
	 Lvs.listviewmultiplefilecheck_addtoStarred();
	 Lvs.listviewmultiplefilecheck_delete();
	 Lvs.listviewmultiplefilecheck_share();
 }


}
