package org.example.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

import javax.swing.plaf.PanelUI;

import static org.openqa.selenium.support.ui.ExpectedConditions.attributeContains;

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
    public void fillInCurrentAddress(String currentAddress) {
        WebElement currentAddressInput = driver.findElement(By.id("currentAddress"));
        currentAddressInput.sendKeys(currentAddress);
    }
    public void SubmitForm() {
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
    }
}
