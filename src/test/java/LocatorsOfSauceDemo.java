import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LocatorsOfSauceDemo {
WebDriver driver;
WebElement className = driver.findElement(By.className("input_error"));
WebElement tagname = driver.findElement(By.tagName("form"));
WebElement linktext = driver.findElement(By.linkText("LinkedIn"));
WebElement partiallinktext = driver.findElement(By.partialLinkText("Bolt T-Shirt"));
//xpath
WebElement attribute = driver.findElement(By.xpath("//input[@type='submit']"));
WebElement text = driver.findElement(By.xpath("//span[text()='Products']"));
WebElement containsAttr = driver.findElement(By.xpath("//div[contains(@class, 'shopping')]"));
WebElement containsText = driver.findElement(By.xpath("//div[contains(text(),'Bike')]"));
WebElement ancestor = driver.findElement(By.xpath("//a[@target='_blank']/ancestor:: ul[@class='social']"));
WebElement parent = driver.findElement(By.xpath("//a[@target='_blank']/parent::li"));
WebElement and = driver.findElement(By.xpath("//input[@class='input_error form_input error' and @type='text']"));
//css
WebElement idCSS = driver.findElement(By.cssSelector("#login-button"));
WebElement classCSS = driver.findElement(By.cssSelector(".login_logo"));
WebElement tagNameCSS = driver.findElement(By.cssSelector("form svg"));
//WebElement attribute1CSS = driver.findElement(By.cssSelector("class^='submit'");
//WebElement attribute2CSS = driver.findElement(By.cssSelector("class$='action'");
//WebElement attribute3CSS = driver.findElement(By.cssSelector("class*='btn'"));
WebElement childFirstCSS = driver.findElement(By.cssSelector("#login_button_container > div:first-child"));
WebElement childNthCSS = driver.findElement(By.cssSelector("div.inventory_list > div:nth-child(4)"));
}
