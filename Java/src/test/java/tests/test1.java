package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
    public static void main(String[] args) {
        // Texbox Testi
        /*System.setProperty("webdriver.chrome.driver","C:/Users/msı/Desktop/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.click();
        fullName.sendKeys("Ahmet");

        WebElement email = driver.findElement(new By.ByCssSelector(".mr-sm-2[id='userEmail']"));
        email.click();
        email.sendKeys("ahmet@gmail.com");

        WebElement currentAdress = driver.findElement(new By.ByCssSelector(".form-control[placeHolder='Current Address']"));
        currentAdress.click();
        currentAdress.sendKeys("İzmir");

        WebElement permanentAdress = driver.findElement(By.id("permanentAddress"));
        permanentAdress.click();
        permanentAdress.sendKeys("Buca , Turkey");

        WebElement submitButton = driver.findElement(new By.ByCssSelector("button.btn"));
        submitButton.click();

        WebElement nameEntered = driver.findElement(By.xpath("//div/p[@id='name']"));
        String name = nameEntered.getText();
        System.out.println(name);*/

        // Checkbox Testi
        /*System.setProperty("webdriver.chrome.driver","C:/Users/msı/Desktop/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();

        String homeCheckBoxCssValue = "label[for='tree-node-home'] span.rct-checkbox svg";
        WebElement homeCheckbox = driver.findElement(new By.ByCssSelector(homeCheckBoxCssValue));
        homeCheckbox.click();


        homeCheckbox = driver.findElement(new By.ByCssSelector(homeCheckBoxCssValue));
        String homeCheckboxClassName = homeCheckbox.getAttribute("class");
        if (homeCheckboxClassName.equals("rct-icon rct-icon-check"))
        {
            System.out.println("Checkbox is checked!!");
        }
        else{
            System.out.println("Checkbox is unchecked!!");
        }*/

        // Form Testi
        System.setProperty("webdriver.chrome.driver","C:/Users/msı/Desktop/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        WebElement sportCheckbox =driver.findElement(By.id("hobbies-checkbox-1"));
        boolean isEnabled = sportCheckbox.isEnabled(); // tıklanıp tıklanmadığpına bakıyor
        System.out.println(isEnabled);
        WebElement sportCheckboxLabel = driver.findElement(new By.ByCssSelector("label[for='hobbies-checkbox-1']"));
        if (isEnabled == true) {
            try {
                System.out.println("entered try block");
                sportCheckbox.click();
            }catch (ElementClickInterceptedException e){
                sportCheckboxLabel.click();
                System.out.println("entered catch block");
            }
        }
        else{
            System.out.println("It is not Enabled!!");
        }
        boolean isSelected = sportCheckbox.isSelected();
        if (isSelected == true) {
            System.out.println("secili");
        }
        else{
            System.out.println("secili değil!!");
        }
    }
}
