package pageobjects;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElement;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class ConsoleDashboardPage extends Form {
    private final ILabel activeDashboardDropdown = getElementFactory().getLabel(By.xpath("//div[contains(@class, 'css-f0ja12') and contains(., 'Active Dashboard')]"), "Active Dashboard Dropdown");
    private final IButton changeDashBoard = getElementFactory().getButton(By.xpath("//button[contains(@class, 'css-1i5nkco')]"), "Dashboard Option");
    private final IButton promptTestAccessButton = getElementFactory().getButton(By.xpath("//*[@id=\"root\"]/div[2]/main/div[2]/div[1]/div/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[10]/div[2]/button"), "Prompt Test Access Button");

    public ConsoleDashboardPage() {
        super(By.xpath("//div[@class=css-19bb58m]/input[@id=react-select-4-input]"), "Console Dashboard Page's Unique Element");
    }

    public void clickOnActiveDashboardDropdown() {
        activeDashboardDropdown.clickAndWait();
    }

    public void changeActiveDashboard() {
        changeDashBoard.clickAndWait();
    }

    public void accessPromptTest() {
        promptTestAccessButton.state().waitForDisplayed();
        promptTestAccessButton.clickAndWait();
    }
}
