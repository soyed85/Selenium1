import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class TestRunner extends Setup{
    @Test
    public void visitingTheWebsite() throws InterruptedException {
        driver.get("https://www.google.com/");
        //Thread.sleep(5000);
        driver.findElement(By.name("q")).sendKeys("Maven Repository");
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
        Thread.sleep(2000);
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//span[contains(text(),'Check Box')]")).click();
    }
}
