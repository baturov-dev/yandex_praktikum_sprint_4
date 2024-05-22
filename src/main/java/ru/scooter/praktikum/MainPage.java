package ru.scooter.praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private final WebDriver driver;

    public static final String PAGE_URL = "https://qa-scooter.praktikum-services.ru/";

    private final static By HEAD_ORDER_BUTTON = By.xpath(".//button[@class='Button_Button__ra12g']"); // Кнопка "Заказать"  сверху страницы
    private final static By CENTRAL_ORDER_BUTTON = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']"); //Кнопка "Заказать" в центре страницы
    private final static By STATUS_ORDER_BUTTON = By.xpath(".//button[@class='Header_Link__1TAG7']"); // кнопка "Статус заказа"
    private final static By QUESTIONS_HEAD_0 = By.id("accordion__heading-0");
    private final static By QUESTIONS_HEAD_1 = By.id("accordion__heading-1");
    private final static By QUESTIONS_HEAD_2 = By.id("accordion__heading-2");
    private final static By QUESTIONS_HEAD_3 = By.id("accordion__heading-3");
    private final static By QUESTIONS_HEAD_4 = By.id("accordion__heading-4");
    private final static By QUESTIONS_HEAD_5 = By.id("accordion__heading-5");
    private final static By QUESTIONS_HEAD_6 = By.id("accordion__heading-6");
    private final static By QUESTIONS_HEAD_7 = By.id("accordion__heading-7");

    private final static By QUESTIONS_TEXT_0 = By.id("accordion__panel-0");
    private final static By QUESTIONS_TEXT_1 = By.id("accordion__panel-1");
    private final static By QUESTIONS_TEXT_2 = By.id("accordion__panel-2");
    private final static By QUESTIONS_TEXT_3 = By.id("accordion__panel-3");
    private final static By QUESTIONS_TEXT_4 = By.id("accordion__panel-4");
    private final static By QUESTIONS_TEXT_5 = By.id("accordion__panel-5");
    private final static By QUESTIONS_TEXT_6 = By.id("accordion__panel-6");
    private final static By QUESTIONS_TEXT_7 = By.id("accordion__panel-7");
    private final static By COOKIE_BUTTON = By.id("rcc-confirm-button"); // кнопка куки "да все привыкли"

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public void open() {
        driver.get(PAGE_URL);
    }
    public void clickHeadOrderButton(){
        driver.findElement(HEAD_ORDER_BUTTON).click();
    }

    public void clickCentralOrderButton(){
        driver.findElement(CENTRAL_ORDER_BUTTON).click();
    }

    public void clickStatusOrderButton(){
        driver.findElement(STATUS_ORDER_BUTTON).click();
    }

    public void clickCookieButton(){
        driver.findElement(COOKIE_BUTTON).click();
    }

    public void clickElement (By element){
        driver.findElement(element).click();
    }
    public void clickElement0() {
        driver.findElement(QUESTIONS_HEAD_0).click();
    }
    public void clickElement1() {
        driver.findElement(QUESTIONS_HEAD_1).click();
    }
    public void clickElement2() {
        driver.findElement(QUESTIONS_HEAD_2).click();
    }
    public void clickElement3() {
        driver.findElement(QUESTIONS_HEAD_3).click();
    }
    public void clickElement4() {
        driver.findElement(QUESTIONS_HEAD_4).click();
    }
    public void clickElement5() {
        driver.findElement(QUESTIONS_HEAD_5).click();
    }
    public void clickElement6() {
        driver.findElement(QUESTIONS_HEAD_6).click();
    }
    public void clickElement7() {
        driver.findElement(QUESTIONS_HEAD_7).click();
    }
    public String getText0() {
        return driver.findElement(QUESTIONS_TEXT_0).getText();
    }
    public String getText1() {
        return driver.findElement(QUESTIONS_TEXT_1).getText();
    }
    public String getText2() {
        return driver.findElement(QUESTIONS_TEXT_2).getText();
    }
    public String getText3() {
        return driver.findElement(QUESTIONS_TEXT_3).getText();
    }
    public String getText4() {
        return driver.findElement(QUESTIONS_TEXT_4).getText();
    }
    public String getText5() {
        return driver.findElement(QUESTIONS_TEXT_5).getText();
    }
    public String getText6() {
        return driver.findElement(QUESTIONS_TEXT_6).getText();
    }
    public String getText7() {
        return driver.findElement(QUESTIONS_TEXT_7).getText();
    }

    public void scrollDown(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(CENTRAL_ORDER_BUTTON));
    }
}