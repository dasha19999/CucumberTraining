package utils;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.PageInitializer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

    public class CommonMethods extends PageInitializer {

        public static WebDriver driver;

        public static void openBrowserAndLaunchApplication() {

            ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);


            switch (ConfigReader.getPropertyValue("browser")){
                case "chrome"->{
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }

                case "firefox"-> {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                }

                default-> throw new RuntimeException("Invalid browser name");

            }

            driver.manage().window().maximize();
            driver.get(ConfigReader.getPropertyValue("url"));
            driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);

            initializePageObjects();

            DOMConfigurator.configure("log4j.xml");
            Log.startTest("Test is started");

        }

        public static void closeBrowser() {

            Log.endTest("Test is ended");
            driver.quit();
        }

        public static void sendText(WebElement element, String textToSend) {

            element.clear();
            element.sendKeys(textToSend);

        }


//to get webdriver wait

        public static WebDriverWait createWait() {

            WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_WAIT);

            return wait;
        }

        public static void waitToBeClickable(WebElement element) {

            createWait().until(ExpectedConditions.elementToBeClickable(element));
        }

        public static void waitForVisibility(WebElement element) {

            createWait().until(ExpectedConditions.visibilityOf(element));

        }

        public static void click(WebElement element) {

            waitToBeClickable(element);
            element.click();
        }

        public static void selectDropDown(WebElement element, String text) {

            Select sel = new Select(element);
            sel.selectByVisibleText(text);
        }

        public static void sendTextandEnter(WebElement element, String textToSend) {

            element.clear();
            element.sendKeys(textToSend, Keys.ENTER);

        }

        //to select date from calendar
        public static void selectDateInCalendar(String year, String month, String day) {

            selectDropDown(calendar.selectMonth, month);

            for(WebElement date: calendar.dates) {
                if(date.getText().equals(day)) {
                    waitToBeClickable(date);
                    click(date);
                    break;
                }
            }
        }

        //to input date in the field by hand
        public static void inputDateInCalendar(WebElement field,String year, String month, String day)  {

            sendTextandEnter(addJobDetails.joinedDateInputField, year + "-" + month + "-" + day);
            }



        public static void simpleAlert(WebElement element){
            element.click();
            Alert simpleAlert=driver.switchTo().alert();
            simpleAlert.accept();
        }

        public static void confirmAlert(WebElement element){
        element.click();
        Alert confirmAlert=driver.switchTo().alert();
        confirmAlert.dismiss();
        }

        public static byte[] takeScreenshot(String fileName){
            TakesScreenshot ts = (TakesScreenshot) driver;
            byte[] picBytes = ts.getScreenshotAs(OutputType.BYTES);
            File sourceFile =  ts.getScreenshotAs(OutputType.FILE);

            try {
                FileUtils.copyFile(sourceFile,
                        new File(Constants.SCREENSHOT_FILEPATH + fileName + " " +
                                getTimeStamp("yyyy-MM-dd-HH-mm-ss")+".png"));

            } catch (IOException e) {
                e.printStackTrace();
            }
            return picBytes;
        }

        public static String getTimeStamp(String pattern){
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            return sdf.format(date);
        }

    }
