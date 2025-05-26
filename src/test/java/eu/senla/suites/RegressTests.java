package eu.senla.suites;

import eu.senla.LoginTest;
import eu.senla.adminPage.addEmployee.AddEmployeeTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({LoginTest.class, AddEmployeeTest.class})
public class RegressTests {
}
