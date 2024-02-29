package pageobjects;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class LoginPage extends Form {
    private final ITextBox emailInputField = getElementFactory().getTextBox(By.xpath("//input[@id='email-login']"), "Email Input Field");
    private final ITextBox passwordInputField = getElementFactory().getTextBox(By.xpath("//input[@id='-password-login']"), "Password Input Field");
    private final IButton loginButton = getElementFactory().getButton(By.xpath("//button[text()='Login']"), "Login Button");
    public LoginPage() {
        super(By.xpath("//h3[contains(text(), 'Login')]"), "Login Page's Unique Element");
    }

    public void enterEmail(String email) {
        emailInputField.clearAndType(email);
    }

    public void enterPassword(String password) {
        passwordInputField.clearAndType(password);
    }

    public void clickOnLoginButton() {
        loginButton.clickAndWait();
    }
}
