package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_COOKIES = "//button[@class=\"_42ft _4jy0 _9xo7 _4jy3 _4jy1 selected _51sy\"]";
    public static final String XPATH_CREATE_ACCOUNT = "//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]";
    public static final String XPATH_DAY = "//select[@class=\"_9407 _5dba _9hk6 _8esg\"]";
    public static final String XPATH_WAIT_FOR = "//div[@class=\"_8fgl _9l2p\"]";
    public static final String XPATH_DAY2 = "//select[1]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");

        WebElement cookies = driver.findElement(By.xpath(XPATH_COOKIES));
        cookies.click();

        WebElement create = driver.findElement(By.xpath(XPATH_CREATE_ACCOUNT));
        create.click();

        while (!driver.findElement(By.xpath(XPATH_DAY2)).isDisplayed());

        WebElement selectDay = driver.findElement(By.xpath(XPATH_DAY2));
        Select day = new Select(selectDay);
        day.selectByValue("1");
    }
}
