package eu.senla.pageObject.login.homePage.pimPage;

import eu.senla.wait.Wait;
import org.openqa.selenium.By;

public class AddEmployeePage {

  private final By firstNameBy = By.name("firstName");
  private final By middleNameBy = By.name("middleName");
  private final By lastNameBy = By.name("lastName");
  private final By saveButtonBy = By.xpath(".//button[text()=' Save ']");

  public PersonalDetailPage fillAddEmployeeForm(
      String firstname, String middlename, String lastname) {
    Wait.waitVisibilityOfElementLocated(firstNameBy).sendKeys(firstname);
    Wait.waitVisibilityOfElementLocated(middleNameBy).sendKeys(middlename);
    Wait.waitVisibilityOfElementLocated(lastNameBy).sendKeys(lastname);
    Wait.waitVisibilityOfElementLocated(saveButtonBy).click();
    return new PersonalDetailPage();
  }
}
