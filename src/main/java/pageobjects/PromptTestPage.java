package pageobjects;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class PromptTestPage extends Form {
    private final IButton socialBrandsBtn = getElementFactory().getButton(By.xpath("//span[text()='Social Brands Setup']"), "Social Brand Setup Button");
    private final IButton brandInformationBtn = getElementFactory().getButton(By.xpath("//button[contains(., 'Brand Information')]"), "Brand Information Button");

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
