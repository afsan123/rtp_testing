package pageobjects;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class BrandInformationPage extends Form {
    private final ITextBox brandName = getElementFactory().getTextBox(By.xpath("//input[@id='brand_name']"), "Brand Name");
    private final ITextBox promptBrandName = getElementFactory().getTextBox(By.xpath("//p[contains(., 'brand name')]/strong"), "Prompt Brand Name");
    private final ILabel versionList = getElementFactory().getLabel(By.xpath("(//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 css-1wk30yl']//span)[last()]"), "Version List");

    public BrandInformationPage() {
        super(By.xpath("//h4[contains(text(), 'Brand Information')]"), "Unique Element");
    }

    public String getBrandNameValue() {
        return brandName.getValue().toLowerCase();
    }

    public void clickOnVersions() {
        versionList.clickAndWait();
    }

    public String getPromptBrandNameValue() {
        return promptBrandName.getValue().toLowerCase();
    }
}
