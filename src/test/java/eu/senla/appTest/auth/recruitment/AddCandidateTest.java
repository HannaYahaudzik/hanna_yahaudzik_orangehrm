package eu.senla.appTest.auth.recruitment;

import eu.senla.entities.Candidate;
import eu.senla.enums.SidepanelMenu;
import eu.senla.general.BaseTest;
import eu.senla.pages.auth.recruitment.RecruitmentPage;
import eu.senla.pages.auth.recruitment.addCandidate.AddCandidatePage;
import eu.senla.pages.auth.recruitment.candidateProfile.CandidateProfilePage;
import eu.senla.utilities.GenerateFakeEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("addCandidate")
@DisplayName("Проверка формы добавления кандидата")
public class AddCandidateTest extends BaseTest {

    private AddCandidatePage openPage() {
        return ((RecruitmentPage) login()
                .getSidepanelPage()
                .clickMenu(SidepanelMenu.RECRUITMENT))
                .clickToAddButton();
    }

    @Test
    @Tags(value = {@Tag("smoke")})
    @DisplayName("Проверка создания кандидата при валидном заполнении только обязательных полей")
    public void addCandidatesWithRequiredFields() {
        Candidate candidate = GenerateFakeEntity.getCandidateRequiredFieldOnly();

        CandidateProfilePage candidateProfilePage = openPage()
                .submitAddCandidateForm(candidate);

        Assertions.assertAll(
                () -> assertEquals(candidate.getFirstName(), candidateProfilePage.getFirstNameValue(),
                        "First name doesn't equal an expected value."),
                () -> assertEquals(candidate.getLastName(), candidateProfilePage.getLastNameValue(),
                        "Last name doesn't equal an expected value."),
                () -> assertEquals(candidate.getEmail(), candidateProfilePage.getEmailValue(),
                        "Email doesn't equal an expected value.")
        );
    }

    @Test
    @DisplayName("Проверка создания кандидата при валидном заполнении всех полей")
    public void addCandidateWithAllFields() {
        Candidate candidate = GenerateFakeEntity.getCandidateAllArgs();

        CandidateProfilePage candidateProfilePage = openPage()
                .submitAddCandidateWithAllArgs(candidate);

        Assertions.assertAll(
                () -> assertEquals(candidate.getFirstName(), candidateProfilePage.getFirstNameValue(),
                        "First name doesn't equal an expected value."),
                () -> assertEquals(candidate.getMiddleName(), candidateProfilePage.getMiddleNameValue(),
                        "First name doesn't equal an expected value."),
                () -> assertEquals(candidate.getLastName(), candidateProfilePage.getLastNameValue(),
                        "Last name doesn't equal an expected value."),
                () -> assertEquals(candidate.getEmail(), candidateProfilePage.getEmailValue(),
                        "Email doesn't equal an expected value."),
                () -> assertEquals(candidate.getContactNumber(), candidateProfilePage.getContactNumberValue(),
                        "Contact number doesn't equal an expected value."),
                () -> assertEquals(candidate.getKeywords(), candidateProfilePage.getKeywordsValue(),
                        "Keywords don't equal an expected value.")
        );
    }
}
