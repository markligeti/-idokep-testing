package com.codecool.idokep.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class Modal extends Page {

    @FindBy(id = "close-panel")
    WebElement closeButton;

    @FindBy(css = "#lightbox-panel input[type='submit']")
    WebElement submitButton;

    public Modal(WebDriver driver) {
        super(driver);
    }

    protected void fillInput(WebElement field, String inputText) {
        field.sendKeys(inputText);
    }

    protected void submitModal() {
        submitButton.click();
    }

    protected void selectCheckbox(WebElement checkbox) {
        if (!checkbox.isSelected()) checkbox.click();
    }

    protected void unSelectCheckbox(WebElement checkbox) {
        if (checkbox.isSelected()) checkbox.click();
    }

}
