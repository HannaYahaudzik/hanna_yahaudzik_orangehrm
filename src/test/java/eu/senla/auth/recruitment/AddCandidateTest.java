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
    @DisplayName("Проверка заполнения формы добавления кандидата")
    public void addCandidates() {
        Candidate candidate = GenerateFakeEntity.getCandidate();
        CandidateProfilePage candidateProfilePage = ((RecruitmentPage)
                new LoginPage()
                        .loginValidUser()
                        .getSidepanelPage()
                        .clickMenu(SidepanelMenu.RECRUITMENT))
                .clickToAddButton()
                .addCandidate(candidate);

        Assertions.assertAll(
                () -> Assertions.assertEquals(candidate.getFirstName(), candidateProfilePage.getFirstNameValue(),
                        "First name doesn't equal an expected value."),
                () -> Assertions.assertEquals(candidate.getLastName(), candidateProfilePage.getLastNameValue(),
                        "Last name doesn't equal an expected value."),
                () -> Assertions.assertEquals(candidate.getEmail(), candidateProfilePage.getEmailValue(),
                        "Email doesn't equal an expected value.")
        );
    }
}
