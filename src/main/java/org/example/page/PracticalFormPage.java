package org.example.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class PracticalFormPage {
    protected WebDriver driver;
    public PracticalFormPage(WebDriver driver) {
        this.driver = driver;
    }
    public void fillInFirstName(String firstName) {
        WebElement firstNameInput = driver.findElement(By.id("firstName"));
        firstNameInput.sendKeys(firstName);
    }
    public void fillInLastName(String lastName) {
        WebElement lastNameInput = driver.findElement(By.id("lastName"));
        lastNameInput.sendKeys(lastName);
    }
    public void fillInEmail(String email) {
        WebElement emailInput = driver.findElement(By.id("userEmail"));
        emailInput.sendKeys(email);
    }
    public void fillInGender(String gender) {
        WebElement genderMaleInput = driver.findElement(By.xpath("//label[text()='" + gender + "']"));
        genderMaleInput.click();
    }
    public void fillInMobile(String mobile) {
        WebElement mobileInput = driver.findElement(By.id("userNumber"));
        mobileInput.sendKeys(mobile);
    }
    public void fillInDateOfBirth(String day ,int month,String year){
        driver.findElement(By.id("dateOfBirthInput")).click();
        Select MonthSelect = new Select(driver.findElement(By.className("react-datepicker__month-select")));
        MonthSelect.selectByIndex(month-1);
        Select YearSelect = new Select(driver.findElement(By.className("react-datepicker__year-select")));
        YearSelect.selectByValue(year);
        driver.findElement(By.className("react-datepicker__day--0"+day)).click();
    }
    public void fillInCurrentAddress(String currentAddress) {
        WebElement currentAddressInput = driver.findElement(By.id("currentAddress"));
        currentAddressInput.sendKeys(currentAddress);
    }
    public void SubmitForm() {
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
    }
}
