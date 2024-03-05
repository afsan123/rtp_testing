package pageobjects;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class PromptTestPage extends Form {
    private final IButton socialBrandsBtn = getElementFactory().getButton(By.xpath("//span[text()='Social Brands Setup']"), "Social Brand Setup Button");
    private final IButton brandInformationBtn = getElementFactory().getButton(By.xpath("//button[contains(., 'Brand Information')]"), "Brand Information Button");
    private final ITextBox brandName = getElementFactory().getTextBox(By.xpath("//input[@id='brand_name']"), "Brand Name");
    private final ITextBox promptBrandName = getElementFactory().getTextBox(By.xpath("//p[contains(., 'brand name')]/strong"), "Prompt Brand Name");
    private final ILabel versionList = getElementFactory().getLabel(By.xpath("(//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 css-1wk30yl']//span)[last()]"), "Version List");

    public PromptTestPage() {
        super(By.xpath("//span[text()='Social Brands Setup']"), " Prompt Test Page Unique Element");
    }

    public void clickOnSocialBrandSetupBtn() {
        socialBrandsBtn.clickAndWait();
    }

    public void clickOnBrandInfoTab() {
        brandInformationBtn.clickAndWait();
    }

}
