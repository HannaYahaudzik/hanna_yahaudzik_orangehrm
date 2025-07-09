package eu.senla.auth.recruitment;

import eu.senla.entity.Candidate;
import eu.senla.enums.SidepanelMenu;
import eu.senla.general.BaseTest;
import eu.senla.pageObject.LoginPage;
import eu.senla.pageObject.auth.recruitment.RecruitmentPage;
import eu.senla.pageObject.auth.recruitment.candidateProfile.CandidateProfilePage;
import eu.senla.utilities.GenerateFakeEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

@Tag("addCandidate")
@DisplayName("Проверка формы добавления кандидата")
public class AddCandidateTest extends BaseTest {

    @Test
    @Tags(value = {@Tag("smoke")})
    @DisplayName("Проверка создания кандидата при валидном заполнении только обязательных полей")
    public void addCandidatesWithRequiredFields() {
        Candidate candidate = GenerateFakeEntity.getCandidateRequiredFieldOnly();
        CandidateProfilePage candidateProfilePage = ((RecruitmentPage)
                new LoginPage()
                        .loginValidUser()
                        .getSidepanelPage()
                        .clickMenu(SidepanelMenu.RECRUITMENT))
                .clickToAddButton()
                .submitAddCandidateForm(candidate);

        Assertions.assertAll(
                () -> Assertions.assertEquals(candidate.getFirstName(), candidateProfilePage.getFirstNameValue(),
                        "First name doesn't equal an expected value."),
                () -> Assertions.assertEquals(candidate.getLastName(), candidateProfilePage.getLastNameValue(),
                        "Last name doesn't equal an expected value."),
                () -> Assertions.assertEquals(candidate.getEmail(), candidateProfilePage.getEmailValue(),
                        "Email doesn't equal an expected value.")
        );
    }

    @Test
    @DisplayName("Проверка создания кандидата при валидном заполении всех полей")
    public void addCandidateWithAllFields() {
        Candidate candidate = GenerateFakeEntity.getCandidateAllArgs();
        CandidateProfilePage candidateProfilePage = ((RecruitmentPage)
                new LoginPage()
                        .loginValidUser()
                        .getSidepanelPage()
                        .clickMenu(SidepanelMenu.RECRUITMENT))
                .clickToAddButton()
                .submitAddCandidateWithAllArgs(candidate);


        Assertions.assertAll(
                () -> Assertions.assertEquals(candidate.getFirstName(), candidateProfilePage.getFirstNameValue(),
                        "First name doesn't equal an expected value."),
                () -> Assertions.assertEquals(candidate.getMiddleName(), candidateProfilePage.getMiddleNameValue(),
                        "First name doesn't equal an expected value."),
                () -> Assertions.assertEquals(candidate.getLastName(), candidateProfilePage.getLastNameValue(),
                        "Last name doesn't equal an expected value."),
                () -> Assertions.assertEquals(candidate.getEmail(), candidateProfilePage.getEmailValue(),
                        "Email doesn't equal an expected value."),
                () -> Assertions.assertEquals(candidate.getContactNumber(), candidateProfilePage.getContactNumberValue(),
                        "Contact number doesn't equal an expected value."),
                () -> Assertions.assertEquals(candidate.getKeywords(), candidateProfilePage.getKeywordsValue(),
                        "Keywords don't equal an expected value.")
        );
    }
}
