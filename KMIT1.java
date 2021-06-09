import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class KMIT1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\Selenium Jar\\chromedriver.exe");
		WebDriver w =new ChromeDriver();
		w.get("https://kmit.in/");
		
		//.......*****Home-->image....//
		//NAACw.findElement(By.xpath("//*[@id=\"news1\"]/div/div[1]/div")).click();
		w.findElement(By.xpath("//*[@id=\"naac\"]/div/p/a")).click();
		w.navigate().back();
		w.findElement(By.xpath("//*[@id=\"naac\"]/div/button")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();
		w.navigate().back();
		
		
		//NBA
		w.findElement(By.xpath("//*[@id=\"news1\"]/div/div[2]/div/a/div[1]")).click();
		w.navigate().back();
		
		//NIRF
		w.findElement(By.xpath("//*[@id=\"news1\"]/div/div[3]/div/a/div[1]")).click();
		w.findElement(By.xpath("//*[@id=\"about-hod\"]/div/div/div[1]/div/a/div/img")).click();
		System.out.println(w.getTitle());
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();
		
		w.findElement(By.xpath("//*[@id=\"about-hod\"]/div/div/div[2]/div/a/div/img")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();
		
		w.findElement(By.xpath("//*[@id=\"about-hod\"]/div/div/div[3]/div/a/div/img")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();
		
		w.findElement(By.xpath("//*[@id=\"about-hod\"]/div/div/div[4]/div/a/div/img")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();
		w.navigate().back();
		
		//IQAC
		w.findElement(By.xpath("//*[@id=\"news1\"]/div/div[4]/div/div/a/div[1]")).click();
		Thread.sleep(2000);
		w.navigate().back();
		//........*****About us*****....//
         w.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")).click();
         w.findElement(By.linkText("About Us")).click();
         JavascriptExecutor js = (JavascriptExecutor) w;
         js.executeScript("window.scrollTo,(0,2000)");
         w.findElement(By.linkText("Vision and Mission")).click(); //Vision & mission Tab
         w.findElement(By.linkText("Quality Policy")).click();//Quality policy tab
         w.findElement(By.linkText("Core Values")).click();//
         Thread.sleep(2000);
         w.findElement(By.xpath("//*[@id=\"corevalues\"]/button/div/a/span")).click(); // view core_values pdf
         Thread.sleep(2000);
         //w.switchTo().frame(w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/iframe[1]")));
        //Thread.sleep(2000);
         //w.findElement(By.xpath("//*[@id=\"sidebarToggle\"]")).click();
        //js.executeScript("window.scrollTo, (0,2000)");
        //w.findElement(By.xpath("//*[@id=\"sidebarToggle\"]")).click();

        w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();//close pdf core values

//.............Aboout us-->Accerditiontab......//
        w.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[5]/a")).click(); //Accerdition Tab

        w.findElement(By.xpath("//*[@id=\"accreditions\"]/div[1]/a")).click(); //Autonomus status
        Thread.sleep(2000);
        w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

        w.findElement(By.xpath("//*[@id=\"accreditions\"]/div[2]/a")).click(); // NAAC Accerdition
        Thread.sleep(2000);
        w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

        w.findElement(By.xpath("//*[@id=\"accreditions\"]/div[3]/a")).click();// NBA Accerdition
        Thread.sleep(2000);
        w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

        w.findElement(By.xpath("//*[@id=\"accreditions\"]/div[4]/a")).click();//JNTUH Affiliation
        Thread.sleep(2000);
        w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

        w.findElement(By.xpath("//*[@id=\"accreditions\"]/div[5]/a")).click();//AICTE
        Thread.sleep(2000);
        w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

        w.findElement(By.xpath("//*[@id=\"accreditions\"]/div[6]/a")).click();//AISHE
        Thread.sleep(2000);
        w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

//.............Aboout us-->Achievements.....//
        w.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[6]/a")).click();
        
      //..............*****Covid-19 MEasures*****........//
 		//WebElement we = w.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a"));
 		Actions A = new Actions(w);
 		A.moveToElement(w.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a"))).perform();
 		
 		
 //.........Covid19-->General Instruction.......//
 		w.findElement(By.linkText("GENERAL INSTRUCTIONS")).click();
 		//js.executeScript("window.scrollTo,(0,2000)");
 		w.findElement(By.xpath("//*[@id=\"covidgi\"]/div/div/div/p[3]/em/a")).click(); // opening a new window
 		//js.executeScript("window.scrollTo,(0,3000)");
 		w.findElement(By.xpath("//*[@id=\"covidgi\"]/div/div/div/p[5]/em/a")).click();// opening new pdf

 		Set <String> windows= w.getWindowHandles();
 		Iterator <String> it=windows.iterator();
 		String Parent_window=it.next();
 		String Child_window=it.next();
 		String Child_window1=it.next();
 		String Child_window2=it.next();
 		
 		w.switchTo().window(Child_window1).close();
 		Thread.sleep(2000);
 		w.switchTo().window(Child_window2).close();
 		Thread.sleep(2000);
 		w.switchTo().window(Child_window);
 		Thread.sleep(2000);
 		
 //......covid19-->Notifications............//
 		
 		Actions A1 = new Actions(w);
 		A1.moveToElement(w.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a"))).perform();
 		w.findElement(By.linkText("NOTIFICATIONS")).click();
 		w.findElement(By.partialLinkText("Government Order - M")).click();
 		Thread.sleep(2000);
 		w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

 		w.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div[1]/a")).click();
 		Thread.sleep(2000);
 		w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

 		w.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div[2]/a")).click();
 		Thread.sleep(2000);
 		w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

 		/*w.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div[3]/a")).click();
 		Thread.sleep(3000);
 		w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

 		w.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div[4]/a")).click();
 		Thread.sleep(3000);
 		w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

 		w.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div[5]/a")).click();
 		Thread.sleep(3000);
 		w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

 		w.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div[6]/a")).click();
 		Thread.sleep(3000);
 		w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

 		w.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div[7]/a")).click();
 		Thread.sleep(3000);
 		w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

 		w.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div[8]/a")).click();
 		Thread.sleep(3000);
 		w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

 		w.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div[9]/a")).click();
 		Thread.sleep(3500);
 		w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

 		w.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div[10]/a")).click();
 		Thread.sleep(3500);
 		w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

 		w.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div[11]/a")).click();
 		Thread.sleep(3500);
 		w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

 		w.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div[12]/a")).click();
 		Thread.sleep(3500);
 		w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

 		w.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div[13]/a")).click();
 		Thread.sleep(3500);
 		w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

 		w.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div[14]/a")).click();
 		Thread.sleep(3500);
 		w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

 		w.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div[15]/a")).click();
 		Thread.sleep(3500);
 		w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

 		w.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div[16]/a")).click();
 		Thread.sleep(3500);
 		w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

 		w.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div[17]/a")).click();
 		Thread.sleep(3500);
 		w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

 		w.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div[18]/a")).click();
 		Thread.sleep(3500);
 		w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();
        //UGC Guideline
 		w.findElement(By.xpath("//*[@id=\"headingTwo\"]/h2/a")).click();
 		w.findElement(By.xpath("//*[@id=\"collapseTwo\"]/div/div[1]/a")).click();
 		Thread.sleep(3000);
 		w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

 		w.findElement(By.xpath("//*[@id=\"collapseTwo\"]/div/div[2]/a")).click();
 		Thread.sleep(3000);
 		w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

 		w.findElement(By.xpath("//*[@id=\"collapseTwo\"]/div/div[3]/a")).click();
 		Thread.sleep(2000);
 		w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();*/


 //......Covid19--> Instititional plans......//	      
 	     Actions A2 = new Actions(w);
          A2.moveToElement(w.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a"))).perform();
          w.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/ul/li[3]/a")).click();


          w.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div[1]/a")).click();
          Thread.sleep(2000);
          w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

          w.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div[2]")).click();
          Thread.sleep(2000);
          w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();
   
 //Department meeting Schedule
          w.findElement(By.xpath("//*[@id=\"headingTwo\"]/h2/a")).click();
          w.findElement(By.xpath("//*[@id=\"collapseTwo\"]/div/div[1]/a")).click();
          Thread.sleep(2000);
          w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

          w.findElement(By.xpath("//*[@id=\"collapseTwo\"]/div/div[2]/a")).click();
          Thread.sleep(2000);
          w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

          w.findElement(By.xpath("//*[@id=\"collapseTwo\"]/div/div[3]/a")).click();
          Thread.sleep(2000);
          w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

         /* w.findElement(By.xpath("//*[@id=\"collapseTwo\"]/div/div[4]/a")).click();
          Thread.sleep(2000);
          w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

          w.findElement(By.xpath("//*[@id=\"collapseTwo\"]/div/div[5]/a")).click();
          Thread.sleep(2000);
          w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();*/
 //Seating plans
         w.findElement(By.xpath("//*[@id=\"headingThree\"]/h2/a")).click();
          w.findElement(By.xpath("//*[@id=\"collapseThree\"]/div/div[1]/a")).click();
          Thread.sleep(2000);
          w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

          w.findElement(By.xpath("//*[@id=\"collapseThree\"]/div/div[2]/a")).click();
          Thread.sleep(2000);
          w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

          w.findElement(By.xpath("//*[@id=\"collapseThree\"]/div/div[3]/a")).click();
          Thread.sleep(2000);
          w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

          w.findElement(By.xpath("//*[@id=\"collapseThree\"]/div/div[4]/a")).click();
          Thread.sleep(2000);
          w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

          w.findElement(By.xpath("//*[@id=\"collapseThree\"]/div/div[5]/a")).click();
          Thread.sleep(2000);
          w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

 //Time Table -CSE
          //w.findElement(By.xpath("//*[@id=\"headingThree\"]/h2/a")).click();
          //w.findElement(By.xpath("//*[@id=\"collapseThree\"]/div/div[1]/a")).click();
          //Thread.sleep(2000);
          //w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

          //	w.findElement(By.xpath("//*[@id=\"collapseThree\"]/div/div[2]/a")).click();
          //Thread.sleep(2000);
          //w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

          //w.findElement(By.xpath("//*[@id=\"collapseThree\"]/div/div[3]/a")).click();
          //Thread.sleep(2000);	          //w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

          //w.findElement(By.xpath("//*[@id=\"collapseThree\"]/div/div[4]/a")).click();
          //Thread.sleep(2000);
          //w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

          //w.findElement(By.xpath("//*[@id=\"collapseThree\"]/div/div[5]/a")).click();
          //Thread.sleep(2000);
          //	w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

          //w.findElement(By.xpath("//*[@id=\"collapseThree\"]/div/div[6]/a")).click();
          //Thread.sleep(2000);
          //w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

         //w.findElement(By.xpath("//*[@id=\"collapseThree\"]/div/div[7]/a")).click();
          //	Thread.sleep(2000);
          //w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

          //	w.findElement(By.xpath("//*[@id=\"collapseThree\"]/div/div[8]/a")).click();
          //Thread.sleep(2000);
         //	w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

 //Time Tables-IT
        w.findElement(By.xpath("//*[@id=\"headingFour\"]/h2/a")).click();
         w.findElement(By.xpath("//*[@id=\"collapseFour\"]/div/div[1]/a")).click();
         Thread.sleep(2000);
         w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

         w.findElement(By.xpath("//*[@id=\"collapseFour\"]/div/div[2]/a")).click();
         Thread.sleep(2000);
         w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

         w.findElement(By.xpath("//*[@id=\"collapseFour\"]/div/div[3]/a")).click();
         Thread.sleep(2000);
         w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

         w.findElement(By.xpath("//*[@id=\"collapseFour\"]/div/div[4]/a")).click();
         Thread.sleep(2000);
         w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

         w.findElement(By.xpath("//*[@id=\"collapseFour\"]/div/div[5]/a")).click();
         Thread.sleep(2000);
         w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

         w.findElement(By.xpath("//*[@id=\"collapseFour\"]/div/div[6]/a")).click();
         Thread.sleep(2000);
         w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

         w.findElement(By.xpath("//*[@id=\"collapseFour\"]/div/div[7]/a")).click();
         Thread.sleep(2000);
         w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

 //Time Table -ECE
         w.findElement(By.xpath("//*[@id=\"headingFive\"]/h2/a")).click();
         w.findElement(By.xpath("//*[@id=\"collapseFive\"]/div/div[1]/a")).click();
         Thread.sleep(2000);
         w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

         w.findElement(By.xpath("//*[@id=\"collapseFive\"]/div/div[2]/a")).click();
         Thread.sleep(2000);
         w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

         w.findElement(By.xpath("//*[@id=\"collapseFive\"]/div/div[3]/a")).click();
         Thread.sleep(2000);
         w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

         w.findElement(By.xpath("//*[@id=\"collapseFive\"]/div/div[4]/a")).click();
         Thread.sleep(2000);
         w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

 //Time Table-EIE
         w.findElement(By.xpath("//*[@id=\"headingSix\"]/h2/a")).click();
         w.findElement(By.xpath("//*[@id=\"collapseSix\"]/div/div[1]/a")).click();
         Thread.sleep(2000);
         w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

         w.findElement(By.xpath("//*[@id=\"collapseSix\"]/div/div[2]/a")).click();
         Thread.sleep(2000);
         w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

         w.findElement(By.xpath("//*[@id=\"collapseSix\"]/div/div[3]/a")).click();
         Thread.sleep(2000);
         w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

         w.findElement(By.xpath("//*[@id=\"collapseSix\"]/div/div[4]/a")).click();
         Thread.sleep(2000);
         w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

         w.findElement(By.xpath("//*[@id=\"collapseSix\"]/div/div[5]/a")).click();
         Thread.sleep(2000);
         w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

         w.findElement(By.xpath("//*[@id=\"collapseSix\"]/div/div[6]/a")).click();
         Thread.sleep(2000);
         w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

 //Time Table H&S
         w.findElement(By.xpath("//*[@id=\"headingSeven\"]/h2/a")).click();
         w.findElement(By.xpath("//*[@id=\"collapseSeven\"]/div/div[1]/a")).click();
         Thread.sleep(2000);
         w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

         w.findElement(By.xpath("//*[@id=\"collapseSeven\"]/div/div[2]/a")).click();
         Thread.sleep(2000);
         w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

 //Time TAble Sonet
         w.findElement(By.xpath("//*[@id=\"headingEight\"]/h2/a")).click();
         w.findElement(By.xpath("//*[@id=\"collapseEight\"]/div/div/a")).click();
         Thread.sleep(2000);
         w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();
         
 //......Covid19-->Infrastructure Facility......//       		
     		Actions A3 = new Actions(w);
       		A3.moveToElement(w.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a"))).perform();
     		
       		w.findElement(By.linkText("INFRASTRUCTURAL FACILITIES")).click();
             //Sanitization Points
       		w.findElement(By.xpath("//*[@id=\"headingThree\"]/h2/a")).click();
       		
             //Isolation Rooms
       		w.findElement(By.xpath("//*[@id=\"headingFour\"]/h2/a")).click();
       		JavascriptExecutor js1 = (JavascriptExecutor) w;
       		js1.executeScript("window.scrollTo,(0,-50000)");
       		Thread.sleep(2000);
             //Clinic...........error for finding element
       		//w.findElement(By.xpath("//*[@id=\"headingFive\"]/h2/a")).click();
             //Gallery...........error for finding element
       		//w.findElement(By.xpath("//*[@id=\"headingSix\"]/h2/a")).click();
       		// pending Gallery photo to inspect
       		
 //......Covid19-->Examination Guidelines......//   	
       		Actions A4 = new Actions(w);
       		A4.moveToElement(w.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a"))).perform();
       		w.findElement(By.linkText("EXAMINATION GUIDELINES")).click();
       		w.findElement(By.xpath("//*[@id=\"collapseThree\"]/div/div[1]/a")).click();
       		Thread.sleep(2000);
       		w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();
       		
       		w.findElement(By.xpath("//*[@id=\"collapseThree\"]/div/div[2]/a")).click();
       		Thread.sleep(2000);
       		w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();
       		
       		w.findElement(By.xpath("//*[@id=\"collapseThree\"]/div/div[3]/a")).click();
       		Thread.sleep(2000);
       		w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();
       		
       		w.findElement(By.xpath("//*[@id=\"headingFour\"]/h2/a")).click();
       		w.findElement(By.xpath("//*[@id=\"collapseFour\"]/div/div/a")).click();
       		Thread.sleep(2000);
       		w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();
       		
       		w.findElement(By.xpath("//*[@id=\"headingFive\"]/h2/a")).click();
       		w.findElement(By.xpath("//*[@id=\"collapseFive\"]/div/div[1]/a")).click();
       		Thread.sleep(2000);
       		w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();
       		
       		w.findElement(By.xpath("//*[@id=\"collapseFive\"]/div/div[2]/a")).click();
       		Thread.sleep(2000);
       		w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();
       		
       		w.findElement(By.xpath("//*[@id=\"collapseFive\"]/div/div[3]/a")).click();
       		Thread.sleep(2000);
       		w.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button")).click();

  //......Covid19-->Mental Health Counseling ......//   
       		Actions A5 = new Actions(w);
       		A5.moveToElement(w.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a"))).perform();
       		w.findElement(By.linkText("MENTAL HEALTH COUNSELING")).click();
       		w.findElement(By.xpath("//*[@id=\"headingFive\"]/h2/a")).click();
       		
       		w.findElement(By.xpath("//*[@id=\"headingSix\"]/h2/a")).click();
       		w.findElement(By.xpath("//*[@id=\"collapseSix\"]/div/ul/li/p/em/a")).click();
       		w.findElement(By.xpath("//*[@id=\"collapseSix\"]/div/ul/em/li/p/em/a")).click();
       		w.findElement(By.xpath("//*[@id=\"collapseSix\"]/div/ul/em/em/li/p/em/a")).click();
       		w.findElement(By.xpath("//*[@id=\"collapseSix\"]/div/ul/em/em/em/li/p/em/a")).click();
       		
       		
       		Set <String> windows2= w.getWindowHandles();
     		Iterator <String> it2=windows2.iterator();
     		String Parent_window1=it2.next();
     		String Child_window3=it2.next();
     		String Child_window4=it2.next();
     		String Child_window5=it2.next();
     		String Child_window6=it2.next();
     		String Child_window7=it2.next();
     		// 
     		
            
     		w.switchTo().window(Child_window7).close();
     		Thread.sleep(2000);
     		w.switchTo().window(Child_window6).close();
     		Thread.sleep(2000);
     		w.switchTo().window(Child_window5).close();
     		Thread.sleep(2000);
     		w.switchTo().window(Child_window4).close();
     		Thread.sleep(2000);
     		w.switchTo().window(Child_window3);
     		Thread.sleep(2000);
     			
     		
 //......Covid19-->Declaration Form......//   	
     		Actions A6 = new Actions(w);
       		A6.moveToElement(w.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a"))).perform();
       		w.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/ul/li[7]/a")).click();
       		w.findElement(By.xpath("//*[@id=\"notification\"]/div/div/a")).click();
       	//..............*****Admissions Tab******........//
     		Actions A7 = new Actions(w);
     		A7.moveToElement(w.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a"))).perform();
     		
     //......Admission-->Courses Offered......//
     		Thread.sleep(2000);
     		w.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/ul/li[1]/a")).click();
     		
     //......Admission-->Admission Procedure.......//
     		Actions A8 = new Actions(w);
     		A8.moveToElement(w.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a"))).perform();
     		Thread.sleep(2000);
     		w.findElement(By.cssSelector("div.kmitbar:nth-child(3) nav.navbar.navbar-expand-lg.navbar-light.bg-light:nth-child(3) div.container div.row div.collapse.navbar-collapse ul.navbar-nav.mr-auto li.dropdown:nth-child(5) ul.dropdown-menu li:nth-child(2) > a:nth-child(1)")).click();
     		
     //......Admission-->EAMCET Last Rank......//
     		Actions A9 = new Actions(w);
     		A9.moveToElement(w.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a"))).perform();
     		Thread.sleep(2000);
     		w.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/ul/li[3]/a")).click();
     		
     //......Admission-->ECET Last Rank.........//
     		Actions A10 = new Actions(w);
     		A10.moveToElement(w.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a"))).perform();
     		Thread.sleep(2000);
     		w.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/ul/li[4]/a")).click();
     		Thread.sleep(5000);
     		
     		Actions Administration=new Actions(w);
    		Thread.sleep(2000);
    		Administration.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]"))).perform();
            w.findElement(By.xpath(" /html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]")).click();
            JavascriptExecutor Js2=(JavascriptExecutor)w;
        	Js2.executeScript("window.scrollTo(0,500)");
        	Thread.sleep(2000);
        	JavascriptExecutor Js3=(JavascriptExecutor)w;
        	Js3.executeScript("window.scrollTo(0,-500)");
        	
            Administration.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]"))).perform();
    		w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[2]/a[1]")).click();
    		Thread.sleep(2000);
    		w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")).click();
    		w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")).click();
    		
    		Administration.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]"))).perform();
    		w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[3]/a[1]")).click();
    		 JavascriptExecutor Js4=(JavascriptExecutor)w;
    	    	Js4.executeScript("window.scrollTo(0,600)");
    	    	Thread.sleep(2000);
    	    	Js4.executeScript("window.scrollTo(600,0)");
    	    	
    		Administration.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]"))).perform();
    		 w.findElement(By.xpath("//a[contains(text(),'Heads of the Department')]")).click();                                                                //Head of the department
    	      w.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/img[1]")).click();              //S Padmaja
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();                          //to close the Padmaja page
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]/img[1]")).click();              //sjs Antony
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")).click(); 
    	      w.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/a[1]/div[1]/img[1]")).click();
    		Thread.sleep(2000);
    	    w.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
    		w.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[4]/div[1]/a[1]/div[1]/img[1]")).click();
    	    Thread.sleep(2000);
    		w.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    		
    		Administration.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]"))).perform();
    	w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[5]/a[1]")).click();
    	 JavascriptExecutor Js5=(JavascriptExecutor)w;
     	Js5.executeScript("window.scrollTo(0,900)");
     	Thread.sleep(2000);
     	Js5.executeScript("window.scrollTo(900,0)");
     	
    		Administration.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]"))).perform();
    		w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[6]/a[1]")).click();
    		Thread.sleep(2000);
    		w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")).click();
    		w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")).click();
    		
    		Administration.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]"))).perform();
    	w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[7]/a[1]")).click();
    	 JavascriptExecutor Js6=(JavascriptExecutor)w;
    	Js6.executeScript("window.scrollTo(0,400)");
    	Thread.sleep(2000);
    	Js6.executeScript("window.scrollTo(400,0)");
    	
    		Administration.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]"))).perform();
    	   w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[8]/a[1]")).click();
    		 JavascriptExecutor Js7=(JavascriptExecutor)w;
    		 	Js7.executeScript("window.scrollTo(0,700)");
    		 	Thread.sleep(2000);
    		 	Js7.executeScript("window.scrollTo(700,0)");
    		 	
    		Administration.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]"))).perform();
    		w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[9]/a[1]")).click();
    		 JavascriptExecutor Js8=(JavascriptExecutor)w;
    		 	Js8.executeScript("window.scrollTo(0,300)");
    		 	Thread.sleep(2000);
    		 	Js8.executeScript("window.scrollTo(400,0)");
    		 	
    		Administration.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]"))).perform();
          w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[10]/a[1]")).click();
     	 JavascriptExecutor Js9=(JavascriptExecutor)w;
      	Js9.executeScript("window.scrollTo(0,800)");
      	Thread.sleep(2000);
      	Js9.executeScript("window.scrollTo(800,0)");
          System.out.println("HRPOLICY");
          
          Actions IQAC=new Actions(w);
          IQAC.moveToElement(w.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[14]/a"))).perform();
    		w.findElement(By.linkText("IQAC")).click();
    		System.out.println("xx");
             Thread.sleep(2000);
    		 w.findElement(By.linkText("Committees")).click();
    		 System.out.println("ghh");
    		 Thread.sleep(2000);
    		 w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    		 System.out.println("ggh");
    		 w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")).click();
    		 Thread.sleep(2000);
    		 w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    		System.out.println("hfh");
    		w.findElement(By.linkText("Quality Initiatives")).click();
    		Thread.sleep(2000);
    		w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[1]")).click();
    	    //  Thread.sleep(1000);
    	      System.out.println("hghgg");
    	      Thread.sleep(1000);
    	  	w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[14]/a[1]")).click();
    	      Thread.sleep(1000);
    	      w.findElement(By.xpath("//body/div[1]/section[1]/div[2]/div[1]/ul[1]/li[5]/a[1]")).click();
    	      Thread.sleep(1000);
    	      w.findElement(By.xpath("//a[contains(text(),'View NAAC Certificate')]")).click();
    	      Thread.sleep(3000);
    	      w.findElement(By.xpath("//body/div[1]/section[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    	      w.findElement(By.xpath("//a[contains(text(),'http://www.naac.gov.in/')]")).click();
    	      w.navigate().back();
    	    Thread.sleep(1000);
    	      System.out.println("hhg");
    	      w.navigate().back();
    	      
    	      Actions NIRF=new Actions(w);
    			w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[15]/a[1]")).click();
    		      Thread.sleep(1000);
    		      w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/img[1]")).click();
    		      Thread.sleep(2000);
    		      w.findElement(By.xpath("//body/div[@id='exampleModal']/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    		      w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]/img[1]")).click();
    		      Thread.sleep(2000);
    		      w.findElement(By.xpath("//body/div[@id='exampleModal']/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    		      w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/a[1]/div[1]/img[1]")).click();
    		      Thread.sleep(2000);
    		      w.findElement(By.xpath("//body/div[@id='exampleModal']/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    		      w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[4]/div[1]/a[1]/div[1]/img[1]")).click();
    		      Thread.sleep(2000);
    		      w.findElement(By.xpath("//body/div[@id='exampleModal']/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    	System.out.println(w.getTitle());
    	JavascriptExecutor Js10=(JavascriptExecutor)w;
    	Js10.executeScript("window.scrollTo(0,500)");
    	Thread.sleep(2000);
    	JavascriptExecutor Js11=(JavascriptExecutor)w;
    	Js11.executeScript("window.scrollTo(0,-500)");
    	
    	Actions ACADEMICS=new Actions(w);
    	ACADEMICS.moveToElement(w.findElement(By.xpath(" /html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[6]/a[1]"))).perform();
    	w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[6]/ul[1]/li[1]/a[1]")).click();
    	ACADEMICS.moveToElement(w.findElement(By.xpath(" /html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[6]/a[1]"))).perform();
    	w.findElement(By.xpath(" /html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[6]/ul[1]/li[2]/a[1]")).click();
    	ACADEMICS.moveToElement(w.findElement(By.xpath(" /html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[6]/a[1]"))).perform();
    	w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[6]/ul[1]/li[3]/a[1]")).click();
    	System.out.println("jhgh");
    	w.findElement(By.xpath("//a[contains(text(),'View CSE Syllabus')]")).click();
    	w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
    	Thread.sleep(1000);
    	w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    	w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/a[1]")).click();
    	Thread.sleep(1000);
    	w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    	w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/a[1]")).click();
    	Thread.sleep(1000);
    	w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    	w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/a[1]")).click();
    	Thread.sleep(2000);
    	w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    	w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/a[1]")).click();
    	Thread.sleep(2000);
    	w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    	System.out.println("vgh");
    	w.navigate().back();
    	  Thread.sleep(2000);
    	w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/p[1]/button[1]/a[1]")).click();
    	w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]")).click();
    	w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
    	Thread.sleep(1000);
    	w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    	Thread .sleep(3000);
    	w.navigate().back();
    	 Thread.sleep(1000);
    		//w.findElement(By.xpath("//a[contains(text(),'View CSD Syllabus')]")).click();                                  //csd
    	//	w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]")).click();
    			//w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
    			//Thread.sleep(1000);
    		//	w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    		//	w.navigate().back();

    		
    		w.findElement(By.xpath("//a[contains(text(),'View IT Syllabus')]")).click();                                     //it
    		w.findElement(By.xpath("//a[contains(text(),'R16 SYLLABUS (Admitted Batch 2016-17 & 2017-18)')]")).click();
    		System.out.println("ff");
    		w.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/a[1]")).click();
    		Thread.sleep(3000);
    		System.out.println("hh");
    		w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    		System.out.println("poth");
    		w.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/a[1]")).click();
    		Thread.sleep(3000);
    		w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    		w.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/a[1]")).click();
    		Thread.sleep(3000);
    		w.findElement(By.xpath(" /html[1]/body[1]/div[1]/section[1]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    		w.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/a[1]")).click();
    		Thread.sleep(3000);
    	w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    	w.findElement(By.xpath("//a[contains(text(),'IV YEAR')]")).click();
    	Thread.sleep(3000);
    	w.findElement(By.xpath(" /html[1]/body[1]/div[1]/section[1]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    		w.navigate().back();
    		
    		  Thread.sleep(2000);
    		w.findElement(By.xpath("//a[contains(text(),'View ECE Syllabus')]")).click();                                           //ece
    		w.findElement(By.xpath("//a[contains(text(),'R16 SYLLABUS (Admitted Batch 2016-17 & 2017-18)')]")).click();
    		w.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/a[1]")).click();
    		Thread.sleep(2000);
    		w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();	
    		Thread.sleep(2000);
    		w.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/a[1]")).click();
    		Thread.sleep(2000);
    		w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    		w.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/a[1]")).click();
    		Thread.sleep(2000);
    		w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    		w.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/a[1]")).click();
    		Thread.sleep(2000);
    		w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    		w.findElement(By.xpath(" //a[contains(text(),'IV YEAR')]")).click();
    		Thread.sleep(2000);
    		w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    		
    		w.navigate().back();
    		  Thread.sleep(2000);
    			w.findElement(By.xpath("//a[contains(text(),'View EIE Syllabus')]")).click();                                            //eie
    			w.findElement(By.xpath("//a[contains(text(),'R16 SYLLABUS (Admitted Batch 2016-17 & 2017-18)')]")).click();
    			w.findElement(By.xpath(" //body/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/a[1]")).click();
    			 Thread.sleep(2000);
    			w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    			w.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/a[1]")).click();
    			 Thread.sleep(2000);
    			w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    			w.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/a[1]")).click();
    			 Thread.sleep(2000);
    			w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    			w.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/a[1]")).click();
    			 Thread.sleep(2000);
    			w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    			w.findElement(By.xpath("//a[contains(text(),'IV YEAR')]")).click();
    			 Thread.sleep(2000);
    			w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    			w.navigate().back();	
    	ACADEMICS.moveToElement(w.findElement(By.xpath(" /html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[6]/a[1]"))).perform();
    	w.findElement(By.xpath(" /html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[6]/ul[1]/li[4]/a[1]")).click();
    	ACADEMICS.moveToElement(w.findElement(By.xpath(" /html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[6]/a[1]"))).perform();
    	w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[6]/ul[1]/li[5]/a[1]")).click();
    	ACADEMICS.moveToElement(w.findElement(By.xpath(" /html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[6]/a[1]"))).perform();
    	w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[6]/ul[1]/li[6]/a[1]")).click();
    	JavascriptExecutor Js12=(JavascriptExecutor)w;
    	Js12.executeScript("window.scrollTo(0,900)");
    	Thread.sleep(2000);
    	JavascriptExecutor Js13=(JavascriptExecutor)w;
    	Js13.executeScript("window.scrollTo(0,-900)");
    	w.navigate().back();
    	   w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();
    	      Thread.sleep(2000);
    	     System.out.println("gdf");
    	     w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]")).click();   //UDAAN
    	      Thread.sleep(2000);
    	      w.findElement(By.linkText("Research Labs")).click();
    	      w.navigate().back();
    	      w.findElement(By.linkText("Center of Excellence")).click();
    	      w.navigate().back();
    	  Thread.sleep(2000);
    	      w.findElement(By.linkText("Sponsored Research")).click();
    	      w.navigate().back();
    		  Thread.sleep(2000);
    	   w.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/button[5]")).click();
    	   w.navigate().back();
    		  Thread.sleep(2000);
    	   w.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/button[6]/li[1]/a[1]")).click();
    	   w.navigate().back();
    		  Thread.sleep(2000);
    	   w.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/button[7]")).click();
    	   w.navigate().back();
    		 w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();
    	      Thread.sleep(2000);
    	      
    		  w.findElement(By.xpath("//body/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/a[1]/div[3]")).click();                      //uttarakash
    	      Thread.sleep(2000);
    	      w.findElement(By.linkText("Research Labs")).click();
    	      w.navigate().back();
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/button[2]/li[1]/a[1]")).click();
    	      w.navigate().back();
    	      System.out.println("tyt");
    	      Thread.sleep(2000);
    	      w.findElement(By.linkText("Sponsored Research")).click();
    	      w.navigate().back();
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/button[5]/li[1]")).click();
    	      w.navigate().back();
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath(" /html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/button[6]/li[1]")).click();
    	      w.navigate().back();
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/button[7]")).click();
    	      w.navigate().back();
    	      
    	      w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();                    //coe
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//body/div[2]/div[1]/section[2]/div[1]/div[3]/div[1]/div[1]/a[1]/div[3]")).click();
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]")).click();
    	      Thread.sleep(2000);
    	      w.navigate().back();
    	      Thread.sleep(2000);
    	      
    	      w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();                    
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//body/div[2]/div[1]/section[2]/div[1]/div[4]/div[1]/div[1]/a[1]/div[3]")).click();                             //iic
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")).click();
    	      w.navigate().back();
    	      Thread.sleep(2000);
    	 
    		
    	    //To check the functionality of Department               
    	       
    	       Actions Department=new Actions(w);
    	       Department.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]"))).build().perform();                //Department
    	       
    	       //To check functionality of CSE 
    	       
    	       Actions CSE=new Actions(w);
    	       CSE.moveToElement (w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/a[1]"))).build().perform();     //CSE
    	       
    	       //To check the functionality of About CSE
    	       
    	       w.findElement(By.xpath("//a[contains(text(),'about cse')]")).click();                                                                        //About cse
    	       w.navigate().back();
    	       Thread.sleep(2000);
    	       
    	       //To check functionality of new specialization 
    	       
    	       Department.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]"))).build().perform();
    	       CSE.moveToElement (w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/a[1]"))).build().perform();
    	       Actions new_specialization=new Actions(w);
    	       new_specialization.moveToElement(w.findElement(By.xpath("//a[contains(text(),'New specializations')]"))).build().perform();
    	      
    	       
    	       //To check functionality of CSM in New specialization section 
    	       Department.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]"))).build().perform();
    	       CSE.moveToElement (w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/a[1]"))).build().perform();
    	       new_specialization.moveToElement(w.findElement(By.xpath("//a[contains(text(),'New specializations')]"))).build().perform();
    	       
    	       Thread.sleep(2000);
    	       w.findElement(By.xpath("//a[contains(text(),'CSM')]")).click();
    	       Thread.sleep(2000);
    	       w.navigate().back();
    	       
    	       
    	       //To check functionality of CSD in new specialization section
    	       Department.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]"))).build().perform();
    	       Thread.sleep(2000);
    	       CSE.moveToElement (w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/a[1]"))).build().perform();
    	       new_specialization.moveToElement(w.findElement(By.xpath("//a[contains(text(),'New specializations')]"))).build().perform();
    	       Thread.sleep(2000);
    	       w.findElement(By.linkText("CSD")).click();
    	       Thread.sleep(2000);
    	       w.navigate().back();
    	       
    	       
    	       //To check functionality of Faculty in CSE section
    	       Department.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]"))).build().perform();
    	       CSE.moveToElement (w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/a[1]"))).build().perform();
    	       Thread.sleep(2000);
    	       w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/ul[1]/li[3]/a[1]")).click();        //Faculty
    	       Thread.sleep(2000);
    	       w.navigate().back();
    	       
    	       
    	       //To check functionality of Achievements in CSE section
    	       Department.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]"))).build().perform();
    	       CSE.moveToElement (w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/a[1]"))).build().perform();
    	       Actions achievements=new Actions(w);      
    	       achievements.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/ul[1]/li[4]/a[1]"))).build().perform();       
    	       Thread.sleep(2000);
    	       
    	       //To check functionality of Student achievements in achievements section 
    	       w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]")).click();     //Students achievements
    	       
    	       
    	       //To check functionality of "2018-19" button in Student achievements section
    	       Thread.sleep(1000);
    	       w.findElement(By.xpath("//a[contains(text(),'2018-19')]")).click();
    	       
    	       
    	       //To check functionality of "2017-18" button in Student achievements section
    	       Thread.sleep(1000);
    	       w.findElement(By.xpath("//a[contains(text(),'2017-18')]")).click();
    	       
    	       
    	       //To check functionality of "2016-17" button in Student achievements section
    	       Thread.sleep(1000);
    	       w.findElement(By.xpath("//a[contains(text(),'2016-17')]")).click();
    	      
    	       
    	       //To check functionality of "2015-16" button in Student achievements section
    	       Thread.sleep(1000);
    	       w.findElement(By.xpath("//a[contains(text(),'2015-16')]")).click();
    	       
    	       
    	       //To check functionality of "2014-15" button in Student achievements section
    	       Thread.sleep(1000);
    	       w.findElement(By.xpath("//a[contains(text(),'2014-15')]")).click();
    	       Thread.sleep(1000);
    	       w.navigate().back();
    	       
    	       
    	       //To check functionality of Faculty Achievements in achievements section
    	       
    	       Department.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]"))).build().perform();
    	       CSE.moveToElement (w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/a[1]"))).build().perform();
    	       achievements.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/ul[1]/li[4]/a[1]"))).build().perform();       
    	       w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/ul[1]/li[4]/ul[1]/li[2]/a[1]")).click();         //Faculty achievements
    	       
    	       
    	       //To check functionality of "2019-20" button in Faculty Achievements section
    	       Thread.sleep(1000);
    	       w.findElement(By.xpath("//a[contains(text(),'2019-20')]")).click();
    	       
    	       
    	       //To check functionality of "2018-19" button in Faculty Achievements section
    	       Thread.sleep(1000);
    	       w.findElement(By.xpath("//a[contains(text(),'2018-19')]")).click();
    	       
    	       
    	       //To check functionality of "2017-18" button in Faculty Achievements section
    	       Thread.sleep(1000);
    	       w.findElement(By.xpath("//a[contains(text(),'2017-18')]")).click();
    	      
    	       
    	       //To check functionality of "2016-17" button in Faculty Achievements section
    	       Thread.sleep(1000);
    	       w.findElement(By.xpath("//a[contains(text(),'2016-17')]")).click();
    	       
    	       
    	       //To check functionality of "2015-16" button in Faculty Achievements section
    	       Thread.sleep(1000);
    	       w.findElement(By.xpath("//a[contains(text(),'2015-16')]")).click();
    	      
    	       
    	       //To check functionality of "2014-15" button in Faculty Achievements section
    	       Thread.sleep(1000);
    	       w.findElement(By.xpath("//a[contains(text(),'2014-15')]")).click();
    	       
    	       
    	       //To check functionality of "2013-14" button in Faculty Achievements section
    	       Thread.sleep(1000);
    	       w.findElement(By.xpath("//a[contains(text(),'2013-14')]")).click();
    	       Thread.sleep(1000);
    	       w.navigate().back();
    	       
    	       
    	       
    	       //To check functionality of Academics in CSE section
    	       Department.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]"))).build().perform();            //DEPARTMENT
    	       CSE.moveToElement (w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/a[1]"))).build().perform();   //CSE     
    	       Actions academics=new Actions(w);
    	       academics.moveToElement (w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/ul[1]/li[5]/a[1]"))).build().perform();   //Academics
    	       Thread.sleep(2000);
    	       
    	       
    	       //To check functionality of E-Resources in academics section
    	       w.findElement(By.xpath("/html/body/header/div[2]/nav/div/div/div[2]/ul/li[7]/ul/li[1]/ul/li[5]/ul/li[1]/a")).click();      //E-Source
    	       Thread.sleep(2000);
    	       
    	       
    	       //To check functionality of "https://www.geeksforgeeks.org/data-structures/" link
    	       w.findElement(By.linkText("https://www.geeksforgeeks.org/data-structures/")).click();
    	       Thread.sleep(3000);
    	       Set <String> windows_P=w.getWindowHandles();
    		   Iterator <String> i_t=windows_P.iterator();
    			
    		   String parent_window=i_t.next();
    		   String child_window=i_t.next();
    			 // w.switchTo().window(parent_window);
    			  //Thread.sleep(3000);
    		   w.switchTo().window(child_window);
    		   Thread.sleep(3000);
    		   w.switchTo().window(parent_window);
    			  
    		   Thread.sleep(3000);
    			 
    		   //To check functionality of "http://www.ccsu.edu/cs/" link
    			w.findElement(By.linkText("http://www.ccsu.edu/cs/")).click();
    			Thread.sleep(3000);
    			Set<String> windows1=w.getWindowHandles();
    			  
    			Iterator <String> it1=windows1.iterator();
    			String parent_window1=it1.next();
    			String child_window1=it1.next();
    					  
    			  //w.switchTo().window(parent_window1);
    			  //Thread.sleep(3000);
    			  w.switchTo().window(child_window1);
    			  Thread.sleep(3000);
    			  w.switchTo().window(parent_window1);
    			  
    			  
    			  Thread.sleep(3000);
    			  
    			  //To check functionality of Lecture Notes button
    			  w.findElement(By.linkText("Lecture Notes")).click();
    			  Thread.sleep(3000);
    			  
    			  
    			  //To check functionality of I-I Semester(R18) in lecture notes section
    			  w.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/div[1]/div[2]/h4/a")).click();
    			
    			  Thread.sleep(3000);
    			  
    			  //To check functionality of English in I-I Semester (R18) section
    			  w.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/div[1]/div[3]/div/ul/li[1]/p/a")).click();
    			  Set<String> windows02=w.getWindowHandles();
    			  Thread.sleep(2000);
    			  Iterator <String> it02=windows02.iterator();
    			  String parent_window02=it02.next();
    			  String child_window02=it02.next();
    			  
    			  //  w.switchTo().window(parent_window2);
    			  //Thread.sleep(3000);
    			  w.switchTo().window(child_window02);
    			  Thread.sleep(5000);
    			  w.switchTo().window(parent_window02);
    			  
    			  Thread.sleep(3000);
    			  
    			  
    			  //To check functionality of II-I Semester (R18) link
    			  
    			  w.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/div[2]/div[1]/h4/a")).click();       //II-I Semester (R18)
    		     
    			  Thread.sleep(3000);
    			  
    			  //To check functionality of unit I in II-I Semester (R18)
    			  w.findElement(By.xpath("//body/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[2]/p[1]/a[1]")).click();  //Unit 1
    		      Set<String> windows3=w.getWindowHandles();
    		      Iterator <String> it3=windows3.iterator();
    			  String parent_window3=it3.next();
    			  String child_window3=it3.next();
    			  
    			 // w.switchTo().window(parent_window3);
    			  //Thread.sleep(3000);
    			  w.switchTo().window(child_window3);
    			  Thread.sleep(5000);
    			  w.switchTo().window(parent_window3);
    		      
    			  Thread.sleep(3000);
    		     
    			  JavascriptExecutor js02 = (JavascriptExecutor) w;      //Scroll
    		      Thread.sleep(3000);
    		      js02.executeScript("window.scrollBy(0,1000)");
    		     
    		      //To check functionality of unit 3 in II-I Semester (R18)
    		      w.findElement(By.xpath("//body/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[5]/li[5]/p[1]/a[1]")).click();    //Unit 3
    		      Thread.sleep(3000);
    		      Set<String> windows4=w.getWindowHandles();
    		      Iterator <String> it4=windows4.iterator();
    			  String parent_window4=it4.next();
    			  String child_window4=it4.next();
    			  
    			  //w.switchTo().window(parent_window4);
    			  //Thread.sleep(2000);
    			  w.switchTo().window(child_window4);
    			  Thread.sleep(5000);
    			  w.switchTo().window(parent_window4);
    			  
    			  Thread.sleep(2000);
    			  w.navigate().back();
    			 
    			  
    			  
    		   //To check functionality Syllabus in academics section under CSE section
    		   Department.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]"))).build().perform();            //DEPARTMENT
    	       CSE.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/a[1]"))).build().perform();   //CSE
    	       academics.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/ul[1]/li[5]/a[1]"))).build().perform();   //Academics
    	       Thread.sleep(2000);	     
    	       w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/ul[1]/li[5]/ul[1]/li[2]/a[1]")).click();     //Syllabus
    		      Thread.sleep(2000);
    		     // w.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();    //Unit I
    		      //Thread.sleep(2000);
    		     // w.switchTo().frame(w.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/iframe[1]")));
    		     // Thread.sleep(2000);
    		      //w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/button[4]")).click();    //Download
    		      //Thread.sleep(2000);
    	       //w.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")).click();
    		      
    		     
    		   //To check functionality of Library in academics section under CSE section
    	       Department.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]"))).build().perform();            //DEPARTMENT
    	       CSE.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/a[1]"))).build().perform();   //CSE
    	       academics.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/ul[1]/li[5]/a[1]"))).build().perform();   //Academics
    	       Thread.sleep(2000);
    	       w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/ul[1]/li[5]/ul[1]/li[3]/a[1]")).click();         //Library
    	       Thread.sleep(2000);
    	       w.navigate().back();
    	      
    	       
    	       //To check functionality of Events in CSE section
    	       Department.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]"))).build().perform();            //DEPARTMENT
    	       CSE.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/a[1]"))).build().perform();   //CSE
    	       w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/ul[1]/li[6]/a[1]")).click();         //Events
    	       Thread.sleep(2000);
    	       
    	       //To check functionality of 2019-20 button in Events section
    	       w.findElement(By.xpath("//a[contains(text(),'2019-20')]")).click();                 //2019-20
    	       Thread.sleep(1000);
    	       
    	       //To check functionality of 2018-19 button in Events section
    	       w.findElement(By.xpath("//a[contains(text(),'2018-19')]")).click();                 //2018-19
    	       Thread.sleep(1000);
    	       
    	       //To check functionality of 2017-18 button in Events section
    	       w.findElement(By.xpath("//a[contains(text(),'2017-18')]")).click();                 //2017-18
    	       Thread.sleep(1000);
    	       
    	       //To check functionality of 2016-17 button in Events section
    	       w.findElement(By.xpath("//a[contains(text(),'2016-17')]")).click();                 //2016-17
    	       Thread.sleep(1000);
    	       //To check functionality of 2015-16 button in Events section
    	       w.findElement(By.xpath("//a[contains(text(),'2015-16')]")).click();                 //2015-16
    	       Thread.sleep(1000);
    	       
    	       //To check functionality of 2014-15 button in Events section
    	       w.findElement(By.xpath("//a[contains(text(),'2014-15')]")).click();                 //2014-15
    	       w.navigate().back();
    	       
    	       //To check functionality of lab in CSE section under Department section
    	       Department.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]"))).build().perform();            //DEPARTMENT
    	       CSE.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/a[1]"))).build().perform();   //CSE
    	       w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/ul[1]/li[7]/a[1]")).click();                     //lab
    	       Thread.sleep(2000);
    	       w.navigate().back();
    	       
    	       
    	       //To check functionality of Publications in CSE section under Department section
    	       Department.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]"))).build().perform();            //DEPARTMENT
    	       CSE.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/a[1]"))).build().perform();   //CSE
    	       w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/ul[1]/li[8]/a[1]")).click();                    //Publications
    	       
    	       //To check functionality of 2019-20 button in Publications section
    	       w.findElement(By.xpath("//a[contains(text(),'2019-20')]")).click();               //2019-20
    	       Thread.sleep(1000);
    	     
    	       
    	       //To check functionality of 2018-19 button in Publications section
    	       w.findElement(By.xpath("//a[contains(text(),'2018-19')]")).click();               //2018-19
    	       Thread.sleep(1000);
    	     
    	       
    	       //To check functionality of 2017-18 button in Publications section
    	       w.findElement(By.xpath("//a[contains(text(),'2017-18')]")).click();              //2017-18
    	       Thread.sleep(1000);
    	     
    	       
    	       //To check functionality of 2016-17 button in Publications section
    	       w.findElement(By.xpath("//a[contains(text(),'2016-17')]")).click();               //2016-17
    	       Thread.sleep(1000);
    	     
    	       
    	       //To check functionality of 2015-16 button in Publications section
    	       w.findElement(By.xpath("//a[contains(text(),'2015-16')]")).click();              //2015-16
    	       w.navigate().back(); 
    	       
    	       //To check functionality of Contact us in CSE section under Department section
    	       Department.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]"))).build().perform();            //DEPARTMENT
    	       CSE.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/a[1]"))).build().perform();   //CSE
    	       w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/ul[1]/li[9]/a[1]")).click();                    //Contact us
    	       Thread.sleep(2000);
    	      
    	       //To check functionality of CSE in Contact us section
    	       w.findElement(By.xpath("//body/div[1]/section[1]/div[2]/div[1]/div[1]/div[1]/h2[1]/a[1]")).click();                       //cse
    	       Thread.sleep(2000);
    	     
    	       //To check functionality of IT in Contact us section
    	       w.findElement(By.xpath("//body/div[1]/section[1]/div[2]/div[1]/div[2]/div[1]/h2[1]/a[1]")).click();                       //IT
    	       Thread.sleep(2000);
    	     
    	       //To check functionality of ECE in Contact us section
    	       w.findElement(By.xpath("//body/div[1]/section[1]/div[2]/div[1]/div[3]/div[1]/h2[1]/a[1]")).click();                       //ECE
    	       Thread.sleep(2000);
    	    
    	       //To check functionality of ECE in Contact us section
    	       w.findElement(By.xpath("//body/div[1]/section[1]/div[2]/div[1]/div[3]/div[1]/h2[1]/a[1]")).click();                       //ECE
    	       Thread.sleep(2000);
    	       w.navigate().back();
    	       
    	       
    	       
    	       /* -----------------------------------------------------------------*****---------------------------------------------------------------------*/
    	   	
    	   	
    	 	     Actions research=new Actions(w);
    		 	
    	       //To check check functionality of Research
    	       research.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/a[1]"))).build().perform();              //Research
    		      
    	       //To check functionality of About Research under Research
    	       w.findElement(By.xpath("//a[contains(text(),'About Research')]")).click();                                                                  //About research
    		     
    	       //To check functionality of Research lab link in About Research section
    	       w.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/button[1]/li[1]/a[1]")).click();                                    //Research lab
    		      
    	       //To check functionality of Biomedical imaging image under Research lab section
    	       w.findElement(By.xpath("//body/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[2]")).click();                         //Biomedical imaging
    		      Thread.sleep(2000);
    		      w.navigate().back();
    		      Thread.sleep(2000);
    		      
    		    //To check functionality of Bio-Informatics image under Research lab section
    		      w.findElement(By.xpath("//body/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/img[2]")).click();                         //Bio-Informatics
    		      Thread.sleep(1000);
    		      w.navigate().back();
    		      w.navigate().back();
    		
    		      //To check functionality Sponsored Research link under About research section
    		      w.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/button[3]/li[1]/a[1]")).click();                                 //Sponsered Research
    		     
    		      //To check functionality of Auto Education Tools button in Sponsored research link
    		      w.findElement(By.xpath("//a[contains(text(),'Auto Education Tools')]")).click();                                                       //Auto education tools
    		      Thread.sleep(2000);
    		      
    		     //To check functionality of Tessellator button in Sponsored research link
    		     // w.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div/div[2]/div/ul/li[2]/a")).click();                                                                //Tessellator
    		      //Thread.sleep(1000);
    		      
    		    //To check functionality of Other Research Projects button in Sponsored research link
    		      w.findElement(By.xpath("//a[contains(text(),'Other Research Projects')]")).click();                                                   //Other Research Projects 
    		      Thread.sleep(1000);
    		      
    		    //To check functionality of A.Y 2019-20 button in Sponsored research link
    		      w.findElement(By.xpath("//a[contains(text(),'AY 2019-20')]")).click();                                                               //A.Y 2019-20
    		      Thread.sleep(1000);
    		     
    		    //To check functionality of A.Y 2018-19 button in Sponsored research link
    		      w.findElement(By.xpath("//a[contains(text(),'AY 2018-19')]")).click();                                                              //A.Y 2018-19
    		      Thread.sleep(1000);
    		    
    		      //To check functionality of A.Y 2016-17 button in Sponsored research link 
    		      w.findElement(By.xpath("//a[contains(text(),'AY 2016-17')]")).click();                                                              //A.Y  2016-17
    		      Thread.sleep(1000);
    		     
    		      //To check functionality of Research Labs under Research section
    		      research.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/a[1]"))).build().perform();              //Research
    		      w.findElement(By.xpath("//a[contains(text(),'Research Labs')]")).click();                                                              //Research labs
    		      Thread.sleep(2000);
    		     
    		      //To check functionality of CFD image under Research lab section
    		      w.findElement(By.xpath("//body/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/a[1]/img[2]")).click();                   // CFD            
    		      w.navigate().back();
    		   
    		      //To check functionality of IOT & ROBOTICS image under Research lab section
    		      w.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div[4]/div/div/a/img[2]")).click();                   // IOT & ROBOTICS           
    		      w.navigate().back();
    		
    		      //To check functionality of Center of Excellence under Research section
    		      research.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/a[1]"))).build().perform();              //Research
    		      w.findElement(By.xpath("/html/body/header/div[2]/nav/div/div/div[2]/ul/li[8]/ul/li[3]/a")).click();                           //Center of Excellence
    		      
    		      JavascriptExecutor jsCOE=(JavascriptExecutor) w;
    		  	
    	       Thread.sleep(2000);
    			  jsCOE.executeScript("window.scrollBy(0,500)");
    		      
    		      //w.findElement(By.xpath("/html/body/div[2]/div/section/div/div/div[1]/div/div/a/img[2]")).clear();           //NUIDIA   //defect not working
    		      //w.navigate().back();                                                                                                        
    		      //w.findElement(By.xpath("/html/body/div[2]/div/section/div/div/div[2]/div/div/a/img[2]")).clear();           //UIRTUSA     //defect not working
    		     // w.navigate().back();                                                                                                        
    		
    			 Thread.sleep(2000);
    	      //To check functionality of Sponsored Research under Research section
    			  research.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/a[1]"))).build().perform();              //Research
    		      w.findElement(By.xpath("/html/body/header/div[2]/nav/div/div/div[2]/ul/li[8]/ul/li[4]/a")).click();                             //Sponsored research
    		
    		      //To check functionality of Auto Education Tools button in Sponsored research section
    		      w.findElement(By.xpath("//a[contains(text(),'Auto Education Tools')]")).click();                                                       //Auto education tools
    		      
    		     //To check functionality of Tessellator button in Sponsored research section
    		     // w.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div/div[2]/div/ul/li[2]/a")).click();                                                                //Tessellator
    		      //Thread.sleep(2000);
    		     
    		      //To check functionality of Other Research Projects button in Sponsored research section
    		      w.findElement(By.xpath("//a[contains(text(),'Other Research Projects')]")).click();                                                   //Other Research Projects 
    		      Thread.sleep(2000);
    		     
    		    //To check functionality of A.Y 2019-20 button in Sponsored research section
    		      w.findElement(By.xpath("//a[contains(text(),'AY 2019-20')]")).click();                                                               //A.Y 2019-20
    		      Thread.sleep(2000);
    		      
    		    //To check functionality of A.Y 2018-19 button in Sponsored research section
    		      w.findElement(By.xpath("//a[contains(text(),'AY 2018-19')]")).click();                                                              //A.Y 2018-19
    		      Thread.sleep(2000);
    		      
    		    //To check functionality of A.Y 2016-17 button in Sponsored research section
    		      w.findElement(By.xpath("//a[contains(text(),'AY 2016-17')]")).click();                                                              //A.Y  2016-17
    		      Thread.sleep(2000);
    		
    		      
    		      //To check functionality of Consultancy Projects under Research section
    		      research.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/a[1]"))).build().perform();              //Research
    		      w.findElement(By.xpath("//a[contains(text(),'Consultancy Projects')]")).click();                                             //Consultancy Projects
    		      
    		      //To check functionality of Other Consultancy Projects button in Consultancy Projects section
    		      w.findElement(By.xpath("//a[contains(text(),'Other Consultancy Projects')]")).click();                                //Other Consultancy Projects
    		      
    		      //To check functionality of AY 2020-21 button under Other Consultancy Projects section
    		      w.findElement(By.xpath("//a[contains(text(),'AY 2020-21')]")).click();                                                  //AY 2020-21
    		      Thread.sleep(1000);
    		
    		     //To check functionality of AY 2019-20 button under Other Consultancy Projects section
    		      w.findElement(By.xpath("//a[contains(text(),'AY 2019-20')]")).click();                                                  //AY 2019-20
    		      Thread.sleep(1000);
    		
    		    //To check functionality of AY 2018-19 button under Other Consultancy Projects section
    		      w.findElement(By.xpath("//a[contains(text(),'AY 2018-19')]")).click();                                                  //AY 2018-19
    		      Thread.sleep(1000);
    		
    		    //To check functionality of AY 2017-18 button under Other Consultancy Projects section
    		      w.findElement(By.xpath("//a[contains(text(),'AY 2017-18')]")).click();                                                  //AY 2017-18
    		      Thread.sleep(1000);
    		     
    		    //To check functionality of AY 2016-17 button under Other Consultancy Projects section
    		      w.findElement(By.xpath("//a[contains(text(),'AY 2016-17')]")).click();                                                  //AY 2016-17
    		      Thread.sleep(1000);
    		
    		      
    		      //To check functionality of Publications and Patents under Research section
    		      research.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/a[1]"))).build().perform();              //Research
    		      Actions publications_patents = new Actions(w);
    		      
    		      publications_patents.moveToElement(w.findElement(By.xpath("//a[contains(text(),'Publications & Patents')]"))).build().perform();         //Publications & Patents
    		      
    		      //To check functionality of Publication Policy in Publications and Patents section
    		      w.findElement(By.xpath("/html/body/header/div[2]/nav/div/div/div[2]/ul/li[8]/ul/li[6]/ul/li[1]/a")).click();            //Publication policy
    		  
    		      
    		      //To check functionality of E-Resources in Publications and Patents section
    		      research.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/a[1]"))).build().perform();              //Research
    		      publications_patents.moveToElement(w.findElement(By.xpath("//a[contains(text(),'Publications & Patents')]"))).build().perform();         //Publications & Patents
    		      w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/ul[1]/li[6]/ul[1]/li[2]/a[1]")).click();            //E-Sources
    		
    		      Set <String> windowsoesources=w.getWindowHandles();
    		      Iterator <String> itesources = windowsoesources.iterator();
    		      String parent_windowesources=itesources.next();
    		      String child_windowesources=itesources.next();
    		        
    		      w.switchTo().window(child_windowesources);
    		      Thread.sleep(2000);
    		      w.switchTo().window(parent_windowesources);
    		
    	      
    		     //To check functionality of Publication Committee in Publications and Patents section
    		     research.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/a[1]"))).build().perform();              //Research
    		     publications_patents.moveToElement(w.findElement(By.xpath("//a[contains(text(),'Publications & Patents')]"))).build().perform();         //Publications & Patents
    		     w.findElement(By.xpath("//a[contains(text(),'Publication Committee')]")).click();                                                 //Publication Committee
    		
    		     
    		     //To check functionality of List of Publications in Publications and Patents section
    		     research.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/a[1]"))).build().perform();              //Research
    		     publications_patents.moveToElement(w.findElement(By.xpath("//a[contains(text(),'Publications & Patents')]"))).build().perform();         //Publications & Patents
    		     w.findElement(By.xpath("//a[contains(text(),'List of Publications')]")).click();                                                   //List of Publications
    		     
    		                                                               
    		                     
    		     
    		     //To check functionality of SCCN: Security in Controller of Computer Networks link in List of Publications section
    		      w.findElement(By.xpath("//a[contains(text(),'SCCN: Security in Controller of Computer Networks ')]")).click();      //SCCN: Security in Controller of Computer Networks
    		     Set <String> windowsccn=w.getWindowHandles();
    		      Iterator <String> itsccn = windowsccn.iterator();
    		      String parent_windowsccn=itsccn.next();
    		      String child_windowesccn=itsccn.next();
    		        
    		      w.switchTo().window(child_windowesccn);
    		      Thread.sleep(2000);
    		      w.switchTo().window(parent_windowsccn);
    		
    		                                                        
    		      
    		      //To check functionality of List of Patents in Publications and Patents section
    		      research.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/a[1]"))).build().perform();              //Research
    			  publications_patents.moveToElement(w.findElement(By.xpath("//a[contains(text(),'Publications & Patents')]"))).build().perform();         //Publications & Patents
    		      w.findElement(By.xpath("//a[contains(text(),'List of Patents')]")).click();                                             //List of Patents
    		      
    		      
    		      //To open Patents Filed by CSE Faculty PDF in List of Patents section
    		      w.findElement(By.xpath("//span[contains(text(),'Patents Filed by CSE Faculty')]")).click();                             ////span[contains(text(),'Patents Filed by CSE Faculty')]
    		      Thread.sleep(2000);
    		     
    		      //To close Patents Filed by CSE Faculty PDF in List of Patents section
    		      w.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")).click();
    		
    		     //To open Patents Filed by IT Faculty PDF in List of Patents section
    		      w.findElement(By.xpath("//span[contains(text(),'Patents Filed by IT Faculty')]")).click();                           //Patents Filed by IT Faculty
    		      Thread.sleep(2000);
    		     
    		    //To close Patents Filed by IT Faculty PDF in List of Patents section
    		      w.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")).click(); 
    		
    		
    		      /*research.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/a[1]"))).build().perform();              //Research
    			  publications_patents.moveToElement(w.findElement(By.xpath("//a[contains(text(),'Publications & Patents')]"))).build().perform();         //Publications & Patents
    		      w.findElement(By.xpath("//a[contains(text(),'Re-Imbursement Form')]")).click();                                                //Re-Imbursement Form
    		      w.findElement(By.xpath("//body/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]")).click();                                           //zoom-in                                          
    		      w.findElement(By.xpath("//body/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]")).click();                                           //zoom-out  
    		      w.navigate().back();  
    		*/
    		      
    		      //To check functionality of Code of Ethics in Publications & Patents section
    		      research.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/a[1]"))).build().perform();              //Research
    			  publications_patents.moveToElement(w.findElement(By.xpath("//a[contains(text(),'Publications & Patents')]"))).build().perform();         //Publications & Patents
    		      w.findElement(By.xpath("//a[contains(text(),'Code of Ethics')]")).click();                                                          //Code of Ethics
    		
    		      //To check functionality of Research Workshops under Research section
    		      research.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/a[1]"))).build().perform();              //Research
    		      w.findElement(By.xpath("//a[contains(text(),'Research Workshops')]")).click();                                                    //Research Workshops
    		      
    		      //To check functionality of DRDL button under Research Workshops section
    		      w.findElement(By.xpath("//a[contains(text(),'DRDL')]")).click();                                                            //DRDL
    		      Thread.sleep(2000);
    		     
    		    //To check functionality of Biomedical Imaging button under Research Workshops section
    		      w.findElement(By.xpath("//a[contains(text(),'Biomedical Imaging')]")).click();                                               //Biomedical Imaging
    		      Thread.sleep(2000);
    		      
    		    //To check functionality of Blockchain Technology button under Research Workshops section
    		      w.findElement(By.xpath("//a[contains(text(),'Blockchain Technology')]")).click();                                               //Blockchain Technology
    		      
    		      //To check functionality of Industry Interaction Cell under Research section
    		      research.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/a[1]"))).build().perform();              //Research
    	       w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/ul[1]/li[8]/a[1]")).click();                                    //Industry Interaction Cell
    	       
    	     //To check functionality of IIC Events under Industry Interaction Cell section
    	       w.findElement(By.xpath("//a[contains(text(),'IIC Events')]")).click();                                                       //IIC Events
    		
    	       //To check functionality of GSOC under Research section
    	       research.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/a[1]"))).build().perform();              //Research
    		      w.findElement(By.xpath("//a[contains(text(),'GSOC')]")).click();                                                             //GSOC
    		      
    		      //To check functionality of click here link
    		      w.findElement(By.xpath("//body/div[1]/div[1]/p[1]/a[1]")).click();                                                         //click here    
    		
    		      Set <String> windowgsoc=w.getWindowHandles();
    		      Iterator <String> itgsoc = windowgsoc.iterator();
    		      String parent_windowgsoc=itgsoc.next();
    		      String child_windowgsoc=itgsoc.next();
    		        
    		      w.switchTo().window(child_windowgsoc);
    		      Thread.sleep(2000);
    		      w.switchTo().window(parent_windowgsoc);
    		      w.navigate().back();
    		     
    		      w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();
    		      
    		      
    		      
    	/* -------------------------------------------------------------------*****-------------------------------------------------------------------------*/

    		    //To scroll Home page
    			  JavascriptExecutor homepage=(JavascriptExecutor) w;
    			  	
    	        Thread.sleep(2000);
    	        homepage.executeScript("window.scrollBy(0,1700)");
    	        Thread.sleep(2000);
    	        
    	        //To check functionality of Swayam image
    	        w.findElement(By.xpath("//body/div[2]/div[1]/section[4]/div[1]/div[1]/div[1]/div[1]/a[1]/div[3]")).click();          //Swayam
    	        Thread.sleep(2000);
    	        
    	       
    	        //To check functionality of Swayam-NPTEL lOGO under Swayam image
    	        w.findElement(By.xpath("//body/nav[1]/div[1]/div[1]/a[1]/img[1]")).click();                                      //Swayam-NPTEL LOGO
    		      Thread.sleep(2000);
    		     
    		      //To check functionality of Click here (NPTEL April 24/25 exams postponed) link
    		      w.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/h3[1]/p[1]/b[1]/a[1]")).click();                 //NPTEL April 24/25 exams postponed-CLICK HERE
    		      Thread.sleep(2000);
    		      
    		      w.navigate().back();
    		     
    		     //To check functionality of Click here (Timelines and Guidelines for Jan-Apr 2021) link
    		      w.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/h3[2]/p[1]/b[1]/a[1]")).click();            //Timelines and Guidelines for Jan-Apr 2021-Click here
    		      Thread.sleep(2000);
    		      w.navigate().back();
    		
    		     
    		      //To check functionality of click here (Tentative Course List (Jul - Dec 2021)) link
    		      JavascriptExecutor featured_new=(JavascriptExecutor) w;
    			  	
    	        Thread.sleep(3000);
    	        featured_new.executeScript("window.scrollBy(0,500)");
    		      
    	        Thread.sleep(3000);
    		     
    	        
    	        w.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();        //Tentative Course List (Jul - Dec 2021)-click here
    		      Thread.sleep(3000);
    		      
    		      
    		      Set <String> TCL21=w.getWindowHandles();
    		      Iterator <String> ITCL21 = TCL21.iterator();
    		      String parent_windowTCL21=ITCL21.next();
    		      String child_windowTCL21=ITCL21.next();
    		        
    		      w.switchTo().window(child_windowTCL21);
    		      Thread.sleep(3000);
    		      w.switchTo().window(parent_windowTCL21);
    		      
    		   
    		      //To check functionality of NPTEL ONLINE COURSES image
    		      w.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/div[1]/h4[1]")).click();              //NPTEL ONLINE COURSES
    		      
    		    Set <String> NOC=w.getWindowHandles();
    		      Iterator <String> ITNOC = NOC.iterator();
    		      String parent_windowNOC=ITNOC.next();
    		      String child_windowNOC=ITNOC.next();
    		        
    		      w.switchTo().window(child_windowNOC);
    		      Thread.sleep(2000);
    		      w.switchTo().window(parent_windowNOC);
    		      
    		      w.navigate().back();
    		      
    		      //To check functionality of Home 
    		      w.findElement(By.xpath("//a[contains(text(),'Home')]")).click();                      //home
    		
    		     //To check functionality of Existing SPOC image under Home 
    		      w.findElement(By.xpath("//body/div[1]/div[1]/div[2]/a[1]/img[1]")).click();           //Existing SPOC
    		      
    		      Set <String> existingSPOC=w.getWindowHandles();
    		      Iterator <String> ITexistingSPOC =existingSPOC.iterator();
    		      String parent_windowexistingSPOC= ITexistingSPOC.next();
    		      String child_windowexistingSPOC = ITexistingSPOC.next();
    		      
    		      w.switchTo().window(child_windowexistingSPOC);
    		      Thread.sleep(2000);
    		      w.switchTo().window(parent_windowexistingSPOC);
    		      
    		      
    		      
    		     w.navigate().back();
    		
    		     //To check functionality of About us
    		     w.findElement(By.xpath("//a[contains(text(),'About us')]")).click();       //About us
    		     Thread.sleep(1000);
    		     w.navigate().back();
    		     Thread.sleep(1000);
    		     
    		     //To check functionality of Quick Reference Links
    		     w.findElement(By.xpath("//a[contains(text(),'Quick Reference Links')]")).click();       //Quick Reference Links
    		
    		    
    		     //To check functionality of jan-Apr 2021 semester link
    		     w.findElement(By.xpath("//a[@id='nav-item-tab']")).click();                   //jan-Apr 2021 semester
    		     Thread.sleep(1000);
    		
    		     //To check functionality of SPOC Timelines and Guidelines for Jan 2021 Semester link
    		     w.findElement(By.xpath("//b[contains(text(),'SPOC Timelines and Guidelines for Jan 2021 Semeste')]")).click();   //SPOC Timelines and Guidelines for Jan 2021 Semeste
    		     Thread.sleep(1000);
    		
    		      Set <String> existingSPOCT=w.getWindowHandles();
    		      Iterator <String> ITexistingSPOCT =existingSPOCT.iterator();
    		      String parent_windowexistingSPOCT= ITexistingSPOCT.next();
    		      String child_windowexistingSPOCT = ITexistingSPOCT.next();
    		      
    		      w.switchTo().window(child_windowexistingSPOCT);
    		      Thread.sleep(2000);
    		      w.switchTo().window(parent_windowexistingSPOCT);
    		      w.navigate().back();
    		     
    		      //To check functionality of Contact us
    		      w.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click();                   ////a[contains(text(),'Contact Us')]
    		      w.navigate().back();
    		      w.navigate().back();
    		
    		
    		      
    		      //To check functionality of Trishul image
    		      w.findElement(By.xpath("//body/div[2]/div[1]/section[4]/div[1]/div[2]/div[1]/div[1]/a[1]/div[3]")).click();                 //Image Trishul
    		      Thread.sleep(1000);
    		      w.navigate().back();
    		
    		      //To check functionality of Arjuna image
    		      w.findElement(By.xpath("//body/div[2]/div[1]/section[4]/div[1]/div[3]/div[1]/div[1]/a[1]/div[3]")).click();                          //Image Arjuna
    		      Thread.sleep(1000);
    		      w.navigate().back();
    		      
    		      //To check functionality of NFS image
    		      w.findElement(By.xpath("//body/div[2]/div[1]/section[4]/div[1]/div[4]/div[1]/div[1]/a[1]/div[3]")).click();                         //Image NFS
    		      Thread.sleep(1000);
    		      w.navigate().back();

    	      
    	    //Infrastructure module-----------------------------------------------------------------------------------------
    	      Actions infrastructure = new Actions(w);
    	      infrastructure.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[9]/a[1]"))).perform();               //infrastructure
    	      Actions KMITGranthalaya = new Actions(w);
    	      KMITGranthalaya.moveToElement( w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[9]/ul[1]/li[1]/a[1]"))).perform(); //KMITGranthalaya
    	      w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[9]/ul[1]/li[1]/ul[1]/li[1]/a[1]")).click(); // About Library
    	      Thread.sleep(2000);
    	      JavascriptExecutor js01= (JavascriptExecutor) w;
    	      js01.executeScript("window.scrollTo(0,2500)");
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("/html[1]/body[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]")).click();    // view list of Journals
    	      Thread.sleep(2000);
    	      TakesScreenshot Journal= (TakesScreenshot) w;
    		  File src= Journal.getScreenshotAs(OutputType.FILE);
    		  Files.copy(src, new File ("C:\\Users\\5EIN\\OneDrive\\Desktop\\Pic123.png"));
    		  
    	      w.switchTo().frame(w.findElement(By.xpath("//body/div[2]/section[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[2]/div[1]/iframe[1]")));         // Iframe
    	      w.findElement(By.xpath("//button[@id='viewFind']")).click();
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//input[@id='findInput']")).sendKeys("International");
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//input[@id='findHighlightAll']")).click();
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//input[@id='findMatchCase']")).click();
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//input[@id='findEntireWord']")).click();
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//button[@id='viewFind']")).click();
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//select[@id='scaleSelect']")).click();
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//body[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[3]/span[1]/select[1]/option[6]")).click();              //50% zoom
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//button[@id='secondaryToolbarToggle']")).click();
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//button[@id='pageRotateCw']")).click();
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//span[contains(text(),'Rotate Counterclockwise')]")).click();
    	      Thread.sleep(2000);
    	      w.navigate().back();
    	      
    	      infrastructure.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[9]/a[1]"))).perform(); 
    	      w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[9]/ul[1]/li[2]/a[1]")).click();                        // Labs
    	      Thread.sleep(2000);
    	      w.navigate().back();
    	      infrastructure.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[9]/a[1]"))).perform(); 
    	      w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[9]/ul[1]/li[3]/a[1]")).click();                         // Sports Facilities
    	      JavascriptExecutor js2= (JavascriptExecutor) w;
    	      js2.executeScript("window.scrollTo(0,300)");
    	      w.findElement(By.xpath("//a[contains(text(),'Yoga')]")).click();                                                  // Yoga
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//a[contains(text(),'Chess, TT and Caroms')]")).click();                                  // Chess caroms
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//a[contains(text(),'Football')]")).click();                                              //Football
    	      Thread.sleep(1000);
    	
    	      w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/a[1]")).click(); // Basketball
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//a[contains(text(),'Volleyball')]")).click();                                       // Volleyball
    	      Thread.sleep(2000);
    	      w.navigate().back();
    	      infrastructure.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[9]/a[1]"))).perform(); //auditorium
    	      w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[9]/ul[1]/li[4]/a[1]")).click();
    	      Thread.sleep(3000);
    	      w.navigate().back();
    	      infrastructure.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[9]/a[1]"))).perform();
    	      w.findElement(By.xpath("//a[contains(text(),'class rooms & seminar halls')]")).click();                                                             //class rooms & seminar halls
    	      Thread.sleep(3000);
    	      w.navigate().back();
    	      infrastructure.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[9]/a[1]"))).perform();
    	      w.findElement(By.xpath("//a[contains(text(),'Accessibility')]")).click();                                                                              //Accessibility
    	      Thread.sleep(3000);
    	      w.navigate().back();
    	      
    	      // Initivatives module-----------------------------------------------------------------------------------
    	      Actions Initiatives = new Actions(w);
    	      Initiatives.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[10]/a[1]"))).perform();
    	      w.findElement(By.xpath("//a[contains(text(),'co-curriculars')]")).click();                                                            //co-curriculars
    	      JavascriptExecutor js6= (JavascriptExecutor) w;
    	      js6.executeScript("window.scrollTo(0,100)");
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/div[1]/img[1]")).click();                 //Trishul
    	      Thread.sleep(2000);
    	      w.navigate().back();
    	      w.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/a[1]/img[1]")).click();                 //Arjuna
    	      Thread.sleep(3000);
    	      w.navigate().back();
    	      w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/a[1]/img[1]")).click();                 //NFS
    	      Thread.sleep(2000);
    	      w.navigate().back();
    	      w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]")).click();                 //BEC
    	      Thread.sleep(2000);
    	      JavascriptExecutor js7= (JavascriptExecutor) w;
    	      js7.executeScript("window.scrollTo(0,1000)");
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]")).click();
    	       js7.executeScript("window.scrollTo(1000,0)");
    	      w.navigate().back();
    	      w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/a[1]/img[1]")).click();                 //SONET
    	      Thread.sleep(2000);
    	      JavascriptExecutor js8= (JavascriptExecutor) w;
    	      js8.executeScript("window.scrollTo(0,100)");
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//a[contains(text(),'BlockChain architecture design & Use cases')]")).click();
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//a[contains(text(),'CyberSecurity- Ethical Hacking')]")).click();
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//a[contains(text(),'Full Stack Web Development')]")).click();
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//a[contains(text(),'IOS with Objective C')]")).click();
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//a[contains(text(),'Introduction to Parallel Programming in Open ML')]")).click();
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//a[contains(text(),'IoT')]")).click();
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//a[contains(text(),'Machine Learning')]")).click();
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//a[contains(text(),'Mean Stack Web Development')]")).click();
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//a[contains(text(),'Python Programming')]")).click();
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//a[contains(text(),'Python Data Science')]")).click();
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//a[contains(text(),'Social Networks')]")).click();
    	      Thread.sleep(2000);
    	      js8.executeScript("window.scrollTo(1000,0)");
    	      w.navigate().back();
    	      w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/a[1]/img[1]")).click();                 //Finishing School
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//b[contains(text(),'Finishing School Faculty')]")).click();                                                        //Finishing School Faculty
    	      Thread.sleep(1000);
    	      w.navigate().back();
    	      js6.executeScript("window.scrollTo(300,0)");
    	      w.navigate().back();
    	      Initiatives.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[10]/a[1]"))).perform();
    	      Actions Extracurriculars = new Actions(w);
    	      Extracurriculars.moveToElement(w.findElement(By.xpath("//a[contains(text(),'extra-curriculars')]"))).perform();                  //extra-curriculars
    	      w.findElement(By.xpath("//a[contains(text(),'Student Council')]")).click();                                                    // Student Council
    	      Thread.sleep(1000);
    	      w.navigate().back();
    	      Initiatives.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[10]/a[1]"))).perform();
    	      Actions Extracurriculars1 = new Actions(w);
    	      Extracurriculars1.moveToElement(w.findElement(By.xpath("//a[contains(text(),'extra-curriculars')]"))).perform();
    	      w.findElement(By.xpath("//a[contains(text(),'Clubs')]")).click();                                                                  //Clubs   
    	      JavascriptExecutor js9= (JavascriptExecutor) w;
    	      js9.executeScript("window.scrollTo(0,300)");
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[2]")).click();           // organising committee
    	      Thread.sleep(2000);
    	      w.navigate().back();
    	      w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/a[1]/img[2]")).click();                           // Public relations
    	      Thread.sleep(2000);
    	      w.navigate().back();
    	      w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/a[1]/img[2]")).click();                           // aakarshan
    	      Thread.sleep(2000);
    	      w.navigate().back();
    	      w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/section[1]/div[1]/div[4]/div[1]/div[1]/a[1]/img[2]")).click();                           // AALAP
    	      Thread.sleep(2000);
    	      w.navigate().back();
    	      w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/section[1]/div[1]/div[5]/div[1]/div[1]/a[1]/img[2]")).click();                           // Abhinaya
    	      Thread.sleep(2000);
    	      w.navigate().back();
    	      w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/section[1]/div[1]/div[6]/div[1]/div[1]/a[1]/img[2]")).click();                           // Kaivalya
    	      Thread.sleep(2000);
    	      w.navigate().back();
    	      w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/a[1]/img[2]")).click();                           // Kdarshan
    	      Thread.sleep(2000);
    	      w.navigate().back();
    	      w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/a[1]/img[2]")).click();                           // Kreeda Sports club
    	      Thread.sleep(2000);
    	      w.navigate().back();
    	      w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/section[2]/div[1]/div[3]/div[1]/div[1]/a[1]/img[2]")).click();                           // Mudra
    	      Thread.sleep(2000);
    	      w.navigate().back();
    	      w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/section[2]/div[1]/div[4]/div[1]/div[1]/a[1]/img[2]")).click();                           // Recurse
    	      Thread.sleep(2000);
    	      w.navigate().back();
    	      w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/section[2]/div[1]/div[5]/div[1]/div[1]/a[1]/img[2]")).click();                           // Traces of lenses 
    	      Thread.sleep(2000);
    	      w.navigate().back();
    	      w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/section[2]/div[1]/div[6]/div[1]/div[1]/a[1]/img[2]")).click();                           // Vachan
    	      Thread.sleep(2000);
    	      w.navigate().back();
    	       js9.executeScript("window.scrollTo(500,0)");
    	      w.navigate().back();
    	      Initiatives.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[10]/a[1]"))).perform();
    	      Extracurriculars.moveToElement(w.findElement(By.xpath("//a[contains(text(),'extra-curriculars')]"))).perform();
    	      w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[10]/ul[1]/li[2]/ul[1]/li[3]/a[1]")).click();      // Street Cause
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//a[contains(text(),'CoVid 19 Relief Project – Mask Distribution')]")).click();
    	      Thread.sleep(1000);
    	      w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]")).click();                                   //CoVid 19 Relief Proj
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]")).click(); 
    	      Thread.sleep(1000);
    	      w.findElement(By.xpath("//a[contains(text(),'Plantation Drive')]")).click();
    	      Thread.sleep(2000);
    	      w.navigate().back();
    	      Initiatives.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[10]/a[1]"))).perform();
    	      w.findElement(By.xpath("//a[contains(text(),'KMIT Parishad Society')]")).click();                                              //KMIT Parishad Society
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//a[contains(text(),'alumni.kmit.in')]")).click();
    	      Set <String> window_1= w.getWindowHandles();
    	      Iterator <String> it_1=window_1.iterator();
    	      String Parent_window01=it_1.next();
    	      String Child_window01= it_1.next();
    	      w.switchTo().window(Child_window01);
    	      Thread.sleep(3000);
    	      w.close();
    	      w.switchTo().window(Parent_window01);
    	      w.navigate().back();	
    	      
    	   
    	      //Uniqueness module ------------------------------------------------
    	      Actions uniqueness  = new Actions(w);
    	      uniqueness.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[11]/a[1]"))).perform();
    	    w.findElement(By.xpath("//a[contains(text(),'tessellator')]")).click();                                                            //tessellator
    	      Thread.sleep(2000);
    	      w.navigate().back();
    	      uniqueness.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[11]/a[1]"))).perform();
    	      w.findElement(By.xpath("//a[contains(text(),'kmitra')]")).click();                               //KMITRA
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//a[contains(text(),'HopOn to kMitra')]")).click();                                             //Hopon to KMITRA
    	      Set <String> window_2= w.getWindowHandles();
    	      Iterator <String> it_02=window_2.iterator();
    	      String Parent_window2=it_02.next();
    	      String Child_window12= it_02.next();
    	      w.switchTo().window(Child_window12);
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//button[contains(text(),'×')]")).click();            //close the alert
    	      w.findElement(By.xpath("//body/div[2]/div[1]/ul[1]/li[2]/a[1]")).click();
    	      Thread.sleep(2000);
    	     Actions Categories= new Actions(w);
    	      Categories.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ul[1]/li[3]/a[1]"))).perform();              //  Categories
    	      w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();                               //Editor’s Note
    	      w.navigate().back();
    	      Categories.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ul[1]/li[3]/a[1]"))).perform();               //  Categories
    	      w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]")).click();                                //All Things KMIT
    	      w.navigate().back();
    	      Categories.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ul[1]/li[3]/a[1]"))).perform();              //  Categories
    	      w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ul[1]/li[3]/ul[1]/li[3]/a[1]")).click();                              //Tech Neutron
    	      w.navigate().back();
    	      Categories.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ul[1]/li[3]/a[1]"))).perform();               //  Categories
    	      Actions Critique= new Actions(w);
    	      Critique.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ul[1]/li[3]/ul[1]/li[4]/a[1]"))).perform();     //Critique
    	      w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ul[1]/li[3]/ul[1]/li[4]/ul[1]/li[1]/a[1]")).click();                     //Showtime
    	      w.navigate().back();
    	      Categories.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ul[1]/li[3]/a[1]"))).perform();                   //  Categories
    	      Actions Critique1= new Actions(w);
    	      Critique1.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ul[1]/li[3]/ul[1]/li[4]/a[1]"))).perform();         //  Critique
    	      w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ul[1]/li[3]/ul[1]/li[4]/ul[1]/li[2]/a[1]")).click();                        //Booked
    	      w.navigate().back();
    	      Categories.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ul[1]/li[3]/a[1]"))).perform();                      //  Categories
    	      Actions Critique2= new Actions(w);
    	      Critique2.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ul[1]/li[3]/ul[1]/li[4]/a[1]"))).perform();           //  Critique
    	      w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ul[1]/li[3]/ul[1]/li[4]/ul[1]/li[3]/a[1]")).click();                            //Fashionista
    	      w.navigate().back();
    	      Categories.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ul[1]/li[3]/a[1]"))).perform();                      //  Categories
    	      Actions Critique3= new Actions(w);
    	      Critique3.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ul[1]/li[3]/ul[1]/li[4]/a[1]"))).perform();           //  Critique
    	      w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ul[1]/li[3]/ul[1]/li[4]/ul[1]/li[4]/a[1]")).click();                         //Gourmet Guru
    	      w.navigate().back();
    	      Categories.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ul[1]/li[3]/a[1]"))).perform();                        //  Categories
    	      Actions Critique4= new Actions(w);
    	      Critique4.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ul[1]/li[3]/ul[1]/li[4]/a[1]"))).perform();          //   Critique
    	      w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ul[1]/li[3]/ul[1]/li[4]/ul[1]/li[5]/a[1]")).click();                          //Music
    	      w.navigate().back();
    	      Actions Categories1= new Actions(w);
    	      Categories1.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ul[1]/li[3]/a[1]"))).perform();                      //  Categories
    	      w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ul[1]/li[3]/ul[1]/li[6]/a[1]")).click();                                      //Do it yourself
    	      w.navigate().back();
    	      Categories1.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ul[1]/li[3]/a[1]"))).perform();                      //  Categories
    	      w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ul[1]/li[3]/ul[1]/li[8]/a[1]")).click();                                      //Miscellaneous
    	      w.navigate().back();
    	      Actions Categories2= new Actions(w);
    	      Categories2.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ul[1]/li[3]/a[1]"))).perform();                      //  Categories
    	      w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ul[1]/li[3]/ul[1]/li[9]/a[1]")).click();                                      //Interview
    	      w.navigate().back();
    	      w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")).click();                                 //Art Gallery
    	      Thread.sleep(2000);
    	      w.navigate().back();
    	      w.findElement(By.xpath("//body/div[2]/div[1]/ul[1]/li[5]/a[1]")).click();             //About us
    	      Thread.sleep(2000);
    	      w.navigate().back();
    	      Thread.sleep(2000);
    	      w.close();
    	      w.switchTo().window(Parent_window2);
    	      w.navigate().back();
    	      uniqueness.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[11]/a[1]"))).perform();
    	      w.findElement(By.xpath("//a[contains(text(),'LMS')]")).click();                                                                 //LMS
    	      JavascriptExecutor js10= (JavascriptExecutor) w;
    	      js10.executeScript("window.scrollTo(0,500)");
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//a[contains(text(),'Download SanjayaApp')]")).click();              //Download SanjayaApp
    	      Set <String> window3= w.getWindowHandles();
    	      Iterator <String> it_3=window3.iterator();
    	      String Parent_window3=it_3.next();
    	      String Child_window13= it_3.next();
    	      w.switchTo().window(Child_window13);
    	      Thread.sleep(2000);
    	      w.close();
    	      w.switchTo().window(Parent_window3);
    	      Thread.sleep(1000);
    	      w.findElement(By.xpath("//a[contains(text(),'Download DronaApp')]")).click();             //Download DronaApp
    	      Set <String> window4= w.getWindowHandles();
    	      Iterator <String> it_4=window4.iterator();
    	      String Parent_window4=it_4.next();
    	      String Child_window14= it_4.next();
    	      w.switchTo().window(Child_window14);
    	      Thread.sleep(2000);
    	      w.close();
    	      w.switchTo().window(Parent_window4);
    	      w.findElement(By.xpath("//a[contains(text(),'Download NetraApp')]")).click();          //Download NetraApp
    	      Set <String> window5= w.getWindowHandles();
    	      Iterator <String> it5=window5.iterator();
    	      String Parent_window5=it5.next();
    	      String Child_window15= it5.next();
    	      w.switchTo().window(Child_window15);
    	      Thread.sleep(2000);
    	      w.close();
    	      w.switchTo().window(Parent_window5);
    	      js10.executeScript("window.scrollTo(500,0)");
    	      w.navigate().back();
    	     uniqueness.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[11]/a[1]"))).perform();
    	      w.findElement(By.xpath("//a[contains(text(),'teleuniv')]")).click();                                                            //teleuniv
    	      Thread.sleep(2000);
    	      w.navigate().back();
    	      uniqueness.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[11]/a[1]"))).perform();
    	      w.findElement(By.xpath("//a[contains(text(),'kmit tv')]")).click();                                                            //kmit tv
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[2]/p[2]/a[1]")).click();                                    // Click here button
    	      Thread.sleep(2000);
    	      Set <String> window6= w.getWindowHandles();
    	      Iterator <String> it6=window6.iterator();
    	      String Parent_window6=it6.next();
    	      String Child_window16= it6.next();
    	      w.switchTo().window(Child_window16);
    	      Thread.sleep(2000);
    	     w.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-index[1]/section[1]/div[1]/div[2]/div[3]/a[1]")).click();                //Login
    	      w.findElement(By.xpath("//button[@id='signup-button'] ")).click();                                                     //Sign up
    	      Thread.sleep(1000);
    	      w.findElement(By.xpath("//body/app-root[1]/app-login[1]/section[1]/div[1]/div[1]/div[2]/section[1]/div[1]/div[2]/div[2]/form[1]/fieldset[1]/div[1]/input[1]")).sendKeys("Aksitha");                //Login
    	      Thread.sleep(1000);
    	      w.findElement(By.xpath("//body/app-root[1]/app-login[1]/section[1]/div[1]/div[1]/div[2]/section[1]/div[1]/div[2]/div[2]/form[1]/fieldset[1]/div[2]/input[1]")).sendKeys("S");                //Login
    	      Thread.sleep(1000);
    	      w.findElement(By.xpath("//body/app-root[1]/app-login[1]/section[1]/div[1]/div[1]/div[2]/section[1]/div[1]/div[2]/div[2]/form[1]/fieldset[1]/div[3]/input[1]")).sendKeys("sriramula@gmail.com");               //Login
    	      Thread.sleep(1000);
    	      w.findElement(By.xpath("//body/app-root[1]/app-login[1]/section[1]/div[1]/div[1]/div[2]/section[1]/div[1]/div[2]/div[2]/form[1]/fieldset[1]/div[4]/input[1] ")).sendKeys("7997418568");
    	      Select college= new Select(w.findElement(By.tagName("select")));
    	      college.deselectByVisibleText("KMIT");
    	      w.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-login[1]/section[1]/div[1]/div[1]/div[2]/section[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]")).click();
    	      System.out.println("Login Successful");
    	      w.close();
    	      w.switchTo().window(Parent_window6);
    	      w.navigate().back();
    	      

    	      // Examination module--------------------------------------------------------------
    	      w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[12]/a[1]")).click();     //Examinations
    	      Thread.sleep(2000);
    	      System.out.println(w.getCurrentUrl());
    	      w.findElement(By.xpath("//a[contains(text(),'CBT Exam notification for B.Tech/B.Pharmacy II-I, ')]")).click();
    	      Thread.sleep(4000);
    	      w.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    	      w.findElement(By.xpath("//a[contains(text(),'Notification_for_onetime_chance_examinations April')]")).click();
    	      Thread.sleep(3000);
    	      w.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//a[contains(text(),'Exam Time Tables')]")).click();                          //Exam Time Tables
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//a[contains(text(),'Results')]")).click();                                   //Result
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//b[contains(text(),'B.Tech. III Year II Semester (R16) Regular Examina')]")).click();
    	      
    	      Set <String> window7= w.getWindowHandles();
    	      Iterator <String> it7=window7.iterator();
    	      String Parent_window7=it7.next();
    	      String Child_window17= it7.next();
    	      w.switchTo().window(Child_window17);
    	      Thread.sleep(2000);
    	      w.close();
    	      w.switchTo().window(Parent_window7);
    	      w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")).click();                          //Student Services
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//a[@id='ui-id-2']")).click();                                                // Tatkal Services
    	      Thread.sleep(1000);
    	      JavascriptExecutor js5= (JavascriptExecutor) w;
    	      js5.executeScript("window.scrollTo(0,300)");
    	      Thread.sleep(2000);
    	      js5.executeScript("window.scrollTo(300,0)");
    	      w.navigate().back();
    	      
    	      
    	      //Placemnt Module--------------------------------------
    	      w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[13]/a[1]")).click();               //Placement
    	      Thread.sleep(1000);
    	      System.out.println(w.getCurrentUrl());
    	      JavascriptExecutor js4= (JavascriptExecutor) w;
    	      js4.executeScript("window.scrollTo(0,300)");
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//a[contains(text(),'Placement Objective')]")).click();                                                     //Placement Objective
    	      Thread.sleep(1000);
    	      w.findElement(By.xpath("//a[contains(text(),'Placement Officer')]")).click();                                                           //Placement Officers
    	      Thread.sleep(1000);
    	      w.findElement(By.xpath("//a[contains(text(),'Placement Track Record')]")).click();                                                        //Placement Track record
    	      Thread.sleep(1000);
    	      w.findElement(By.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();         //2019-2020
    	      Thread.sleep(1000);
    	      w.findElement(By.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/b[1]")).click();     //2018-2019
    	      Thread.sleep(1000);
    	      w.findElement(By.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]/b[1]")).click();     //2017-2018
    	      Thread.sleep(1000);
    	      w.findElement(By.xpath("//a[contains(text(),'Student Placements')]")).click(); 
    	      Thread.sleep(1000);
    	      w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]/b[1]")).click();
    	      Thread.sleep(1000);
    	      w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]/b[1]")).click();
    	      Thread.sleep(1000);
    	      w.findElement(By.xpath("//b[contains(text(),'2016-17')]")).click();
    	      Thread.sleep(1000);
    	      w.findElement(By.xpath("//b[contains(text(),'2015-16')]")).click();
    	      Thread.sleep(1000);
    	      w.findElement(By.xpath("//b[contains(text(),'2014-15')]")).click();
    	      Thread.sleep(1000);
    	      w.findElement(By.xpath("//b[contains(text(),'2013-14')]")).click();
    	      js4.executeScript("window.scrollTo(300,0)");
    	      w.navigate().back();
    	      
    	      
    	      
    	      //Mandatory disclousers-----------------
    	      w.findElement(By.xpath("//span[contains(text(),'Mandatory Disclosure')]")).click();
    	      Thread.sleep(2000);
    	      System.out.println(w.getCurrentUrl());
    	      w.findElement(By.xpath("//a[contains(text(),'AICTE Mandatory Disclosure')]")).click();
    	      Thread.sleep(3000);
    	      w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[3]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    	      w.findElement(By.xpath("//a[contains(text(),'AICTE Approval Letters')]")).click();
    	      Thread.sleep(2000);
    	      System.out.println(w.getCurrentUrl());
    	      w.findElement(By.xpath("//a[contains(text(),'AICTE Approval Letter 2020-21')]")).click();
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[3]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    	      w.findElement(By.xpath("//a[contains(text(),'AICTE Approval Letter 2019-20')]")).click();
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[3]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    	      w.findElement(By.xpath("//a[contains(text(),'Autonomous Status')]")).click();
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[3]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    	      w.findElement(By.xpath("//a[contains(text(),'Audited Statements')]")).click();
    	      Thread.sleep(2000);
    	      System.out.println(w.getCurrentUrl());
    	      w.findElement(By.xpath("//a[contains(text(),'Other Certificates')]")).click();
    	      Thread.sleep(2000);
    	      System.out.println(w.getCurrentUrl());
    	      w.findElement(By.xpath("//a[contains(text(),'Occupancy Certificates')]")).click();
    	      Thread.sleep(2000);
    	      System.out.println(w.getCurrentUrl());
    	      w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[3]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    	      w.findElement(By.xpath("//a[contains(text(),'Fire NOC')]")).click();
    	      Thread.sleep(3000);
    	      System.out.println(w.getCurrentUrl());
    	      w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[3]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    	      
    	         
    	      
    	      
    	      
    	      
    	      
    	      
    	      
    	      /*  Actions Administration = new Actions(w);
    	      Administration.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]"))).perform();
    	      w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]")).click();                       //KMES 
    	      JavascriptExecutor js1= (JavascriptExecutor) w;
    	      js1.executeScript("window.scrollTo(0,500)");
    	      Thread.sleep(2000);
    	      js1.executeScript("window.scrollTo(500,0)");
    	      w.navigate().back();
    	      Administration.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]"))).perform();
    	      w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[2]/a[1]")).click();                        //Management
    	      JavascriptExecutor js2= (JavascriptExecutor) w;
    	      js2.executeScript("window.scrollTo(0,500)");
    	      Thread.sleep(2000);
    	      js2.executeScript("window.scrollTo(500,0)");
    	      w.navigate().back();
    	      Administration.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]"))).perform();
    	      w.findElement(By.xpath("//a[contains(text(),'Heads of the Department')]")).click();                                                                //Head of the department
    	      w.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/img[1]")).click();              //S Padmaja
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();                          //to close the Padmaja page
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]/img[1]")).click();              //sjs Antony
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();                          ////to close the Antony*/
    	    
    	      
    	      
    	   /*  w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();      //About us
    	     Thread.sleep(1000);
    	      w.findElement(By.xpath("//a[contains(text(),'Core Values')]")).click();
    	      Thread.sleep(1000);
    	      w.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[4]/button[1]/div[1]")).click();
    	     
    	      w.switchTo().frame(w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/iframe[1]")));
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/button[2]")).click();
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[3]/div[1]/button[2]")).click();*/
    		  
    	     /* Actions Departments = new Actions(w);
    	      Departments.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]"))).perform();
    	      Actions CSE=new Actions(w);
    	      CSE.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/a[1]"))).perform();
    	      Actions Academics=new Actions(w);
    	      Academics.moveToElement(w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/ul[1]/li[5]/a[1]"))).perform();
    	      w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/ul[1]/li[5]/ul[1]/li[2]/a[1]")).click();
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
    	      Thread.sleep(1000);
    	      w.switchTo().frame(w.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/iframe[1]")));
    	      Thread.sleep(1000);
    	      w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/button[4]")).click();
    	      Thread.sleep(2000);
    	      WebElement scroll = w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[4]"));
    	      scroll.sendKeys(Keys.PAGE_DOWN);
    	      scroll.sendKeys(Keys.PAGE_DOWN);
    	      scroll.sendKeys(Keys.END);
    	      Thread.sleep(1000);
    	      scroll.sendKeys(Keys.PAGE_UP);*/
    	      
    	   
    	      
    	     /* w.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[14]/a[1]")).click();
    	      Thread.sleep(1000);
    	      w.findElement(By.xpath("//body/div[1]/section[1]/div[2]/div[1]/ul[1]/li[5]/a[1]")).click();
    	      Thread.sleep(1000);
    	      w.findElement(By.xpath("//a[contains(text(),'View NAAC Certificate')]")).click();
    	      Thread.sleep(3000);
    	      w.findElement(By.xpath("//body/div[1]/section[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    	      w.findElement(By.xpath("//a[contains(text(),'http://www.naac.gov.in/')]")).click();
    	      w.navigate().back();*/
    	      
    	      
    	      
    	      
    	      
    	     /* w.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[15]/a[1]")).click();
    	      Thread.sleep(1000);
    	      w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/img[1]")).click();
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//body/div[@id='exampleModal']/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    	      w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]/img[1]")).click();
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//body/div[@id='exampleModal']/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    	      w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/a[1]/div[1]/img[1]")).click();
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//body/div[@id='exampleModal']/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
    	      w.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[4]/div[1]/a[1]/div[1]/img[1]")).click();
    	      Thread.sleep(2000);
    	      w.findElement(By.xpath("//body/div[@id='exampleModal']/div[1]/div[1]/div[1]/button[1]/span[1]")).click();*/
    	      
    	      

    	      
    	      

     		
     		
     		
     		
     		
w.quit();
				
	}

}
