import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.*;



public class main {
	private static final int delay = 0;

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Eclipde workspace\\Ticket\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");//open browser with incognition window
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		
		WebDriver driver = new ChromeDriver(capabilities);

		driver.manage().window().maximize();

		//driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

		// driver.get("https://www.famiticket.com.tw/activity_info.aspx?code=1901Z04001");

		driver.get("https://sunshine.dengeki.com/vote/invms7xycvmx/");

		
		driver.findElement(By.xpath("//*[@id=\"form_girl1_title\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"form_girl1_child\"]/ul/li[7]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"form_age\"]")).sendKeys((int)(Math.random()*30+20)+"");//random age
		driver.findElement(By.xpath("//*[@id=\"form_sumai_title\"]")).click();
		
		String residence = (int)(Math.random()*47+1)+"";
		driver.findElement(By.xpath("//*[@id=\"form_sumai_child\"]/ul/li["+residence+"]")).click();//random region in japan
		
		
		
		String[] name = {"あ","か","さ","た","な","は","ま","や","ら","わ","ん",
				         "い","き","し","ち","に","ひ","み","り",
				         "う","く","す","つ","ぬ","ふ","む","ゆ","る",
				         "え","け","せ","て","ね","へ","め","れ",
				         "お","こ","そ","と","の","ほ","も","よ","ろ","を",
				         "が","ざ","だ","ば","ぱ",
				         "ぎ","じ","ぢ","び","ぴ",
				         "ぐ","ず","づ","ぶ","ぷ",
				         "げ","ぜ","で","べ","ぺ",
				         "ご","ぞ","ど","ぼ","ぽ",
				         "きゃ","しゃ","ちゃ","にゃ","ひゃ","みゃ","りゃ","ぎゃ","じゃ","びゃ","ぴゃ",
				         "きゅ","しゅ","ちゅ","にゅ","ひゅ","みゅ","りゅ","ぎゅ","じゅ","びゅ","ぴゅ",
				         "きょ","しょ","ちょ","にょ","ひょ","みょ","りょ","ぎょ","じょ","びょ","ぴょ"}; //random rame
		
		driver.findElement(By.xpath("//*[@id=\"form_name\"]")).sendKeys(name[(int)(Math.random()*108+0)]+name[(int)(Math.random()*108+0)]);
		
		driver.findElement(By.xpath("//*[@id=\"form_gender_title\"]")).click();
		Thread.sleep(300);
		driver.findElement(By.xpath("//*[@id=\"form_gender_child\"]/ul/li[2]")).click();
		//https://jzchangmark.wordpress.com/2015/03/16/selenium-%E4%BD%BF%E7%94%A8-css-locator-%E5%AE%9A%E4%BD%8D%E5%85%83%E4%BB%B6/
	}

}
